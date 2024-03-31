package Utility;

import POM.ParentPage;
import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseDriverParameter extends ParentPage {
    public static WebDriver driver;
    public static Logger logger = LogManager.getLogger();

    @BeforeClass(alwaysRun = true)
    @Parameters("browserType")
    public void beforeClass(String browserType) {

        switch (browserType.toLowerCase()) {
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.get("https://demo.nopcommerce.com/");
    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        ParentPage.Wait(3);
        driver.quit();

        logger.info("Driver closed.");
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMetod() {
        logger.info("Method started.");

    }

    @AfterMethod(alwaysRun = true)
    public void afterMetod(ITestResult sonuc) {
        logger.info(sonuc.getName() + " Method finished. " + (sonuc.getStatus() == 1 ? "Passed" : "Failed"));
    }
}
