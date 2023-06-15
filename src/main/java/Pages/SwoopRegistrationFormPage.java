package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class SwoopRegistrationFormPage {
    public SelenideElement RegisterButton = $(byClassName("register"));

    public SelenideElement FirstNameField = $(byId("pFirstName"));
    public SelenideElement LastNameField = $(byId("pLastName"));
    public SelenideElement PhoneField = $(byId("pPhone"));
    public SelenideElement EmailField = $(byId("pEmail"));
    public SelenideElement DateBirthSelector = $(byId("pDateBirth"));
    public SelenideElement PasswordField = $(byId("pPassword"));
    public SelenideElement ConfirmPasswordField = $(byId("pConfirmPassword"));
    public SelenideElement ConfrimFormBtn = $(byClassName("dashbord-registration"));
    public SelenideElement InvalidGenderSelectionError = $(byText("გთხოვთ აირჩიოთ სქესი!"));
}
