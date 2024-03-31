package US_504;

import Utility.BaseDriverParameter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuControl {
    public  MenuControl(){
        PageFactory.initElements(BaseDriverParameter.driver, this);
    }
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[1]")
    public WebElement Computers;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[2]")
    public WebElement Electronics;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[3]")
    public WebElement Apparel;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[4]")
    public WebElement Digitaldownloads;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[5]")
    public WebElement Books;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[6]")
    public WebElement Jewelry;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[7]")
    public WebElement GiftCards;
    @FindBy(css = "div[class='center-2']>div>div>h1")
    public WebElement Resalt;


    /////////////////////////////////////////////////////
    // alt menuler
    //Computers

    @FindBy(xpath = "//a[text()=' Desktops ']")
    public WebElement Desktops;
    @FindBy(xpath = "//a[text()=' Notebooks ']")
    public WebElement Notebooks;
    @FindBy(xpath = "//a[text()=' Software ']")
    public WebElement Software;


    //Electronics
    @FindBy(xpath = "//a[text()=' Camera & photo ']")
    public WebElement CameraPhoto;
    @FindBy(xpath = "//a[text()=' Cell phones ']")
    public WebElement CellPhones;
    @FindBy(xpath = "//a[text()=' Others ']")
    public WebElement Others;


    //Apparel
    @FindBy(xpath = "//a[text()=' Shoes ']")
    public WebElement Shoes;
    @FindBy(xpath = "//a[text()=' Clothing ']")
    public WebElement Clothing;
    @FindBy(xpath = "//a[text()=' Accessories ']")
    public WebElement Accessories;


}
