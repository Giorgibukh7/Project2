package Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.*;

public class SushiPage {
    public ElementsCollection offers = $$(byClassName("special-offer"));
    public SelenideElement loginPage = $(byClassName("main-page-login"));
    public SelenideElement sortSelect = $(byId("sort"));
}
