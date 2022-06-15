import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import pageObjects.SignUpPage;
import utilities.Base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class NavigationPageValidation extends Base {
    @BeforeMethod
    public void openBrowser() throws IOException {
        driver = initializeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://www.qaclickacademy.com/");
        LandingPage landingPage = new LandingPage(driver);

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(landingPage.getNoThanksBtn()));
        landingPage.getNoThanksBtn().click(); 
    }
    @Test
    public void navigationPageValidate() throws IOException, InterruptedException {
        
        Assert.assertTrue(driver.findElement(By.cssSelector("[class*=\"navbar-nav\"]")).isDisplayed(),"Navigation bar is not displayed");
    }
    
    @Test
    public void InvalidSignUP() throws IOException, InterruptedException {
    	SignUpPage SignUpPage = new SignUpPage(driver);
    	SignUpPage.RegistrBtn().click();
    	SignUpPage.fullnameInput().sendKeys("");
    	SignUpPage.emailInput().sendKeys("");
    	SignUpPage.PWdInput().sendKeys("");
    	SignUpPage.SignUpBtn().click();
    	
    	Assert.assertEquals(SignUpPage.BlankErrorMsg().getText(), "Please fill in all the fields.","able to sign up with blank data");
    }
    
    

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
