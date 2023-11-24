package Brase;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import utilites.DateUtiles;

public class BaseUI {
	public static WebDriver driver;
	public static String timestamp=DateUtiles.getTimestamp();
	
	public static ExtentReports extent;
	public static ExtentTest logger;
	public static void setDriver(WebDriver driver) {
		BaseUI.driver=driver;

}
	public static void takeScreenShot(String filePath) {
		try {
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File(filePath));
		}catch(Exception O) {
			O.printStackTrace();
			/*bas class storing  reusable action
			if i want to open the browser,if i want to click,if i want to sent keys,if i want to pass the ural, so far everything we are using the baseui
			*/
		}
	}
}
