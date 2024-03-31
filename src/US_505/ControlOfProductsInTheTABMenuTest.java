package US_505;

import POM.HomePageContent;
import Utility.BaseDriverParameter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


public class ControlOfProductsInTheTABMenuTest extends BaseDriverParameter {
    @Test(groups = {"UITesting", "Search", "TAB Menu", "Regression"})
    @Parameters({"product"})

    public void TC_505(String product) {
        Actions act = new Actions(driver);
        WebDriverWait wwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        HomePageContent hp = new HomePageContent();

        List<String> productName = new ArrayList<>();
        wwait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class='top-menu notmobile'] li")));
        List<List<WebElement>> products = new ArrayList<>();

        for (int i = 0; i < hp.tabMenu.size(); i++) {
            wwait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class='top-menu notmobile'] li")));
            if (i > 0 && i < 4)
                act.moveToElement(hp.tabMenu.get(0)).perform();
            else if (i > 4 && i < 8) {
                act.moveToElement(hp.tabMenu.get(4)).perform();
            } else if (i > 8 && i < 12) {
                act.moveToElement(hp.tabMenu.get(8)).perform();
            }
            myClick(hp.tabMenu.get(i));
            products.add(wwait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.cssSelector("h2[class*='title']>a")))));
            for (WebElement x : products.get(i)) {
                productName.add(x.getText());
            }
        }

        mySendKeys(hp.searchBox, product);
        myClick(hp.searchButton);
        myClick((hp.viewMode));
        wwait.until(ExpectedConditions.visibilityOfAllElements(hp.productList));
        Assert.assertTrue(ListContainsStringg(productName,product),"bomboclat");

    }

    public static boolean ListContainsStringg(List<String> list, String string) {
        boolean condition = false;
        for (String e : list) {
            if (e.contains(string))
                condition = true;
        }
        return condition;
    }
}