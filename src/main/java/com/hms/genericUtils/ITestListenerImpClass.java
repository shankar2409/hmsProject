package com.hms.genericUtils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ITestListenerImpClass implements ITestListener {
	ExtentReports report;
	ExtentTest test;
	
	@Override
	public void onStart(ITestContext context) {
		ExtentSparkReporter htmlReport = new ExtentSparkReporter("./ExtentReports/report.html");
		htmlReport.config().setDocumentTitle("HospitalManagementSystem");
		htmlReport.config().setTheme(Theme.STANDARD);
		htmlReport.config().setReportName("hms");
		report = new ExtentReports();
		report.attachReporter(htmlReport);
	}

	@Override
	public void onTestStart(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		test = report.createTest(methodName);
		Reporter.log(methodName + "---> Execution Reports");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		try {
			String screenshot = WebDriverUtils.takeScreenShotForWebPage(BaseClass.driver, methodName);
			test.log(Status.FAIL, methodName + " testScript Failed");
			test.log(Status.FAIL, result.getThrowable());
			Reporter.log(methodName + "---Failed");
			test.addScreenCaptureFromPath(screenshot);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		test.log(Status.SKIP, methodName + "--->Skipped");
		test.log(Status.SKIP, result.getThrowable());
		Reporter.log(methodName + "--Test Script Skipped");
	}



	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		test.log(Status.PASS, methodName + "--->Passed");
		Reporter.log(methodName + "--->test Script executed Succesfully");
	}

	@Override
	public void onFinish(ITestContext context) {
		
		String browserName=BaseClass.browserName;
		String browserVersion=BaseClass.browserVersion;
		String osName=System.getProperty("os.name");
		String JDKVersion=System.getProperty("java.version");
		
		
		report.setSystemInfo("Base Platform ",osName);
		report.setSystemInfo("Base browser", browserName);
		report.setSystemInfo(browserName+"Version", browserVersion);
		report.setSystemInfo("JDK Version", JDKVersion);
		
		report.setSystemInfo("Base url", IpathConstants.BaseUrl);
		report.setSystemInfo("ReporterName", "Shankar");
		
		
		report.flush();
	}
}
