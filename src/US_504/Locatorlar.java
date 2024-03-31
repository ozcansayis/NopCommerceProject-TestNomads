package US_504;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Locatorlar {

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

    /////////////////////////////////////////////////////
    // alt menuler
    //Computers
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[1]/ul/li[1]")
    public WebElement Desktops;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[1]/ul/li[2]")
    public WebElement Notebooks;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[1]/ul/li[3]")
    public WebElement Software;


    //Electronics
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[2]/ul/li[1]")
    public WebElement CameraPhoto;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[2]/ul/li[2]")
    public WebElement CellPhones;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[2]/ul/li[3]")
    public WebElement Others;


    //Apparel
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[3]/ul/li[1]")
    public WebElement Shoes;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[3]/ul/li[2]")
    public WebElement Clothing;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[3]/ul/li[3]")
    public WebElement Accessories;

}
