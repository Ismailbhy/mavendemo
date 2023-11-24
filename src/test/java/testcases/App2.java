package testcases;




import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Brase.BaseUI;
import Brase.Browser;
import pageobjectmodel.Pagefactory;
import utilites.ExcelHandling;
import utilites.FileIO;
@Listeners(utilites.Listeners.class)
public class App2 extends BaseUI{
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
		Pagefactory log=new Pagefactory(driver);
		log.setUsername(username);
		log.setPassword(password);
		log.clickSubmit();
		log.getErrorMessage();
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
