package POM;

import Utility.BaseDriverParameter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import java.util.List;

public class HomePageContent {
    public HomePageContent() {
        PageFactory.initElements(BaseDriverParameter.driver, this);
    }

    @FindBy(linkText = "Log out")
    public WebElement logoutButton;

    @FindBy(css = ".message")
    public WebElement message;

    @FindBy(css = "[id*='add-to-cart-button-']")
    public WebElement addToCart;

    @FindBy(css = ".cart-label")
    public WebElement cart;

    @FindBy(css = ".product-name")
    public List<WebElement> cartItems;

    // Gift Cards elements.
    @FindBy(css = "[class='top-menu notmobile']>:nth-child(7)")
    public WebElement giftCardsButton;

    @FindBy(css = ".product-title>a")
    public List<WebElement> giftCards;

    @FindBy(css = ".recipient-name")
    public WebElement recipientName;

    @FindBy(css = ".recipient-email")
    public WebElement recipientEmail;

    @FindBy(css = "[class^='sender-name']")
    public WebElement yourName;

    @FindBy(css = ".sender-email")
    public WebElement yourEmail;

    @FindBy(css = "[class='bar-notification error']")
    public WebElement giftError;

    @FindBy(css = "[class='bar-notification success']")
    public WebElement giftSuccess;


}