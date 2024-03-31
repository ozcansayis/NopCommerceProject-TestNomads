package US_507;

import POM.HomePageContent;
import POM.ParentPage;
import Utility.BaseDriverParameter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class ComputerOrderProcessTest extends BaseDriverParameter {
    @Test(groups = {"UITesting","TAB Menu","Order"}, priority = 7)
    public void TC_507(){

        HomePageContent hp=new HomePageContent();
        WebDriverWait wait= new WebDriverWait(BaseDriverParameter.driver, Duration.ofSeconds(10));
        myClick(hp.computers);
        myClick(hp.desktops);
        myClick(hp.buildOwnComputer);
        scrollToElement(hp.addToCart);
        Select ramSelect=new Select(hp.ramChoice);
        List<WebElement> ram=ramSelect.getOptions();
        int ramNo=ParentPage.RandomGenerator(ram.size()-1,1);
        ramSelect.selectByIndex(ramNo);
        int hddNo=RandomGenerator(hp.harddiscChoice.size()-1,0);
        myClick(hp.harddiscChoice.get(hddNo));
        myClick(hp.addToCart);
        wait.until(ExpectedConditions.visibilityOf(hp.addToCartWarn));
        Assert.assertTrue(hp.addToCartWarn.isDisplayed(),"Please select RAM or HDD");

    }
}
