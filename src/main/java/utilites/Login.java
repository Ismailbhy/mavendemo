package utilites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Brase.BaseUI;

public class Login extends BaseUI {
	WebDriver driver;
	By username = By.id("username");
	By password = By.id("password");
	By submit = By.id("submit");
	By error=By.id("error");
	
	public Login(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setUsername(String usernameValue) {
		driver.findElement(username).sendKeys(usernameValue);
		logger.log(Status.INFO, "Entered username");
	}
	public void setPassword(String passwordValue) {
		driver.findElement(password).sendKeys(passwordValue);
		logger.log(Status.INFO,"Entered password");
		}
	public void clicksubmit() {
		driver.findElement(submit).click();
		logger.log(Status.INFO, "Clicked on submit button");
		}
	public String getErrorMessage() {
		return driver.findElement(error).getText();
	}

}
