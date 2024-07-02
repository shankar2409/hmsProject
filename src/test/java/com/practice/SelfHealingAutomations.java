package com.practice;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.epam.healenium.SelfHealingDriver;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class SelfHealingAutomations {
	@Test
	public void selfHealing() {
		WebDriver driver2=new ChromeDriver();
		WebDriver driver = SelfHealingDriver.create(driver2);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("shankar");
	}
	@Test
	public void mai() {
		WebDriver delegate = new ChromeDriver();
		Config config = ConfigFactory.load("/com.sampleProject/src/test/resources/healenium.properties");
		WebDriver driver=SelfHealingDriver.create(delegate, config);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.co.in/");
		
	}
}
