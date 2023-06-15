package Steps;

import Pages.DasvenebaPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;

import static com.codeborne.selenide.Selectors.*;

public class DasvenebaPageSteps {
    DasvenebaPage page = new DasvenebaPage();
    @Step("Set Price Range Filter")
   public DasvenebaPageSteps InputPriceRangeFilter(int minPrice,int maxPrice){


        page.filterMinPrice.sendKeys(String.valueOf(minPrice));
        page.filterMaxPrice.sendKeys(String.valueOf(maxPrice));

       return this;
    }
    @Step("Confirm Filter")
    public DasvenebaPageSteps ConfirmFilter(){
        page.confirmFilterButton.click();
       return this;
    }
    @Step("Check Price Range Of Returned Offers")
    public DasvenebaPageSteps CheckPriceRangeOfOffers(int minPrice,int maxPrice){

        page.freezeObject.shouldNotBe(Condition.visible);
        page.offers.stream().forEach(offer -> {

            String priceString = offer.$(byClassName("discounted-prices")).$(byClassName("deal-voucher-price")).getText();
            String FilteredPriceString = priceString.replaceAll("₾","");
            Integer intPrice =  Integer.valueOf(FilteredPriceString);

            if(intPrice > minPrice){
                if(intPrice < maxPrice){}
                else{
                    Assert.fail("Offers Are Not In The Specified Price Range");
                }
            }
            else{
                Assert.fail("Offers Are Not In The Specified Price Range");
            }
        });
       return this;
    }
}
