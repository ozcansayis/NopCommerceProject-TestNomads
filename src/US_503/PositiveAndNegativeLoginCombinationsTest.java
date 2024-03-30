package US_503;

import POM.*;
import Utility.BaseDriverParameter;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class PositiveAndNegativeLoginCombinationsTest extends BaseDriverParameter {
    @Test(groups = {"LoginTest", "Smoke"}, dataProvider = "credentials")
    public void TC_503(String email, String password) {
        LoginContent lc = new LoginContent();
        HomePageContent hpc = new HomePageContent();
        SoftAssert softAssert = new SoftAssert();

        myClick(lc.loginButton);
        softAssert.assertNotNull(lc.loginButton2, "Login page couldn't displayed!");
        mySendKeys(lc.email, email);
        mySendKeys(lc.password, password);
        myClick(lc.loginButton2);
        if (email.isEmpty()) {
            softAssert.assertTrue(lc.emailError.isDisplayed(), "Email warning couldn't displayed!");
        } else if (email.equals("nomadzero@gmail.com") && password.equals("inanilmaziyisifre")) {
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
                {"nomadzero@gmail.com", "inanilmaziyisifre"}
        };
    }
}