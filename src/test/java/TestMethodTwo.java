import Steps.HomePageSteps;
import Steps.SushiPageSteps;
import com.codeborne.selenide.testng.SoftAsserts;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({ SoftAsserts.class})
@Epic("Swoop 'Kveba' Category tests")
@Feature("Wishlist Functionality test")
public class TestMethodTwo extends BaseTestStrictAssert {

    public HomePageSteps homePageSteps = new HomePageSteps();
    public SushiPageSteps sushiPageSteps = new SushiPageSteps();
    @Test(groups = {"Regression1"})
    @Description("Visit the 'Kveba' category and check Wishlist-ing functionality,also checks if the first offer is not sold out")
    @Story("Test Method 2")
    void TestMethodTwoBody(){

        homePageSteps.ClickCategoriesButton().HoverOnKveba().SelectSushi();
        sushiPageSteps.WishlistFirstOffer().CheckPresenceOfLoginPage().CheckAvailabilityOfFirstOffer();

    }
}