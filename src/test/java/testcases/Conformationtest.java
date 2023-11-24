package testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import javax.security.auth.callback.ConfirmationCallback;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Brase.Browser;
import utilites.FileIO;
import utilites.Login;

public class Conformationtest {WebDriver driver;
@BeforeMethod
public void test() throws IOException {
	if(FileIO.propertiesfileReading("browserType").equals("chrome")) {
        driver = Browser.getDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}
}
@Test(priority=0)
public void testcase1() {
	Login log=new Login(driver);
	log.setUsername("student");
	log.setPassword("Password123");
	log.clicksubmit();
	//String expectedtext="congratulations";
	//Confirmation cp=new Confirmation(driver);
	//assertEquals(cp.successMessage(), null);
}
@Test(dependsOnMethods = "testcase1")
public void testcase2() {
	Login log=new Login(driver);
	log.setUsername("students");
	log.setPassword("Password1234");
	log.clicksubmit();
}
/*@Test(priority=0,enabled =false)
public void testcase3() {
	Login log=new Login(driver);
	log.setUsername(" ");
	log.setPassword(" ");
	log.clicksubmit();
}*/
}
