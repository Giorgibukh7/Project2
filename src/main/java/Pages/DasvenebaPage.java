package Pages;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.*;

public class DasvenebaPage {

    public SelenideElement priceRangeInput = $$(byClassName("price-inputs")).get(1);
    public SelenideElement filterMinPrice = priceRangeInput.$(byId("minprice"));
    public SelenideElement filterMaxPrice = priceRangeInput.$(byId("maxprice"));
    public SelenideElement confirmFilterButton = $$(byClassName("submit-button")).get(1);
    public ElementsCollection offers = $$(byClassName("special-offer"));
    public SelenideElement freezeObject = $(byClassName("freeze"));


}