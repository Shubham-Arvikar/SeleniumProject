import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import utilities.Base;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class HomePage extends Base {

    @BeforeMethod
    public void openBrowser() throws IOException {
        driver = initializeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://www.qaclickacademy.com/");
    }

    @Test(dataProvider = "getData")
    public void basePageNavigation(String username, String password) {
        LandingPage landingPage = new LandingPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(landingPage.getNoThanksBtn()));
        landingPage.getNoThanksBtn().click();
        landingPage.getSignInBtn().click();
        loginPage.userNameInput().sendKeys(username);
        loginPage.passwordInput().sendKeys(password);
        loginPage.loginBtn();
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    @DataProvider
    public Object[][] getData() {
        //row refers to the how many tests are there
        //column refers to test data values for specific test
        Object[][] data = {{"username1", "1235"}, {"user2", "1235433"}};
        return data;
    }
}
