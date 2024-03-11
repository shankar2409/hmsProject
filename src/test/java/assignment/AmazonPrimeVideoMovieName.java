package assignment;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.hms.genericUtils.WebDriverUtils;

public class AmazonPrimeVideoMovieName {
	public static void main(String[] args) throws InterruptedException {
		WebDriverUtils w = new WebDriverUtils();
		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options);
		w.maximizeWindow(driver);
		w.WaitForPageLoad(driver, 20);
		WebElement movi =null;
		WebElement home =null;
		driver.get("https://www.primevideo.com");
		Actions action = new Actions(driver);
		try {
			home = driver.findElement(By.xpath("//a[@data-testid=\"branding\"]/following-sibling::div/descendant::label[@for=\"pv-nav-home\"]"));
			action.moveToElement(home).perform();
			movi = driver.findElement(By.xpath("//a[.='Movies']"));
			action.click(movi).perform();
		} catch (Exception e) {
			System.out.println("exception");
			w.WebDriverWaitObj(driver, 20).until(ExpectedConditions.presenceOfNestedElementLocatedBy(home, By.xpath("//a[.='Movies']")));
//			movi.click();
		}
		
		List<WebElement> mov = driver.findElements(By.xpath(
				"//p[.='Action and adventure movies']/ancestor::section[@data-testid='standard-carousel']/descendant::ul[@class='_70Gje9']/li[@class='tHfREs']"));
		int i = 0;
		for (WebElement webElement : mov) {
			action.scrollToElement(webElement).perform();
			Thread.sleep(1000);
			System.out.println(mov.get(i).getText());
			i++;
		}

		System.out.println("done...");
		driver.quit();
	}
}
