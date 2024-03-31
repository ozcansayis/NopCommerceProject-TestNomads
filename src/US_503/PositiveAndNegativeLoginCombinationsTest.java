package US_503;

import POM.*;
import Utility.BaseDriverParameter;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class PositiveAndNegativeLoginCombinationsTest extends BaseDriverParameter {
    @Test(groups = {"LoginTest", "Smoke"}, dataProvider = "credentials", priority = 3)
    public void TC_503(String email, String password) {
        LoginContent lc = new LoginContent();
        HomePageContent hpc = new HomePageContent();
        SoftAssert softAssert = new SoftAssert();
        WebDriverWait wait = new WebDriverWait(BaseDriverParameter.driver, Duration.ofSeconds(5));

        myClick(lc.loginButton);
        softAssert.assertNotNull(lc.loginButton2, "Login page couldn't displayed!");
        wait.until(ExpectedConditions.visibilityOf(lc.email));
        mySendKeys(lc.email, email);
        mySendKeys(lc.password, password);
        myClick(lc.loginButton2);
        if (email.isEmpty()) {
            softAssert.assertTrue(lc.emailError.isDisplayed(), "Email warning couldn't displayed!");
        } else if (email.equals("testnomads01@gmail.com") && password.equals("TOtechno1")) {
            softAssert.assertTrue(hpc.logoutButton.isDisplayed(), "Login failed!");
        } else {
            softAssert.assertTrue(lc.failedLogin.isDisplayed(), "Failed login warning couldn't displayed!");
        }
        softAssert.assertAll();
    }

    @DataProvider
    Object[][] credentials() {
        return new Object[][]{
                {"", ""},
                {"blablabla@gmail.com", ""},
                {"", "123456"},
                {"blablabla@gmail.com", "123456"},
                {"nomadzero@gmail.com", "123456"},
                {"blablabla@gmail.com", "inanilmaziyisifre"},
                {"testnomads01@gmail.com", "TOtechno1"}
        };
    }
}