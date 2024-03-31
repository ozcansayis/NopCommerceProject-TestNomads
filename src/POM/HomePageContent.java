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

    // My Account
    @FindBy(xpath = "//div[@class='header-links']/ul/li[1]/a")
    public WebElement myAccount;

    @FindBy(id = "small-searchterms")
    public WebElement searchBox;

    @FindBy(xpath = "//button[text()='Search']")
    public WebElement searchButton;

    @FindBy(xpath = "//div[@class='product-item']/div[2]/h2/a")
    public WebElement productTitle;

    @FindBy(css = "[class='top-menu notmobile'] li")
    public List<WebElement> tabMenu;

    @FindBy(css = "div[class='page-title']>h1")
    public WebElement ortakTab;

    @FindBy(css = "[class='top-menu notmobile'] [href='/computers']")
    public WebElement computers;

    @FindBy(css = "[class='title'] [href='/desktops']")
    public WebElement desktops;

    @FindBy(css = "[class='product-item'][data-productid='1']")
    public WebElement buildOwnComputer;

    @FindBy(id = "product_attribute_2")
    public WebElement ramChoice;

    @FindBy(css = "[id*='product_attribute_3_']")
    public List<WebElement> harddiscChoice;

    @FindBy(css = "[class='bar-notification success']")
    public WebElement addToCartWarning;

    @FindBy(css = "[class='product-viewmode'] a:nth-child(3)")
    public WebElement viewMode;

    @FindBy(css = "[class='product-title']")
    public List<WebElement> productList;
}