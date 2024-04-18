package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class myntraPractice  {
	@Test
	public void test() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable -notifications");
		 ChromeDriver driver = new ChromeDriver(options);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://www.myntra.com");
		 WebElement men = driver.findElement(By.xpath("//header[@id='desktop-header-cnt']/descendant::a[text()='Men']"));
		 Point loc = men.getLocation();
		 int x = loc.getX();
		 int y = loc.getY();
		 Actions act=new Actions(driver);
		 act.moveToLocation(x, y).perform();
		 driver.findElement(By.xpath("//a[text()='Men']/parent::div/descendant::a[text()='Jackets']")).click();
		 driver.findElement(By.cssSelector("[class='sort-sortBy']")).click();
		 List<WebElement> sortlist = driver.findElements(By.xpath("//ul[@class='sort-list']/descendant::label"));
		 
		 String expectedData="Popularity";
		 for (WebElement we: sortlist) {
			if (we.getText().contains(expectedData)) {
				we.click();
				break;
			}
		}
		 
		
	}
}
