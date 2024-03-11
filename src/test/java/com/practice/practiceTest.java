package com.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceTest {
	public static void main(String[] args) {
		String monthyear = "March 2024";
		int date = 23;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		try {

			driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();
		} catch (Exception e) {
			try {
				driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
				driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();
				driver.switchTo().defaultContent();
			} catch (Exception e2) {
			}
		} finally {
			System.out.println("done");

		}
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		driver.findElement(By.xpath(
				"//div[text()='"+monthyear+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+date+"']"))
				.click();
		monthyear="May 2024";
		driver.findElement(By.xpath("//span[text()='Return']")).click();
		for (;;) {
			try {
				driver.findElement(By.xpath(
						"//div[text()='"+monthyear+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+date+"']")).click();
				break;
			} catch (Exception e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
	}
}
