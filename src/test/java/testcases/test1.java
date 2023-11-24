package testcases;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.print.attribute.standard.RequestingUserName;
import javax.swing.text.html.HTML.Tag;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class test1 {
	@Test
	public void webtest1() throws IOException {
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.google.com");
		driver1.navigate().to("https://www.mycontactform.com");
		driver1.manage().window().maximize();
		driver1.findElement(By.linkText("Sample Forms")).click();
		//WebElement UserName = driver1.findElement(By.id("user"));
		//UserName.sendKeys("ismail");
		driver1.findElement(By.id("user")).sendKeys("Ismail");
		WebElement password = driver1.findElement(By.id("pass"));
		password.sendKeys("01234");
		driver1.findElement(By.id("subject")).sendKeys("he");
		driver1.findElement(By.id("email")).sendKeys("ismailshovon@gmail.com");
		driver1.findElement(By.id("q1")).sendKeys("class");
		driver1.findElement(By.id("q2")).sendKeys("class module");
		//driver1.findElement(By.linkText("Sample Forms")).click();
		//driver1.findElement(By.id("subject")).sendKeys("kiruba");
		//System.out.println(5+2);int a=5+2;System.out.println(a);
		WebElement dropdown = driver1.findElement(By.id("q3"));
		Select s = new Select(dropdown);
		s.selectByVisibleText("Third Option");
		WebElement radiobutton=driver1.findElement(By.xpath("//input[@value='Third Option']"));
		radiobutton.click();
		WebElement checksingle=driver1.findElement(By.id("q5"));
		checksingle.click();
		WebElement checkmulti=driver1.findElement(By.xpath("//input[@value='Second Check Box']"));
		checkmulti.click();
		WebElement checkbox=driver1.findElement(By.xpath("//input[@value='Fifth Check Box']"));
		checkbox.click();
		WebElement dataselect=driver1.findElement(By.id("q8"));
		Select s1=new Select(dataselect);
		s1.selectByVisibleText("ME");
		List<WebElement> checkboxlist=driver1.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("total number of checkbox is " +checkboxlist.size());
		for(int i =0;i<checkboxlist.size();i++) {
			checkboxlist.get(i).click();
		}
		List<WebElement> radiobutton1=driver1.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("total number of radiobutton "+radiobutton1.size());
		for(int i=0;i<radiobutton1.size();i++) {
			radiobutton1.get(i).click();
		}
		List<WebElement> textboxlist=driver1.findElements(By.xpath("//input[@type='text']"));
		System.out.println("total textbox is "+textboxlist.size());
		for(int i=0;i<textboxlist.size();i++) {
			textboxlist.get(i).click();
		}
		List<WebElement> link=driver1.findElements(By.tagName("a"));
		System.out.println("number of list "+link.size());
		List<WebElement> lists=driver1.findElements(By.xpath("//*[@id=\"left_col_top\"]/ul/li/a"));
		System.out.println("list of froms "+ lists.size());
		
		
		TakesScreenshot src = (TakesScreenshot) driver1;
		File Se=src.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Se, new File("C:\\Users\\ismai\\eclipse-workspace\\mavendemo\\screenshot/myseleneim.Jpg"));

		
	}

}
