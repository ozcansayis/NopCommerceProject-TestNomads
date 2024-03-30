package US_506;

import POM.HomePageContent;
import Utility.BaseDriverParameter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class GiftOrderingProcessTest extends BaseDriverParameter {
    @Test
    public void TC_506(){
        HomePageContent hpc= new HomePageContent();
        SoftAssert softAssert= new SoftAssert();
        WebDriverWait wait= new WebDriverWait(BaseDriverParameter.driver, Duration.ofSeconds(5));

        myClick(hpc.giftCardsButton);
        int random= RandomGenerator(hpc.giftCards.size()-1,0);
        String cardName= hpc.giftCards.get(random).getText();
        myClick(hpc.giftCards.get(random));
        myClick(hpc.addToCart);
        wait.until(ExpectedConditions.visibilityOf(hpc.giftError));
        softAssert.assertTrue(hpc.giftError.isDisplayed(),"Error message couldn't displayed!");

        if (random==0){
            mySendKeys(hpc.recipientEmail,"lenore@gmail.com");
            mySendKeys(hpc.yourEmail,"testnomads@gmail.com");
        }
        mySendKeys(hpc.recipientName,"Edgar Allan Poe");
        mySendKeys(hpc.yourName,"Test Nomads");
        mySendKeys(hpc.message,"From grief and groan, to a golden throne, beside the King of Heaven.\n");
        myClick(hpc.addToCart);
        wait.until(ExpectedConditions.visibilityOf(hpc.giftSuccess));
        softAssert.assertTrue(hpc.giftSuccess.getText().contains("The product has been added to your"),"The addition to the cart process failed!");
        myJsClick(hpc.cart);
        softAssert.assertTrue(ListContainsString(hpc.cartItems,cardName),"The added gift card could not be displayed in the cart!");
        softAssert.assertAll();
    }
}
