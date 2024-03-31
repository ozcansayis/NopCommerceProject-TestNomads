package US_507;

import POM.HomePageContent;
import POM.ParentPage;
import Utility.BaseDriverParameter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ComputerOrderProcessTest extends BaseDriverParameter {
    @Test(groups = {"UITesting","TAB Menu","Order"})
    public void TC_507(){

        HomePageContent hp=new HomePageContent();
        ParentPage pp=new ParentPage();
        myClick(hp.computers);
        myClick(hp.desktops);
        myClick(hp.buildOwnComputer);
        Select ramSelect=new Select(hp.ramChoice);
        List<WebElement> ram=ramSelect.getOptions();
        int ramNo=ParentPage.RandomGenerator(ram.size()-1,1);
        ramSelect.selectByIndex(ramNo);

        Select hddSelect=new Select(hp.hddChoice);
        List<WebElement> hdd=hddSelect.getOptions();
        int hddNo=ParentPage.RandomGenerator(hdd.size()-1,0);
        hddSelect.selectByIndex(hddNo);
        myClick(hp.addToCart);
        Assert.assertEquals(hp.addToChartError.getText(), "The product has been added to your shopping cart. ", "Please select RAM or HDD");






    }
}
