package utilites;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Brase.BaseUI;

public class Listeners implements ITestListener {
	public static ExtentReports extent;
	public static ExtentTest logger;
	public void onStart(ITestContext testcontext) {
		extent = ExtentReportManager.getReportInstance();
	}
	public void onTestStart(ITestResult result) {
		logger = extent.createTest(result.getName());
		BaseUI.logger = logger;
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.log(Status.PASS,
				MarkupHelper.createLabel(result.getName(),ExtentColor.GREEN));
		
		String testname=result.getName();
		String filePath="C:\\Users\\ismai\\eclipse-workspace\\mavendemo\\ScreenShots\\"+testname+"passed.png";
		try {
			BaseUI.takeScreenShot(filePath);
			logger.log(Status.PASS,
					"Snapshot attached: "
							+ logger.addScreenCaptureFromPath(filePath));
		}catch(Exception e) {
			e.printStackTrace();
		}
		//ITestListener.super.onTestSuccess(result);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.log(Status.FAIL,
				MarkupHelper.createLabel(result.getName(),ExtentColor.RED));
		String testname=result.getName();
		String filePath="C:\\Users\\ismai\\eclipse-workspace\\mavendemo\\ScreenShots\\"+testname+BaseUI.timestamp+"passed.png";
		BaseUI.takeScreenShot(filePath);
		logger.log(Status.FAIL, "Actual result " +
		logger.addScreenCaptureFromPath(filePath));
	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger=extent.createTest(result.getName());
		logger.log(Status.SKIP,
				MarkupHelper.createLabel(result.getName(),ExtentColor.ORANGE));
		String testname=result.getName();
		String filePath="C:\\Users\\ismai\\eclipse-workspace\\mavendemo\\ScreenShots\\"+testname+BaseUI.timestamp+"passed.png";
		BaseUI.logger =logger;
	}

	

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		//System.out.println("Test Finished");
		extent.flush();
		/* what is happening,what colour it need to display*/
	}

}
