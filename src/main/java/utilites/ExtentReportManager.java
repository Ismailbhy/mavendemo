package utilites;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Brase.BaseUI;

public class ExtentReportManager {
	public static ExtentReports extent;
	public static ExtentSparkReporter reporter;
	
	public static ExtentReports  getReportInstance() {
		extent= new ExtentReports();
		String repName="TestReport"+BaseUI.timestamp+".html";
		reporter=new ExtentSparkReporter(System.getProperty("user.dir")+"\\Reports\\"+repName);
		extent.attachReporter(reporter);
		extent.setSystemInfo("OS", System.getProperty("os.name"));
		extent.setSystemInfo("User Name", "Ismail");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Application Name", "My contact form");
		extent.setSystemInfo("Application Version", "1.0");
		reporter.config().setDocumentTitle("Automation Report");
		reporter.config().setReportName("Contact Form-Funtional Test");
		reporter.config().setTheme(Theme.DARK);
		return extent;
		/*This manager is creating your report, saving your report in a particular location and configure your report, from this i add the loger to listerner,*/
		
	}
	

}
