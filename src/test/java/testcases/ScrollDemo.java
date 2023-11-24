package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Brase.BaseUI;
import Brase.Browser;
import utilites.FileIO;

public class ScrollDemo extends BaseUI {
	@BeforeMethod
	 public void test() throws IOException {
			if(FileIO.propertiesfileReading("browserType").equals("chrome")) {
		        driver = Browser.getDriver();
		        setDriver(driver);
				driver.get("https://practicetestautomation.com/practice-test-login/");
				}
	}
	@Test
	public void testcase1() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement element=driver.findElement(By.xpath("//footer[@id='site-footer]//span"));
		
		js.executeScript("window.scrollBy(0,500");
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		js.executeScript("arguments[0].click()", element);
		
	}
}
