package Brase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static WebDriver getDriver() {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.google.com//");
		
		return driver;
		
	}

}
