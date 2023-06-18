package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;

public class SelectedOfferPage {
    public SelenideElement ShareButton = $(byClassName("share"));

}
