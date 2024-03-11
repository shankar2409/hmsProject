package com.practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class BrokenLinkTest {
	static LinkedHashSet<String> succesfullLinks;

	public static void main(String[] args) throws IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		succesfullLinks = new LinkedHashSet<String>();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Assert.fail();
//		driver.get("http://www.epfindia.gov.in");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a|//link"));
		System.out.println(allLinks.size());
		for (WebElement we : allLinks) {
			String eachLink = we.getAttribute("href");
			if (eachLink != null) {
				getlinkResponse(eachLink);
			}
		}
		System.err.println("----Broken Links----");
		for (String str : succesfullLinks) {
			System.out.println(str);
		}
	}

	public static void getlinkResponse(String eachLink) {
		try {
			URL url = new URL(eachLink);
			HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
			int statusCode = httpConn.getResponseCode();
			if (statusCode >= 400) {
				System.out.println(eachLink + "------->" + statusCode);
			} else {
				succesfullLinks.add(eachLink + "---->" + statusCode);
			}
		} catch (Exception e) {

		}
	}
}
