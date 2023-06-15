package Steps;

import Pages.SwoopHomePage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;


public class HomePageSteps {
    public SwoopHomePage homePage = new SwoopHomePage();
    @Step("Click Dasveneba Button")
    public HomePageSteps ClickDasvnebaButton(){
        homePage.dasvenebaButton.click();
        return this;
    }
    @Step("Click Categories Button")
    public HomePageSteps ClickCategoriesButton(){
        homePage.categoriesButton.click();
        return this;
    }
    @Step("Hover on Kveba category")
    public HomePageSteps HoverOnKveba(){
        homePage.kvebaCategory.hover();
        return this;
    }
    @Step("Select Sushi")
    public HomePageSteps SelectSushi(){
        homePage.sushiButton.shouldBe(Condition.appear);
        homePage.sushiButton.click();
        return this;
    }
    @Step("Click Login Button")
    public HomePageSteps ClickLoginButton(){
        homePage.LoginButton.click();
        return this;
    }

}
