package testcases;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class seleniumq {
	@Test
	public void web() {
		WebDriver driver = new ChromeDriver();
		//to open webDrive
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.Amazon.com");
		//TO MAXIMISE WINDOW
		driver.manage().window().maximize();
		//HOW TO BACKWORD,FORWORD & REFRESH
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
	}

}
