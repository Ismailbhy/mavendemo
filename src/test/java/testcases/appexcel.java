package testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import javax.swing.text.Utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Brase.BaseUI;
import Brase.Browser;
import utilites.ExcelHandling;
import utilites.FileIO;
import utilites.Login;
@Listeners(utilites.Listeners.class)
public class appexcel extends BaseUI{
	WebDriver driver;
	String data[][];
	@BeforeMethod
	 public void test() throws IOException {
			if(FileIO.propertiesfileReading("browserType").equals("chrome")) {
		        driver = Browser.getDriver();
		        setDriver(driver);
				driver.get("https://practicetestautomation.com/practice-test-login/");
				}
	}
	@DataProvider(name="testdata")
	public Object[][] testdata() throws IOException {
		data = ExcelHandling.exceldata();
		return data;
	}
	@Test(dataProvider = "testdata")
	public void testcase1(String username, String password) {
		Login log=new Login(driver);
		log.setUsername(username);
		log.setPassword(password);
		log.clicksubmit();
		if(username.equals("firoza") || password.equals("student123")) {
			Assert.assertEquals("you username is invalid", log.getErrorMessage());
		 //Assert.assertEquals("you username is invalid", log.getErroemassege());
		}else if (password.equals("rumana")) {
			Assert.assertEquals("your password is invalid", log.getErrorMessage());
		}else {
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(driver.getCurrentUrl().contains("logged-in-succesfully"));
		}
	}
}
