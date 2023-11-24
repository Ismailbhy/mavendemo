package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase {
	String[] testdata;
	WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
	}
	@Test
	public void test() throws IOException {
		testdata = ExcelHandalFor0.excelData();
		driver.get("https://www.mycontactform.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("sample Froms")).click();
		driver.findElement(By.id("subject")).sendKeys(testdata[0]);
		
	}

}
