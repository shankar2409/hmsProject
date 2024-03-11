package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonTaskprintallFashionElements {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		WebElement fashion = driver.findElement(By.cssSelector("[class=\"YBLJE4\"] [alt='Fashion']"));
		Actions act=new Actions(driver);
		act.moveToElement(fashion).perform();
		WebElement es = driver.findElement(By.xpath("//a[text()='Women Western']"));
		act.moveToElement(es).perform();
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class=\"uAl2uE\"]/following-sibling::a"));
		for (WebElement we : elements) {
			System.out.println(we.getText());
		}
		
	}
}
