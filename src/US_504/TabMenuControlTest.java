package US_504;

import Utility.BaseDriverParameter;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TabMenuControlTest extends BaseDriverParameter {
    @Test
    public void TC_504(){
        MenuControl mc = new MenuControl();
        myClick(mc.Computers);
        Assert.assertTrue(mc.Resalt.getText().contains("Computers"));
        myClick(mc.Desktops);
        Assert.assertTrue(mc.Resalt.getText().contains("Desktops"));
        driver.navigate().back();
        myClick(mc.Notebooks);
        Assert.assertTrue(mc.Resalt.getText().contains("Notebooks"));
        driver.navigate().back();
        myClick(mc.Software);
        Assert.assertTrue(mc.Resalt.getText().contains("Software"));

        myClick(mc.Electronics);
        Assert.assertTrue(mc.Resalt.getText().contains("Electronics"));
        myClick(mc.CameraPhoto);
        Assert.assertTrue(mc.Resalt.getText().contains("Camera & photo"));
        driver.navigate().back();
        myClick(mc.CellPhones);
        Assert.assertTrue(mc.Resalt.getText().contains("Cell phones"));
        driver.navigate().back();
        myClick(mc.Others);
        Assert.assertTrue(mc.Resalt.getText().contains("Others"));

        myClick(mc.Apparel);
        Assert.assertTrue(mc.Resalt.getText().contains("Apparel"));
        myClick(mc.Shoes);
        Assert.assertTrue(mc.Resalt.getText().contains("Shoes"));
        driver.navigate().back();
        myClick(mc.Clothing);
        Assert.assertTrue(mc.Resalt.getText().contains("Clothing"));
        driver.navigate().back();
        myClick(mc.Accessories);
        Assert.assertTrue(mc.Resalt.getText().contains("Accessories"));


        myClick(mc.Digitaldownloads);
        Assert.assertTrue(mc.Resalt.getText().contains("Digital downloads"));

        myClick(mc.Books);
        Assert.assertTrue(mc.Resalt.getText().contains("Books"));

        myClick(mc.Jewelry);
        Assert.assertTrue(mc.Resalt.getText().contains("Jewelry"));

        myClick(mc.GiftCards);
        Assert.assertTrue(mc.Resalt.getText().contains("Gift Cards"));




    }
}
