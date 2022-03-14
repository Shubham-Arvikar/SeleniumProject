import pageObjects.LandingPage;
import utilities.Base;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomePage extends Base {

    @Test
    public void openPage() throws IOException, InterruptedException {
        driver = initializeDriver();
        LandingPage landingPage = new LandingPage(driver);
        driver.get("http://www.qaclickacademy.com/");
        landingPage.getSignInBtn().click();
        driver.close();
    }
}
