package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hms.genericUtils.WebDriverUtils;

public class FetchScoresForEachBatsman {
	static WebDriverUtils wLib;
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		wLib=new WebDriverUtils();
		wLib.maximizeWindow(driver);
		wLib.WaitForPageLoad(driver, 20);
		driver.get("https://www.cricbuzz.com/");
		driver.findElement(By.id("live-scores-link")).click();
		driver.findElement(By.xpath("//div[contains(@class,'cb-mtch') and contains(.,'Rangpur')]/descendant::a[text()='Scorecard']")).click();
		List<WebElement> batsman = driver.findElements(By.xpath("//div[text()='Batter']/parent::div/following-sibling::div/descendant::a[@class='cb-text-link']"));
		List<WebElement> scores = driver.findElements(By.xpath("//div[text()='Batter']/parent::div/following-sibling::div/descendant::div[contains(@class,'cb-col cb-col-8 text-right ')]"));
		int i=0;
		System.out.println("batsman"+"          "+"score");
		System.out.println("-----------------------");
		for (WebElement we : scores) {
			System.out.println(batsman.get(i).getText()+" -- "+we.getText()+" Runs");
			i++;
		}
		
	}
}
