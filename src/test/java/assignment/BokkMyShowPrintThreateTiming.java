package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BokkMyShowPrintThreateTiming {
	@Test(expectedExceptionsMessageRegExp = "NoSuchElementException")
	public void bookMyShow() throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("start-maximized");
		options.addArguments("disable-infobars");
		options.addArguments("--disable-extensions");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://in.bookmyshow.com/");
		driver.findElement(By.xpath("//div[@class='bwc__sc-ttnkwg-17 gvzyfS']/following::span[text()='Bengaluru']"))
				.click();
		driver.findElement(By.xpath("//div[@class='sc-lnhrs7-4 dDgeSF']/descendant::div[text()='Dune: Part Two']"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//div[@class='sc-2k6tnd-1 kfhxuo']/parent::div/following-sibling::div//descendant::span[text()='Book tickets']"))
				.click();
		WebElement format = driver.findElement(By.xpath("//div[@class='sc-10qvp23-0 eyzMRC']/div"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(format));
		Thread.sleep(4000);
		driver.findElement(By.xpath(
				"//span[text()='English']/parent::section/following-sibling::section//descendant::span[text()='2D']"))
				.click();

//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("cf-chl-widget-ksyw7"));
//		wait.until(ExpectedConditions
//				.elementToBeClickable(driver.findElement(By.xpath("//div[@id='content']/descendant::input"))));

//		driver.findElement(By.xpath("//div[@id='content']/descendant::input")).click();
		Thread.sleep(3000);
		List<WebElement> threatreName = driver.findElements(By.cssSelector("[class='__venue-name']"));
		Thread.sleep(3000);
		List<WebElement> timings = driver.findElements(By.cssSelector("[class='showtime-pill-wrapper']"));
		for (int i = 0; i < threatreName.size(); i++) {
			System.out.println(threatreName.get(i).getText() + "  " + timings.get(i).getText());
		}
	}
}
