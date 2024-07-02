package assignment;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.hms.genericUtils.BaseClass;

import io.qameta.allure.Epic;
import io.qameta.allure.Story;

public class AllureReportTest extends BaseClass {
	@Epic("epic")
	@Story("story")
	@Test
	public void demo1() {
		driver.get("https://allurereport.org/docs/integrations-jenkins/");
		Assert.fail();
		System.out.println("chrome launched");
	}
	@Epic("epic1")
	@Story("story1")
	@Test
	public void demo2() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://allurereport.org/docs/integrations-jenkins/");
		Assert.fail();
		System.out.println("chrome launched");
	}
}
