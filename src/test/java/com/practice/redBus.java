package com.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class redBus {
	@Test
	public void name() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().setSize(new Dimension(5000, 4000));
		String options="Train Tickets";
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//li[@class='rb_vertical link active']/child::span[text()='"+options+"']")).click();
		WebElement from =driver.findElement(By.id("src"));
		from.clear();
//		from.click();
		from.sendKeys("bengaluru");
		List<WebElement> fromsug = driver.findElements(By.cssSelector("[class=\"sc-dnqmqq eFEVtU\"] [class=\"sc-gZMcBi grvhsy\"] [class=\"placeHolderMainText\"]"));
		for (WebElement web : fromsug) {
			if (web.getText().contains("bengaluru")) {
				web.click();
				break;
			}
		}
	
		WebElement to =driver.findElement(By.id("dest"));
		to.clear();
//		from.click();
		to.sendKeys("chennai",Keys.ENTER,Keys.ENTER);
		
				
		
		
	}
}
