import Steps.FacebookLoginPageSteps;
import Steps.HomePageSteps;
import Steps.SelectedOfferPageSteps;
import Steps.SushiPageSteps;
import com.codeborne.selenide.testng.SoftAsserts;
import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({ SoftAsserts.class})
@Epic("Swoop 'Kveba' Category tests")
@Feature("Sharing on Facebook functionality test")
public class TestMethodFour extends BaseTestStrictAssert {

    public HomePageSteps homePageSteps = new HomePageSteps();
    public SushiPageSteps sushiPageSteps = new SushiPageSteps();
    public SelectedOfferPageSteps selectedOfferPageSteps = new SelectedOfferPageSteps();
    public FacebookLoginPageSteps Facebook = new FacebookLoginPageSteps();

    @Test(groups = {"Regression2"})
    @Description("Visit the 'Sushi' Category under 'Kveba' and checks Sharing on Facebook functionality")
    @Story("Test Method 4")
    void TestMethodFourBody(){

        homePageSteps.ClickCategoriesButton().HoverOnKveba().SelectSushi();
        sushiPageSteps.ClickFirstOffer();
        selectedOfferPageSteps.ClickShare();
        Facebook.CheckFacebookLoginPageWindow();

    }
}