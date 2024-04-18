package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MockTest {
	@Test
	public void mock() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://emicalculator.net");
		Actions act = new Actions(driver);
		List<WebElement> percent = driver.findElements(By.cssSelector(
				"[id='emipiechart'] [class='highcharts-data-labels highcharts-series-0 highcharts-pie-series highcharts-tracker'] tspan"));
		for (WebElement we : percent) {
			act.moveToElement(we).perform();
			WebElement tooltip = driver
					.findElement(By.cssSelector("[class*='highcharts-label highcharts-tooltip'] tspan"));
			System.out.println(tooltip.getText());

			System.out.println(we.getText());
		}
		
		
		
		
		List<WebElement> toolTip = driver.findElements(By.cssSelector(
				"[class='highcharts-markers highcharts-series-2 highcharts-spline-series highcharts-tracker'] [fill='#B8204C']"));
		Point move = toolTip.get(0).getLocation();
		int x = move.getX();
		int y = move.getY();
		Actions action = new Actions(driver);
		action.scrollByAmount(x, y+200).perform();
		for (WebElement we : toolTip) {
			try {
				System.out.println(we.getText());
				action.moveToElement(we).click().perform();
//			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
				// wait.until(ExpectedConditions.visibilityOf(we));
				WebElement text = driver.findElement(By
						.cssSelector("[class='highcharts-label highcharts-tooltip highcharts-color-undefined'] text"));
				System.out.print(text.getText());
			} catch (Exception e) {
				System.out.println("exception");

			}
		}
		
		int k=0;
		List<WebElement> el = driver.findElements(By.cssSelector("[id=\"emibarchart\"] [class=\"highcharts-series-group\"] rect"));
		for (WebElement we: el) {
			act.moveToElement(we).perform();
			WebElement tp = driver.findElement(By.cssSelector("[class=\"highcharts-label highcharts-tooltip highcharts-color-undefined\"] text"));
			if (el.size()>=0) {
				System.out.println(tp.getText());
			} else {
				if (k++==0) {
					System.out.println("--------------");
				}
				System.out.println(tp.getText());
			}
		}
		
	}
}
