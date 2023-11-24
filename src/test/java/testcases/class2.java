package testcases;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class class2 {
	@Test
	public void testq() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		driver.findElement(By.id("button1")).click();
		Set<String> windows=driver.getWindowHandles(); 
		List<String> windowslist=new ArrayList(windows);
		System.out.println("total is "+ windowslist.size());
		driver.switchTo().window(windowslist.get(1));
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		//WebElement tech=driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[1]/div/aection/div));
		//System.out.println(tech.getText());
	}

}
