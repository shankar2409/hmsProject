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

public class BrokenImages {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

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
}
