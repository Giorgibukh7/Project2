package Steps;
import Pages.SelectedOfferPage;
import io.qameta.allure.Step;


public class SelectedOfferPageSteps {
    SelectedOfferPage page = new SelectedOfferPage();
    @Step("Click Share Button")
    public SelectedOfferPageSteps ClickShare(){
        page.ShareButton.click();
        return this;
    }
}
