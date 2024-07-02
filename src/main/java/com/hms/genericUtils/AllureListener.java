package com.hms.genericUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.epam.healenium.SelfHealingDriver;

import io.qameta.allure.Attachment;

public class AllureListener implements ITestListener {
	public static String getMethodName(ITestResult result) {
		return result.getMethod().getMethodName();
	}

	@Attachment
	public byte[] getScreenShot(WebDriver driver) {
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	}

	@Attachment(value = "{0}", type = "text/plain")
	public static String setMsg(String message) {
		return message;
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("i am in test started" + getMethodName(result));
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test passed " + getMethodName(result));
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("i am in test failed" + getMethodName(result));
		 WebDriver dri = BaseClass.driver;
			getScreenShot(BaseClass.driver);
		setMsg("screenshot taken!");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("i am in test started" + getMethodName(result));
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("i am in suite Execute" + context.getName());
		context.setAttribute("WebDriver", BaseClass.driver); 
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

}
