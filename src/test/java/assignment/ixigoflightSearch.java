package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import com.hms.genericUtils.WebDriverUtils;

public class ixigoflightSearch {

	public static void main(String[] args) throws InterruptedException {
		WebDriverUtils wLib = new WebDriverUtils();
		ChromeDriver driver = new ChromeDriver();
		wLib.maximizeWindow(driver);
		wLib.WaitForPageLoad(driver, 20);
		driver.get("https://www.ixigo.com/");
		WebElement clk = driver.findElement(By.xpath("//p[@data-testid='originId']"));
		Actions act=new Actions(driver);
		String expdata="mumbai";
		act.click(clk).perform();
//		clk.sendKeys(expdata);
//		WebElement ele = driver.findElement(By.xpath("//label[.='From']/following-sibling::input"));
//		ele.clear();
//		ele.sendKeys(expdata);
		driver.findElement(By.xpath("//input[contains(@class,'outline-none w-full bg-transparent placeholder:text-disabled pt-3 text-primary placeholder:opacity-0 focus:placeholder:opacity-100 font-medium text-lg !pt-5')]")).sendKeys(expdata);
		//label[.='From']/ancestor::div[contains(@class,'w-full flex')]/following-sibling::div[contains(@class,'overflow-y-scroll absolute top')]//p[@class='body-sm text-secondary']
		List<WebElement> from = driver.findElements(By.xpath("//li[contains(@class,'flex items-center')]/descendant::p[contains(@class,'body-sm text')]"));
		for(WebElement ele1:from) {
			if(ele1.getText().contains(expdata)) {
				ele1.click();
				break;
			}
		}
		

	}
}
