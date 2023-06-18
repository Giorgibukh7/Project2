import Data.SwoopTestData;
import JDBC.UserDBData;
import JDBC.InsertUserIntoDB;
import JDBC.MySQLJDBCUtil;
import Steps.HomePageSteps;
import Steps.RegistrationFromSteps;
import com.codeborne.selenide.testng.SoftAsserts;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.sql.*;



@Listeners({ SoftAsserts.class})
@Epic("Swoop General Functionality tests")
@Feature("Swoop Registration form test")
public class TestMethodFive extends BaseTestStrictAssert {

    public HomePageSteps homePageSteps = new HomePageSteps();
    public RegistrationFromSteps registration = new RegistrationFromSteps();


    @Test(groups = {"Regression2"})
    @Description("Checks Registration Form Functionality,Fills all fields except gender and expects invalid gender error")
    @Story("Test Method 5")
    void TestMethodFiveBody() throws SQLException{

        homePageSteps.ClickLoginButton();
        registration.ClickRegisterButton();

        try(Connection conn = MySQLJDBCUtil.getConnection())
        {
            new InsertUserIntoDB(conn, SwoopTestData.TestUserDetails);
            UserDBData userdata = new UserDBData(conn,1);

            registration.SetFirstName(userdata.firstName)
                    .SetLastName(userdata.lastName)
                    .SetEmail(userdata.email)
                    .SetPhone(userdata.phoneNumber)
                    .SetPassword(userdata.userPassword)
                    .SetConfirmPassword(userdata.userPassword)
                    .setDateOfBrith(userdata.dateOfBirth);

        }

        registration.ConfirmForm().CheckErrorIsPresentInvalidGender();

    }
}