package assignment;
/**
 * 20-02-2024 
 * xpath assigment
 */

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hms.genericUtils.WebDriverUtils;

public class FetchMobileNameBasedOnMobilePrice {
	static WebDriver driver;
	static WebDriverUtils wLib; 
	public static void main(String[] args) {
		driver=new ChromeDriver();
		wLib = new WebDriverUtils();
		wLib.WaitForPageLoad(driver, 20);
		wLib.maximizeWindow(driver);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung mobiles");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> priceElements = driver.findElements(By.cssSelector("[class='a-price-whole']"));
		List<WebElement> mobileNames = driver.findElements(By.cssSelector("[class='a-size-medium a-color-base a-text-normal']"));
		
		driver.findElement(By.xpath("//span[text()='Brand']/../following-sibling::ul//span[text()='Samsung']/preceding-sibling::div")).click();
		int count=0;
		int result=0;
		for(WebElement ele:priceElements) {
			String pr = ele.getText().replace(",", "");
			int price = Integer.parseInt(pr);
//			System.out.println(price);
			if(price<20000) {
				System.out.println(pr+" ----  "+mobileNames.get(count).getText());
				result++;
			}
			count++;
		}  
		System.out.println(count);
		System.err.println("total mobiles present in webpage for below 20000  >>>"+result);
	}
}
