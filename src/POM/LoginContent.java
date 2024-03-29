package POM;

import Utility.BaseDriverParameter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginContent {
    public LoginContent() {
        PageFactory.initElements(BaseDriverParameter.driver, this);
    }

    @FindBy(id = "")
    public WebElement loginButton;

    @FindBy(id = "")
    public WebElement username;

    @FindBy(id = "")
    public WebElement password;

    @FindBy(id = "")
    public WebElement loginButton2;
}
