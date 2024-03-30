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

    @FindBy(id = "FirstName")
    public WebElement fistName;

    @FindBy(id = "LastName")
    public WebElement lastName;

    @FindBy(id ="Email" )
    public WebElement email2;

    @FindBy(id = "Password")
    public WebElement password2;

    @FindBy(id = "ConfirmPassword")
    public WebElement ConfirmPassword;

    @FindBy(id = "register-button")
    public WebElement registerButton ;

    @FindBy(className = "result")
    public WebElement successMessage ;




}