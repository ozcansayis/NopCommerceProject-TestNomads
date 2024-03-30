package US_501;

import POM.*;
import Utility.BaseDriverParameter;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.time.Duration;

public class UserRegistrationTest extends BaseDriverParameter {
    @Test(groups = { "Smoke", "Regression"})
    public void TC_501() {

        LoginContent lc = new LoginContent();
        HomePageContent hpc = new HomePageContent();
        SoftAssert softAssert = new SoftAssert();
        WebDriverWait wait = new WebDriverWait(BaseDriverParameter.driver, Duration.ofSeconds(5));
        myClick(hpc.registerbuton);
        softAssert.assertTrue(hpc.registerbuton.isEnabled(), "Register button is not clickable");
        mySendKeys(hpc.fistName, "Test");
        mySendKeys(hpc.lastName, "Nomads");
        mySendKeys(hpc.email, "testnomads01@gmail.com");
        mySendKeys(hpc.password, "TOtechno1");
        mySendKeys(hpc.ConfirmPassword, "TOtechno1");
        Select dayDropdown = new Select(driver.findElement(By.name("DateOfBirthDay")));
        dayDropdown.selectByValue("5");
        Select monthDropdown = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        monthDropdown.selectByVisibleText("May");
        Select yearDropdown = new Select(driver.findElement(By.name("DateOfBirthYear")));
        yearDropdown.selectByValue("2005");
        myClick(hpc.registerButton);
        softAssert.assertNotNull(hpc.successMessage, "Registration message should be displayed.");
    }

}