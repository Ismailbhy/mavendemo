package pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Brase.Browser;
import utilites.FileIO;

public class conformationPage {
	WebDriver driver;

	public conformationPage(WebDriver driver) {
		
		this.driver = driver;
	}
	By successMessage=By.xpath("//*[@id=\"loop-container\"]//div/article/div[2]/p[1]/strong");
	
	public String getSuccessMassage() {
		String s=driver.findElement(successMessage).getText();
		return s;
		//page object module storing the elements
		
	}

}
