package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Base;

public class LoginPage {
    public WebDriver driver;

    By emailAddress = By.cssSelector("[id=\"user_email\"]");
    By password = By.cssSelector("[id=\"user_password\"]");
    By loginBtn = By.name("commit");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement userNameInput() {
        return driver.findElement(emailAddress);
    }

    public WebElement passwordInput() {
        return driver.findElement(password);
    }

    public WebElement loginBtn() {
        return driver.findElement(loginBtn);
    }
}
