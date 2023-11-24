package utilites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class amazone {
	@Test
	public void excel() {
		WebDriver driver= new ChromeDriver();
		//driver.get("https://www.amazon.com/");
		driver.get("https://www.amazon.com/");
		WebElement account=driver.findElement(By.className("nav-line-1-container"));
		Actions a=new Actions(driver);
		a.moveToElement(account).build().perform();
		driver.findElement(By.xpath("//*[@id=\"nav-al-your-account\"]/a[4]/span")).click();
		
	}

}
