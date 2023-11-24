package utilites;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Brase.Browser;

public class Browsertest {
	WebDriver driver;
	@Test
	
	public void browser() throws IOException {
		String browsertype=PropertiesfileReading.anyname("browserType");
		if(browsertype.equalsIgnoreCase("chrome")) {
			
		
		driver=Browser.getDriver();
		driver.get("https:\\www.google.com");
		}
	}

}
