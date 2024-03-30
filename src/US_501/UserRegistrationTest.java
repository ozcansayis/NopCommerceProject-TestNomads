package US_501;

import POM.*;
import Utility.BaseDriverParameter;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class UserRegistrationTest extends BaseDriverParameter {
    @Test(groups = {"Smoke", "Regression"}, priority = 1)
    @Parameters("email")
    public void TC_501(String email) {
        LoginContent lc = new LoginContent();
        SoftAssert softAssert = new SoftAssert();

        myClick(lc.registerbuton);
        softAssert.assertTrue(lc.registerbuton.isEnabled(), "Register button is not clickable!");
        mySendKeys(lc.fistName, "Test");
        mySendKeys(lc.lastName, "Nomads");
        mySendKeys(lc.email, email);
        mySendKeys(lc.password, "testnomads");
        mySendKeys(lc.ConfirmPassword, "testnomads");
        Select dayDropdown = new Select(driver.findElement(By.name("DateOfBirthDay")));
        dayDropdown.selectByValue("5");
        Select monthDropdown = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        monthDropdown.selectByVisibleText("May");
        Select yearDropdown = new Select(driver.findElement(By.name("DateOfBirthYear")));
        yearDropdown.selectByValue("2005");
        myClick(lc.registerButton);
        softAssert.assertTrue(lc.successMessage.getText().equals("Your registration completed"), "Registration message should be displayed!");
        softAssert.assertAll();
    }

}