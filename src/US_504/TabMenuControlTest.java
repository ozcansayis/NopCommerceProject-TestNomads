package US_504;

import POM.HomePageContent;
import Utility.BaseDriverParameter;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
public class TabMenuControlTest extends BaseDriverParameter {
    @Test(groups = {"UITesting","TAB Menu"}, priority = 4)
    public void TC_504() {
        HomePageContent hp = new HomePageContent();
        Actions act = new Actions(BaseDriverParameter.driver);
        WebDriverWait wait = new WebDriverWait(BaseDriverParameter.driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class='top-menu notmobile'] li")));

        String [] menuler = {"Computers","Desktops", "Notebooks","Software", "Electronics","Camera & photo", "Cell phones",
                "Others" ,"Apparel","Shoes","Clothing","Accessories","Digital downloads","Books","Jewelry","Gift Cards"};
        for (int i = 0; i < hp.tabMenu.size(); i++) {
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class='top-menu notmobile'] li")));
            if (i>0 && i<4)
                act.moveToElement(hp.tabMenu.get(0)).perform();
            else if (i>4 && i<8) {
                act.moveToElement(hp.tabMenu.get(4)).perform();
            } else if (i>8 && i<12) {
                act.moveToElement(hp.tabMenu.get(8)).perform();
            }
            Assert.assertTrue(ListContainsString(hp.tabMenu,menuler[i]), "Menu element could not be found!");
            String productName = hp.tabMenu.get(i).getText();
            myClick(hp.tabMenu.get(i));
            String sonuc = hp.ortakTab.getText();
            Assert.assertEquals(sonuc, productName,"The searched product is not in the list!");
        }
    }
}