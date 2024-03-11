package com.hms.genericUtils;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterSuite;

public class BaseClass {
	public WebDriverUtils wLib = new WebDriverUtils();
	public JavaUtils jLib=new JavaUtils();
	public ExcelUtils eLib = new ExcelUtils();
	public FileUtils fLib = new FileUtils();
	public DataBaseUtils dLib = new DataBaseUtils();
	public static WebDriver driver;
	public static String browserName;
	public static String browserVersion;

	@BeforeMethod(alwaysRun = true)
	public void loginToApp() throws Exception {
		Reporter.log("--login--", true);
	}

	@AfterMethod(alwaysRun = true)
	public void afterMethod() {
		Reporter.log("--logout--", true);
	}
	
	
	@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void launchBrowser(@Optional("chrome")String  browser ) throws Exception {
		String url = fLib.readDataFromPropertyFile("url");
//		 String browser = fLib.readDataFromPropertyFile("browser").toLowerCase();
		if (browser.contains("chrome"))
			driver = new ChromeDriver();
		else if (browser.contains("firefox"))
			driver = new FirefoxDriver();
		else if (browser.contains("edge"))
			driver = new EdgeDriver();
		else
			throw new Exception("--invalid browser name--");
		
		
		  Capabilities browserCap = ((RemoteWebDriver)driver).getCapabilities();
//		Capabilities browserCap = ((RemoteWebDriver) BaseClass.driver).getCapabilities();
		 browserName = browserCap.getBrowserName();
		browserVersion = browserCap.getBrowserVersion();
		wLib.maximizeWindow(driver);
		wLib.WaitForPageLoad(driver, 10);
		driver.get(url);
		Reporter.log("--browser launched--", true);
	}

	@AfterClass(alwaysRun = true)
	public void closeBrowser() {
		wLib.quitWindow(driver);
		Reporter.log("--browser closed--", true);
	}

	@BeforeSuite(alwaysRun = true)
	public void connectToDB() throws Exception {
		dLib.connectToDB();
		Reporter.log("--connected to DB--", true);
	}

	@AfterSuite(alwaysRun = true)
	public void disconnectDB() throws Exception {
		dLib.disconnectDB();
		Reporter.log("--diconnected from DB--", true);
	}

}
