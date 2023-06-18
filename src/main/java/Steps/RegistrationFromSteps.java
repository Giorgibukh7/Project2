package Steps;

import Pages.SwoopRegistrationFormPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;


public class RegistrationFromSteps {

    SwoopRegistrationFormPage page = new SwoopRegistrationFormPage();
    @Step("Click Register Button")
    public RegistrationFromSteps ClickRegisterButton(){
        page.RegisterButton.click();
        return this;
    }
    @Step
    public RegistrationFromSteps SetFirstName(String FirstName){
        page.FirstNameField.sendKeys(FirstName);
        return this;
    }
    @Step
    public RegistrationFromSteps SetLastName(String LastName){
        page.LastNameField.sendKeys(LastName);
        return this;
    }
    @Step
    public RegistrationFromSteps SetPhone(String Phone){
        page.PhoneField.sendKeys(Phone);
        return this;
    }
    @Step
    public RegistrationFromSteps SetEmail(String email){
        page.EmailField.sendKeys(email);
        return this;
    }
    @Step
    public RegistrationFromSteps SetPassword(String password){
        page.PasswordField.sendKeys(password);
        return this;
    }
    @Step
    public RegistrationFromSteps SetConfirmPassword(String password){
        page.ConfirmPasswordField.sendKeys(password);
        return this;
    }
    @Step("Confirm Form")
    public RegistrationFromSteps ConfirmForm(){
        page.ConfrimFormBtn.click();
        return this;
    }
    @Step
    public RegistrationFromSteps setDateOfBrith(String DateOfBirth){
        String[] dateArray = DateOfBirth.split("-");
        page.DateBirthSelector.sendKeys(dateArray[2]);
        page.DateBirthSelector.sendKeys(dateArray[1]);
        page.DateBirthSelector.sendKeys(dateArray[0]);
        return this;
    }
    @Step("Check that 'Invalid Gender' Error Is Present")
    public RegistrationFromSteps CheckErrorIsPresentInvalidGender(){
        page.InvalidGenderSelectionError.shouldBe(Condition.visible);
        return this;
    }
}
