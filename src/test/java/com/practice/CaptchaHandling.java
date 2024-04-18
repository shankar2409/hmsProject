package com.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CaptchaHandling {
	@Test
	public void t1() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://bskytmspp.odisha.gov.in:8008/");
		String text = driver.findElement(By.id("question")).getText();
		System.out.println(text);
		text=text.replace(" ", "");
		String[] text1 = text.split("[^0-9]");
		int sum=0;
		for (String str : text1) {
			sum+=Integer.parseInt(str);
		}
		Thread.sleep(2000);
		driver.findElement(By.id("captcha")).sendKeys(sum+"");
		
	}
}
