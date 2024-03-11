package com.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class goiboboCalenderTest {
	public static void main(String[] args) throws InterruptedException {
		String monthyear="July 2024";
		int date=21;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.goibibo.com/flights/");
		driver.findElement(By.xpath("//span[@class=\"sc-12foipm-17 eBxhjL fswWidgetLabel\"]/following-sibling::p")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("///span[@class=\"sc-12foipm-39 hRfNRh\"]/following-sibling::input")).sendKeys("chennai");
		driver.findElement(By.cssSelector("[class='logSprite icClose'")).click();
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		for(;;) 
		{
			try {
				driver.findElement(By.xpath("//div[text()='"+monthyear+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+date+"']")).click();
				break;
			} catch (Exception e) {
				driver.findElement(By.cssSelector("[aria-label='Next Month']")).click();
			}
		}
		driver.findElement(By.cssSelector("[class='fswTrvl__done']")).click();
	} 
}
