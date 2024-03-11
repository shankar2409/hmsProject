package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hms.genericUtils.WebDriverUtils;

public class OlympicsMedalForEachCountry {
	public static void main(String[] args) {
		WebDriverUtils wLib=new WebDriverUtils();
		WebDriver driver=new ChromeDriver();
		wLib.maximizeWindow(driver);
		wLib.WaitForPageLoad(driver, 20);
		driver.get("https://olympics.com/en/olympic-games/tokyo-2020/medals");
		
		WebElement ele = driver.findElement(By.cssSelector("[id='onetrust-pc-btn-handler']"));
		wLib.waitUntilElementToBeVisible(driver, 20, ele);
		ele.click();
		WebElement ele1 = driver.findElement(By.xpath("//button[text()='Reject All']"));
		wLib.waitUntilElementToBeVisible(driver, 20, ele1);
		ele1.click();
		List<WebElement> countryNames = driver.findElements(By.cssSelector("[data-cy='country-name']"));
		List<WebElement> golds = driver.findElements(By.cssSelector("[title='Gold']"));
		List<WebElement> silvers = driver.findElements(By.cssSelector("[title='Silver']"));
		List<WebElement> bronzes = driver.findElements(By.cssSelector("[title='Bronze']"));
		List<WebElement> totalMedals = driver.findElements(By.xpath("//span[@data-cy='medal-main' and @class='sc-kfYpNk cUKPAX']/parent::div[@title='']"));
		for(int i=0;i<=countryNames.size()-1;i++) {
			String countryName = countryNames.get(i).getText();
			String gold = golds.get(i).getText();
			String silver = silvers.get(i).getText();
			String bronze = bronzes.get(i).getText();
			String totalMedal = totalMedals.get(i).getText();
			if (gold.contains("-")) {
				gold="0";
			}
			if(silver.contains("-")) {
				silver="0";
			}
			if (bronze.contains("-")) {
				bronze="0";
			}
			System.out.println(countryName+"--->"+gold+"->"+silver+"->"+bronze+"->total  :"+totalMedal);
		}
	}
}
