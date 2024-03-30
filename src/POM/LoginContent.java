package POM;

import Utility.BaseDriverParameter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class LoginContent {
    public LoginContent() {
        PageFactory.initElements(BaseDriverParameter.driver, this);
    }

    @FindBy(linkText = "Log in")
    public WebElement loginButton;

    @FindBy(css = "#Email")
    public WebElement email;

    @FindBy(css = "#Password")
    public WebElement password;

    @FindBy(css = "[class='button-1 login-button']")
    public WebElement loginButton2;

    @FindBy(css = "#Email-error")
    public WebElement emailError;

    @FindBy(css = "[class='message-error validation-summary-errors']")
    public WebElement failedLogin;

    @FindBy(xpath = "//div[@class='page login-page']/div/h1")
    public WebElement loginPageTitle;
}