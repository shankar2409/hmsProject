package com.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class hOverMessages {
//	class="Toastify":
			@Test
			public void main() {
				ChromeDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get("https://www.shoppersstack.com/cart");
				driver.findElement(By.id("buynow_fl")).click();
//				driver.findElement(By)
		
	}
}
