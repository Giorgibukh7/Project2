package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class SwoopHomePage {

    public SelenideElement dasvenebaButton = $(byLinkText("დასვენება"));
    public SelenideElement categoriesButton = $(byClassName("categoriesTitle"));

    public SelenideElement kvebaCategory = $(byLinkText("კვება"));

    public SelenideElement sushiButton = $(byLinkText("სუში"));

    public SelenideElement LoginButton = $(byText("შესვლა"));

}