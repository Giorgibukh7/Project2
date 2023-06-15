package Steps;

import Pages.FacebookLoginPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.switchTo;

public class FacebookLoginPageSteps {

    FacebookLoginPage page = new FacebookLoginPage();
    @Step("Check If Facebook Login window is present")
    public FacebookLoginPageSteps CheckFacebookLoginPageWindow(){
        switchTo().window("Facebook", Duration.ofMillis(300));
        page.FacebookPage.shouldBe(Condition.visible);
        switchTo().window(0);
        return this;
    }
}
