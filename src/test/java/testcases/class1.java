package testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class class1 {
	public void testclass(){
		WebDriver driver= new ChromeDriver();
		//driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		//driver.findElement(By.name("confirmalertbox")).click();
		//Alert a=driver.switchTo().alert();
		//a.accept();
		//a.dismiss();
		driver.findElement(By.name("promptalertbox1234")).click();
		Alert b=driver.switchTo().alert();
		
		b.accept();
		b.sendKeys("No");
		driver.get("");
	}

}
