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
		List<WebElement> toolTip = driver.findElements(By.cssSelector("[class='highcharts-markers highcharts-series-2 highcharts-spline-series highcharts-tracker'] [fill='#B8204C']"));
		Point move = toolTip.get(0).getLocation();
		int x = move.getX();
		int y = move.getY();
		Actions action = new Actions(driver);
		action.scrollByAmount(x,y).perform();
		for (WebElement we : toolTip) {
		try {
			System.out.println(we.getText());
			action.moveToElement(we).click().perform();
//			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
			//wait.until(ExpectedConditions.visibilityOf(we));
			WebElement text = driver.findElement(
					By.cssSelector("[class='highcharts-label highcharts-tooltip highcharts-color-undefined'] text"));
			System.out.print(text.getText());
		} catch (Exception e) {
			System.out.println("exception");
			
		}
		}
	}
}
