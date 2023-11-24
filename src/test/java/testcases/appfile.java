package testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Brase.Browser;
import pageobjectmodel.conformationPage;
import utilites.Browsertest;
import utilites.FileIO;
import utilites.Login;

public class appfile {
	WebDriver driver;
	String data;
	@BeforeMethod
    public void test() throws IOException {
		if(FileIO.propertiesfileReading("browserType").equals("chrome")) {
	        driver = Browser.getDriver();
			driver.get("https://practicetestautomation.com/practice-test-login/");
			}
	}
		@Test
		public void testcase1() {
			Login log=new Login(driver);
			log.setUsername("tudent");
			log.setPassword("Password123");
			log.clicksubmit();
			String expectedtext="Acsess denied";
			conformationPage cp=new conformationPage(driver);
			assertEquals(cp.getSuccessMassage(),expectedtext);
			
		}

	@Test
	public void testcase2() {
		Login log=new Login(driver);
		log.setUsername("tudent");
		log.setPassword("Password123");
		log.clicksubmit();
		String expectedtext="Acsess denied";
		conformationPage cp=new conformationPage(driver);
		assertEquals(cp.getSuccessMassage(),expectedtext);
		
	}
	

}