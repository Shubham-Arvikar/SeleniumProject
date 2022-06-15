package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage {
	
	 public WebDriver driver;

	    By registerbtn = By.xpath("//span[text()=\"Register\"]"); 
	    By fullname = By.xpath("//input[@id='user_name']");
	    By email = By.xpath("//input[@id='user_email']");
	    By PWD= By.xpath("//input[@id='password']");
	    By signupbtn= By.xpath("//input[@name='commit']");
	    By errormsg= By.xpath(" //div[contains(text(),\"Please fill in all the fields.\")]");
	    
	    public SignUpPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public WebElement RegistrBtn() {
	        return driver.findElement(registerbtn);
	    }

	    public WebElement fullnameInput() {
	        return driver.findElement(fullname);
	    }

	    public WebElement emailInput() {
	        return driver.findElement(email);
	    }
	    
	    public WebElement PWdInput() {
	        return driver.findElement(PWD);
	    }
	    public WebElement SignUpBtn() {
	        return driver.findElement(signupbtn);
	    }
	    
	    public WebElement BlankErrorMsg() {
	        return driver.findElement(errormsg);
	    }  

}
