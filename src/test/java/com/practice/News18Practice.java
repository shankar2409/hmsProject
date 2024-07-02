package com.practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class News18Practice {

	@Test
	public void test1() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.news18.com/");
		driver.findElement(By.xpath(
				"//div[@id='stickyNavContainer']/descendant::ul[contains(@class,'topNavList')]/descendant::a[text()='India']"))
				.click();
		String heading = "TRENDING TOPICS";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		for (;;) {
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			try {
				WebElement element = driver.findElement(By.xpath("//span[contains(.,'TRENDING TOPICS')]"));
				break;
			} catch (NoSuchElementException e) {
				Thread.sleep(3000);
			}

		}
		String parentId = driver.getWindowHandle();
		List<WebElement> trndingTopic = driver
				.findElements(By.xpath("//footer[@id='footer_ajax_div']/descendant::span[contains(.,'" + heading
						+ "')]/following-sibling::div/child::a"));
		String expect = "";
		for (WebElement we : trndingTopic) {
			System.out.println(we.getText());
			String expected = we.getText();
			we.click();
			try {
				Set<String> AllId = driver.getWindowHandles();
				for (String id : AllId) {
					String acttitle = driver.switchTo().window(id).getTitle();
					if (expected.contains(acttitle)) {
						break;
					}
				}
				expect = driver
						.findElement(By.xpath(
								"//img[@src='https://images.news18.com/static_news18/pix/ibnhome/news18/News18.svg']"))
						.getAttribute("title");
			} catch (Exception e) {
				try {
					Assert.assertEquals(expect, "News18 - Latest News");
					driver.close();
					driver.switchTo().window(parentId);
				} catch (Exception e1) {
					// TODO: handle exception
				}
			}finally {
				Assert.assertEquals(expect, "News18 - Latest News");
				driver.navigate().back();
			}
		}

	}
}
