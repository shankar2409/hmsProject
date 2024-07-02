package assignment;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.qameta.allure.Epic;
import io.qameta.allure.Story;

public class AllureReportTest {
	@Epic("epic")
	@Story("story")
	@Test
	public void demo1() {
		ChromeDriver driver = new ChromeDriver();
		System.out.println("chrome launched");
	}
	@Epic("epic1")
	@Story("story1")
	@Test
	public void demo2() {
		ChromeDriver driver = new ChromeDriver();
		System.out.println("chrome launched");
	}
}
