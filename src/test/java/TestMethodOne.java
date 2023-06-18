import Data.SwoopTestData;
import Steps.DasvenebaPageSteps;
import Steps.HomePageSteps;
import com.codeborne.selenide.testng.SoftAsserts;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners({ SoftAsserts.class})
@Epic("Swoop 'Dasveneba' Category tests")
@Feature("Price Filter functionality test")
public class TestMethodOne extends BaseTestStrictAssert {

    public SwoopTestData data = new SwoopTestData();
    public HomePageSteps homePageSteps = new HomePageSteps();
    public DasvenebaPageSteps dasvenebaPageSteps = new DasvenebaPageSteps();


    @Test(groups = {"Regression1"})
    @Description("Vist 'Dasveneba' Category on Swoop and test Price Filter functionality")
    @Story("Test Method 1")
    void TestMethodOneBody(){

        homePageSteps.ClickDasvnebaButton();
        dasvenebaPageSteps.InputPriceRangeFilter(data.FilterMinPrice, data.FilterMaxPrice).ConfirmFilter().CheckPriceRangeOfOffers(data.FilterMinPrice, data.FilterMaxPrice);

    }
}