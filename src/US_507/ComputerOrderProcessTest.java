package US_507;

import POM.HomePageContent;
import Utility.BaseDriverParameter;
import org.testng.annotations.Test;

public class ComputerOrderProcessTest extends BaseDriverParameter {
    @Test
    public void TC_507(){

        HomePageContent hp=new HomePageContent();
        myClick(hp.computers);
        myClick(hp.desktops);
        myClick(hp.buildOwnComputer);






    }
}
