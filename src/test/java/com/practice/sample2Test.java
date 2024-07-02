package com.practice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.hms.genericUtils.AllureListener;
import com.hms.genericUtils.BaseClass;
import com.hms.genericUtils.ITestListenerImpClass;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

@Listeners({AllureListener.class,ITestListenerImpClass.class})
public class sample2Test extends BaseClass{
	@Test(groups = "regression")
	@Description("for login With valid UN AND PWD")
	@Epic("EPIC:001")
	@Feature("feature:1")
	@Story("login")
	@Step("verify login")
	public void testScript7_Test() {
		System.out.println("sample2Test---");
		
		driver.get("https://www.mygov.in/");

		List<WebElement> allLinks = driver.findElements(By.xpath("//img|//svg"));

		ArrayList<String> brokenLink = new ArrayList<String>();

		for (WebElement e : allLinks) {
			String links = e.getAttribute("src");

			int statusCode = 0;
			try {
				URL url = new URL(links);

				URLConnection urlconn = url.openConnection();

				HttpURLConnection httpurl = (HttpURLConnection) urlconn;

				statusCode = httpurl.getResponseCode();

				if (statusCode >= 0) {
					brokenLink.add(links + " " + statusCode);

				}
			} catch (Exception w) {

			}
		}
		System.out.println(brokenLink);
	}
	@Test
	@Description("for login With valid UN AND PWD")
	@Epic("EPIC:001")
	@Feature("feature:2")
	@Story("logout")
	@Step("verify login")
	public void test2() {
		driver.get("https://www.mygov.in/");
		Assert.assertTrue(false);
	}

}
