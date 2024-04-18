package com.practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class BigBasketList {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		Robot r=new Robot();
		try {
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_MINUS);
			r.keyPress(KeyEvent.VK_MINUS);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_MINUS);
			r.keyRelease(KeyEvent.VK_MINUS);
		} finally {
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_MINUS);
			r.keyRelease(KeyEvent.VK_MINUS);
		}
		WebElement sort = driver.findElement(By.cssSelector("[id='headlessui-menu-button-:R5bab6:']"));
		sort.click();
		List<WebElement> majorelmts = driver.findElements(By.xpath(
				"//div[contains(@class,'StyledMenuItems-sc-d3svbp-4 cAslOa')]/descendant::ul[contains(@class,'bg-darkOnyx')]/child::li"));
	
		for (WebElement we : majorelmts) {
			act.moveToElement(we).perform();
			String stge1 = we.getText();
			System.out.println(stge1);
			System.out.println("_______________");
			// 2nd layer
			List<WebElement> side = driver.findElements(By.xpath(
					"//div[contains(@class,'StyledMenuItems-sc-d3svbp-4 cAslOa')]/descendant::ul[contains(@class,'bg-silverSurfer')]/child::li"));
			for (WebElement s : side) {
				String dsi = s.getText();
				act.moveToElement(s).perform();
				// 3rd layer
				List<WebElement> list = driver.findElements(By.xpath(
						"//div[contains(@class,'StyledMenuItems-sc-d3svbp-4 cAslOa')]/descendant::ul[contains(@class,'bg-white')]/child::li"));
				System.out.print(dsi + "--->");
				for (WebElement web : list) {
					System.out.print(web.getText() + " : ");
				}
				System.out.println();
				Thread.sleep(2000);
			}
			System.out.println("");
			System.out.println("");
			System.out.println("");
		}
		driver.quit();
	}
}
