package POM;

import Utility.BaseDriverParameter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageContent{
    public HomePageContent() {
        PageFactory.initElements(BaseDriverParameter.driver, this);
    }

    @FindBy(xpath = "")
    public WebElement logoutButton;


}
