package com.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class goiboboCalenderTest {
	public static void main(String[] args) throws InterruptedException {
		String monthyear = "July 2024";
		int date = 21;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.goibibo.com/flights/");
		driver.findElement(By.cssSelector("[class='logSprite icClose']")).click();

		driver.findElement(By.xpath("//span[@class='sc-12foipm-17 eBxhjL fswWidgetLabel']/following-sibling::p"))
				.click();
		String from = "chennai";
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='sc-12foipm-39 hRfNRh']/following-sibling::input")).sendKeys(from);
		List<WebElement> airportList = driver
				.findElements(By.xpath("//div[@class=\"sc-12foipm-43 jTMHVp\"]//p[@class='sc-12foipm-47 zfkap']"));
		for (WebElement we : airportList) {
			System.out.println(we.getText().toLowerCase());
			if (we.getText().toLowerCase().contains(from)) {
				we.click();
				break;
			}
		}

		String to = "coimbatore";
		try {
			driver.findElement(By.cssSelector("[class='sc-12foipm-20 bhnHeQ']")).click();
		} catch (Exception e) {
			System.out.println("exception");
		}
		driver.findElement(By.xpath("//div[@class='sc-12foipm-38 dAUhfz']//input")).sendKeys(to);
		List<WebElement> toairportList = driver
				.findElements(By.xpath("//div[@class=\"sc-12foipm-43 jTMHVp\"]//p[@class='sc-12foipm-47 zfkap']"));
		for (WebElement we : toairportList) {
			System.out.println(we.getText().toLowerCase());
			if (we.getText().toLowerCase().contains(to)) {
				we.click();
				break;
			}
		}

		try {
			driver.findElement(By.xpath("//span[text()='Departure']")).click();
		} catch (Exception e) {
			System.out.println("exception in calender clicking");
		}
		for (;;) {
			try {
				driver.findElement(By.xpath("//div[text()='" + monthyear
						+ "']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='" + date + "']")).click();
				break;
			} catch (Exception e) {
				driver.findElement(By.cssSelector("[aria-label='Next Month']")).click();
			}
		}
		driver.findElement(By.cssSelector("[class='fswTrvl__done']")).click();
	}
}
