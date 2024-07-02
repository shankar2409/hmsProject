package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class cricbuzzPointsTable {
	@Test
	public void name() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.cricbuzz.com/");
		driver.findElement(By.xpath("//a[text()='Points Table']")).click();
		List<WebElement> teams = driver.findElements(By
				.xpath("//table[@class='table cb-srs-pnts']/tbody/tr/td/descendant::div[@class=\"cb-col cb-col-84\"]"));
		for (WebElement team : teams) {
			System.out.println(team.getText());
		}
	}
}
