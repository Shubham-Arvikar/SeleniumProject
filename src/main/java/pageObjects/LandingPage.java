package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

    public WebDriver driver;

    By signIn = By.cssSelector("[href=\"https://rahulshettyacademy.com/sign_in/\"]");
    By noThanks = By.xpath("//button[.=\"NO THANKS\"]");
    By seleniumJavaCourse = By.xpath("//a[.=\"Selenium Webdriver with Java Basics + Advanced + Interview Guide\"]");

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getSignInBtn() {
        return driver.findElement(signIn);
    }

    public WebElement getNoThanksBtn() {
        return driver.findElement(noThanks);
    }

    public WebElement getSeleniumCourseOption() {
        return driver.findElement(seleniumJavaCourse);
    }
}
