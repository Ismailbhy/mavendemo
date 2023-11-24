package Extratest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CALENDER {
	@Test
	public void calender() {
		String month="November 2023";
		String day="15";
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.ixigo.com/");
		WebElement depature=driver.findElement(By.xpath("//*[@id='content']/div/div[1]/div[5]/div/div/div[4]/div/div[1]/div/input"));
		depature.click();
		while(true) {
			String text=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div")).getText();
			if(text.equals(month)) {
				break;
			}
			else {
				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/button")).click();
			}
			
		}
		List<WebElement> date=driver.findElements(By.xpath("/html/body/div[2]/div[2]/div[1]/table/tbody/tr[3]/td[4]/div"));
		int total=date.size();
		for(int i=0;i<total;i++) {
			String d=date.get(i).getText();
			if (d.equals(day)) {
				date.get(i).click();
				break;
			}
		}
	}

}
