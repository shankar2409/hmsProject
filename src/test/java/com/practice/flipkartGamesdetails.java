package com.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkartGamesdetails {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.flipkart.com/");
	WebElement majorTab = driver.findElement(By.cssSelector("div[aria-label='Electronics']"));
	Actions act=new Actions(driver);
	act.moveToElement(majorTab).perform();
	driver.findElement(By.xpath("//div[@class=\"_16rZTH\"]//a[contains(.,'Gaming')]")).click();
	driver.findElement(By.xpath("//div[contains(.,'Gaming')]/following-sibling::div/a[text()='Games']")).click();
	String expectedData="Red Dead Redemption 2".toLowerCase();
	List<WebElement> list = driver.findElements(By.cssSelector("div[class='_13oc-S'] a[class='s1Q9rs']"));
	for (WebElement we: list) {
		String prodName = we.getText();
//		System.out.println(prodName);
		if(prodName.toLowerCase().contains(expectedData)) {
			String rating = driver.findElement(By.xpath("//a[@title='"+prodName+"']/following-sibling::div//div[@class='_3LWZlK']")).getText();
			String price = driver.findElement(By.xpath("//a[@title='"+prodName+"']/following-sibling::a//div[@class='_30jeq3']")).getText();
			
			System.out.println(prodName+"  "+rating+"  "+price);
			break;
		}
	}
	driver.quit();
}
}
