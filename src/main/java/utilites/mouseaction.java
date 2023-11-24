package utilites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class mouseaction {
	@Test
	public void smart() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryui.com");
		WebElement drop=driver.findElement(By.linkText("Droppable"));
		drop.click();
		WebElement frame=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement dropp=driver.findElement(By.id("droppable"));
		Actions a=new Actions(driver);
		a.clickAndHold(drag).moveToElement(dropp).release(dropp).build().perform();
		
	}

}
