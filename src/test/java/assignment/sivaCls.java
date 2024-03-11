package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sivaCls {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.worldometers.info/coronavirus/");
		Actions act=new Actions(driver);
		driver.findElement(By.cssSelector("[href=\"#coronavirus-cases-linear\"]")).click();
		List<WebElement> ele = driver.findElements(By.cssSelector("[fill='#999']"));
		for (WebElement we : ele) {
			act.moveToElement(we).perform();
			try {
				String text = driver.findElement(By.cssSelector("[class=\"highcharts-label highcharts-tooltip highcharts-color-undefined\"] text")).getText();
				System.out.println(text);
			} catch (Exception e) {
				continue;
			}
		}
	}
}
