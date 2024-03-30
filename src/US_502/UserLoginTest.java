package US_502;

import POM.*;
import Utility.BaseDriverParameter;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserLoginTest extends BaseDriverParameter {
    @Test(groups = {"LoginTest", "Smoke"})
    public void TC_502() {
        LoginContent lc = new LoginContent();
        HomePageContent hpc = new HomePageContent();
        myClick(lc.loginButton);
        Assert.assertEquals(lc.loginPageTitle.getText(), "Welcome, Please Sign In!", "Log in page could not be reached.");
        mySendKeys(lc.email, "technodeneme007@gmail.com");
        mySendKeys(lc.password, "12345Aa.");
        myClick(lc.loginButton2);
        Assert.assertEquals(hpc.myAccount.getText(), "My account", "Failed entry.");
    }
}
