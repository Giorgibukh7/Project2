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
@Feature("Sorting by 'Price Decreasing' functionality Test")
public class TestMethodThree extends BaseTestStrictAssert {

    public HomePageSteps homePageSteps = new HomePageSteps();
    public SushiPageSteps sushiPageSteps = new SushiPageSteps();

    @Test(groups = {"Regression2"})
    @Description("Visit the 'Kveba' Category on Swoop and test Sorting by 'Price Decreasing' functionality")
    @Story("Test Method 3")
    void TestMethodThreeBody() {

        homePageSteps.ClickCategoriesButton().HoverOnKveba().SelectSushi();
        sushiPageSteps.SelectSortingOrderPriceDecreasing().CheckSortOrderPriceDecreasing();

    }
}