package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hms.genericUtils.WebDriverUtils;

public class ProKabbadiScore {
	public static void main(String[] args) {
		WebDriverUtils wLib=new WebDriverUtils();
		WebDriver driver=new ChromeDriver();
		wLib.maximizeWindow(driver);
		wLib.WaitForPageLoad(driver, 20);
		driver.get("https://www.prokabaddi.com/");
		List<WebElement> teamNames = driver.findElements(By.cssSelector("[class='name']"));
		System.out.println("teamName    played  wins    loss   tie    scoreDiff   recentWin  points");
		for (WebElement we : teamNames) {
			String teamName = we.getText();
			System.out.print(teamName+"  >>");
			List<WebElement> ele = driver.findElements(By.xpath("//div[@class='table-data team' and contains(.,'"+teamName+"')]/following-sibling::div/descendant::p"));
			for (WebElement we1 : ele) {
				System.out.print(we1.getText()+"  ");
			}
			System.out.println();
		}
	}
}
//h1[normalize-space(text())='PKL Standings']/ancestor::div[@class='layout-wrapper']/descendant::p[contains(.,'Jaipur Pink Panthers')]/ancestor::div[@class="table-data team"]/following-sibling::div

