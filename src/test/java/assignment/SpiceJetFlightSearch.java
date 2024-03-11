package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.hms.genericUtils.WebDriverUtils;

public class SpiceJetFlightSearch {
	public static void main(String[] args) {
		WebDriverUtils w=new WebDriverUtils();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		w.maximizeWindow(driver);
		w.WaitForPageLoad(driver, 20);
		driver.get("https://www.spicejet.com/");
		//round trip
		driver.findElement(By.xpath("//div[text()='round trip']/parent::div/preceding-sibling::div")).click();
		WebElement from = driver.findElement(By.xpath("//div[text()='From']/following-sibling::div/child::input"));
		from.click();
		from.sendKeys("chennai");
		WebElement to = driver.findElement(By.xpath("//div[text()='To']/following-sibling::div/child::input"));
		to.click();
		to.clear();
		to.sendKeys("coimbatore");
		String month="June-2025";
		String fD="22",FR="27";
		WebElement fromDate = driver.findElement(By.xpath("//div[contains(@data-testid,'"+month+"')]/descendant::div[text()='"+fD+"']"));
		fromDate.click();
		WebElement toDate = driver.findElement(By.xpath("//div[contains(@data-testid,'"+month+"')]/descendant::div[text()='"+FR+"']"));
		toDate.click();
		String drop="Family & Friends";
		driver.findElement(By.xpath("//div[text()='"+drop+"']/parent::div/preceding-sibling::div")).click();
		
		WebElement search = driver.findElement(By.xpath("//div[text()='Search Flight']"));
		
		w.waitUntilElementToBeClickable(driver, 10, search);
		w.actionObj(driver).click(search).perform();
		
	}
}
