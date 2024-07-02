package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.hms.genericUtils.BaseClass;

@Listeners(com.hms.genericUtils.ITestListenerImpClass.class)
public class getCentreDataInADynamicWebTable extends BaseClass{
	@Test
	public  void man() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cosmocode.io/automation-practice-webtable/ ");
		String text = driver.findElement(By.xpath("//table[@id=\"countries\"]/tbody/tr[position() <= last() div 2][last()]/td[position()<=last() div 2+1][last()]")).getText();
		System.out.println(text);
	}
}
