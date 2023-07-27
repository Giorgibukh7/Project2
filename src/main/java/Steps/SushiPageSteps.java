package Steps;

import Pages.SushiPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byTagName;

public class SushiPageSteps {
    SushiPage page = new SushiPage();
    @Step("Wishlist First Offer")
   public SushiPageSteps WishlistFirstOffer(){
        page.offers.first().$(byClassName("deal-basket-wishlist")).click();
        return this;
    }
    @Step("Check Presence Of Login Page")
    public SushiPageSteps CheckPresenceOfLoginPage(){
       page.loginPage.shouldBe(Condition.visible);
       return this;
    }
    @Step("Check if first offer is not sold out")
    public SushiPageSteps CheckAvailabilityOfFirstOffer(){
       page.offers.first().$(byClassName("voucher-diagram")).$(byTagName("div")).shouldNotHave(Condition.attribute("style","width: 100%;"));
       return this;
    }
    @Step("Click First Offer from returned list")
    public SushiPageSteps ClickFirstOffer(){
       page.offers.first().click();
       return this;
    }
    @Step("Select Sorting Order 'Price Decreasing'")
    public SushiPageSteps SelectSortingOrderPriceDecreasing(){
       page.sortSelect.selectOption("ფასით კლებადი");
       return this;
    }
    public Integer getOfferPrice(int index){
       String priceString = page.offers.get(index).$(byClassName("discounted-prices")).$(byClassName("deal-voucher-price")).getText();
       String FilteredPriceString = priceString.replaceAll("₾","");
       return Integer.valueOf(FilteredPriceString);

    }
    @Step("Check Sort Order is 'Price Decreasing'")
    public SushiPageSteps CheckSortOrderPriceDecreasing(){
        page.freezeObject.shouldNotBe(Condition.visible);
    if( getOfferPrice(0) > getOfferPrice(1) ){}
    else{
        Assert.fail("Offers Are Not Sorted By 'Price Decreasing'");
    }
return this;
    }
}
