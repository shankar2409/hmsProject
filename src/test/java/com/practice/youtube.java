package com.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class youtube {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com/");
	WebElement de = new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(By.name("search_query")));
	de.sendKeys("s");
	Thread.sleep(1000);
	de.sendKeys("o");
	Thread.sleep(1000);
	de.sendKeys("n");
	Thread.sleep(1000);
	de.sendKeys("g");
	Thread.sleep(1000);
//	driver.findElement(By.id("search")).sendKeys("song");
//	driver.findElement(By.id("search-icon-legacy")).click();
	List<WebElement> dewe = driver.findElements(By.className("sbqs_c"));
	for (WebElement we : dewe) {
		String text = we.getText();
		if (text.contains("new")) {
			we.click();
			break;
		}
	}
	}
}
