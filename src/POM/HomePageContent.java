package POM;

import Utility.BaseDriverParameter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class HomePageContent {
    public HomePageContent() {
        PageFactory.initElements(BaseDriverParameter.driver, this);
    }

    @FindBy(linkText = "Log out")
    public WebElement logoutButton;
}