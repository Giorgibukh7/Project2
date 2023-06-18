package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class FacebookLoginPage {
    public SelenideElement FacebookPage = $(byId("facebook"));
}
