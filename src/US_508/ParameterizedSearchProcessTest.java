package US_508;

import POM.*;
import Utility.BaseDriverParameter;
import org.testng.Assert;
import org.testng.annotations.*;

public class ParameterizedSearchProcessTest extends BaseDriverParameter {
    @Test(groups = {"UITesting", "Search", "Smoke", "Regression"})
    @Parameters({"searchText"})
    public void TC_508(String text) {
        LoginContent lc = new LoginContent();
        HomePageContent hpc = new HomePageContent();
        myClick(lc.loginButton);
        mySendKeys(lc.email, "technodeneme007@gmail.com");
        mySendKeys(lc.password, "12345Aa.");
        myClick(lc.loginButton2);
//        mySendKeys(hpc.searchBox, text + Keys.ENTER);
        mySendKeys(hpc.searchBox, text);
        myClick(hpc.searchButton);
        Assert.assertEquals(hpc.productTitle.getText(), text, "The product title does not include the search term 'Adobe Photoshop CS4'.");
    }
}
