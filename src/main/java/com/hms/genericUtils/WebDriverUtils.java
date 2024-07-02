
package com.hms.genericUtils;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class WebDriverUtils {

	public void WaitForPageLoad(WebDriver driver, int seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}

	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}

	public void minimizeWindow(WebDriver driver) {
		driver.manage().window().minimize();
	}

	public void fullScreenWindow(WebDriver driver) {
		driver.manage().window().fullscreen();
	}

	public void refreshPage(WebDriver driver) {
		driver.navigate().refresh();
	}

	public void backToPrevious(WebDriver driver) {
		driver.navigate().back();
	}

	public void nextWebPage(WebDriver driver) {
		driver.navigate().forward();
	}

	public WebDriverWait WebDriverWaitObj(WebDriver driver, int Seconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Seconds));
		return wait;
	}

	public void waitUntilElementToBeClickable(WebDriver driver, int seconds, WebElement element) {
		WebDriverWaitObj(driver, seconds).until(ExpectedConditions.elementToBeClickable(element));
	}

	public void waitUntilAlertIsPresent(WebDriver driver, int seconds) {
		WebDriverWaitObj(driver, seconds).until(ExpectedConditions.alertIsPresent());
	}

	public void waitUntilframeToBeVisible(WebDriver driver, int seconds, WebElement element) {
		WebDriverWaitObj(driver, seconds).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
	}

	public void waitUntilElementToBeVisible(WebDriver driver, int seconds, WebElement element) {
		WebDriverWaitObj(driver, seconds).until(ExpectedConditions.visibilityOf(element));
	}

	public void waitUntilframeToBeVisible(WebDriver driver, int seconds, String idOrName) {
		WebDriverWaitObj(driver, seconds).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(idOrName));
	}

	public Select selectObj(WebElement element) {
		Select se = new Select(element);
		return se;
	}

	public void select(WebElement element, int index) {
		selectObj(element).selectByIndex(index);
	}

	public void select(WebElement element, String visibletext) {
		selectObj(element).selectByVisibleText(visibletext);
	}

	public void select(String value, WebElement element) {
		selectObj(element).selectByValue(value);
	}

	public void deselect(WebElement element, int index) {
		selectObj(element).deselectByIndex(index);
	}

	public void deselect(WebElement element, String visibleText) {
		selectObj(element).deselectByVisibleText(visibleText);
	}

	public void deselect(String value, WebElement element) {
		selectObj(element).deselectByValue(value);
	}

	public List<WebElement> getAllOptions(WebElement element) {
		List<WebElement> options = selectObj(element).getOptions();
		return options;
	}

	public void deselectAllOptions(WebElement element) {
		selectObj(element).deselectAll();
	}

	public List<WebElement> getOnlySelectedOptions(WebElement element) {
		List<WebElement> options = selectObj(element).getAllSelectedOptions();
		return options;
	}

	public WebElement getFirstSelectedOptions(WebElement element) {
		return selectObj(element).getFirstSelectedOption();
	}

	public Actions actionObj(WebDriver driver) {
		Actions act = new Actions(driver);
		return act;
	}

	public void dragAndDrop(WebDriver driver, WebElement source, WebElement target) {
		actionObj(driver).dragAndDrop(source, target).perform();
	}

	public void moveToElement(WebDriver driver, WebElement element) {
		actionObj(driver).moveToElement(element).perform();
	}
	
	public void moveToElementAndPauseData(WebDriver driver, WebElement element,String value) {
		actionObj(driver).moveToElement(element).sendKeys(value).perform();
	}

	public void moveToElement(WebElement element, WebDriver driver) {
		actionObj(driver).moveToElement(element).click().perform();
	}

	public void clickAndHold(WebDriver driver) {
		actionObj(driver).clickAndHold().perform();
	}

	public void clickAndHold(WebDriver driver, WebElement element) {
		actionObj(driver).clickAndHold(element).perform();
	}

	public void doubleClick(WebDriver driver) {
		actionObj(driver).doubleClick().perform();
	}

	public void doubleClick(WebDriver driver, WebElement element) {
		actionObj(driver).doubleClick(element).perform();
	}

	public void rightClick(WebDriver driver) {
		actionObj(driver).contextClick().perform();
	}

	public void rightClick(WebDriver driver, WebElement targetelement) {
		actionObj(driver).contextClick(targetelement).perform();
	}

	public void click(WebDriver driver, WebElement element) {
		actionObj(driver).click(element).perform();
	}

	public void click(WebDriver driver) {
		actionObj(driver).click().perform();
	}

	public void scroll(WebDriver driver, WebElement targetElement) {
		actionObj(driver).scrollToElement(targetElement).perform();
	}

	public void scroll(WebDriver driver, int X, int Y) {
		actionObj(driver).scrollByAmount(X, Y).perform();
	}

	public void sendValues(WebDriver driver, WebElement target, String value) {
		actionObj(driver).sendKeys(target, value);
	}

	public void enterKeyPress(WebDriver driver) {
		actionObj(driver).sendKeys(Keys.ENTER).perform();
	}

	public Robot robotObj() throws Exception {
		Robot r = new Robot();
		return r;
	}

	public void enterKey() throws Exception {
		robotObj().keyPress(KeyEvent.VK_ENTER);
		enterRelease();
	}

	private void enterRelease() throws Exception {
		robotObj().keyRelease(KeyEvent.VK_ENTER);
	}

	public void switchToWindow(WebDriver driver, String expectedTitle) {
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		while (it.hasNext()) {
			String winID = it.next();
			String currentWindowTitle = driver.switchTo().window(winID).getTitle();
			if (currentWindowTitle.contains(expectedTitle)) {
				break;
			}

		}
	}

	public Alert switchToAlert(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		return alert;
	}

	public void switchToFrame(WebDriver driver, String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}

	public void switchToFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}

	public void switchToFrame(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}

	public void switchToParentFrame(WebDriver driver) {
		driver.switchTo().parentFrame();
	}

	public void switchTodefaultWebPage(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	
	
	public  static String takeScreenShotForWebPage(WebDriver driver,String screenShotpath) throws Exception {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		JavaUtils jLib=new JavaUtils();
		String fileName = IpathConstants.screenshotPath+screenShotpath+jLib.getSystemDateInFormat()+".png";
	
		File destination = new File(fileName);
		String scrPath = destination.getAbsolutePath();
		FileHandler.copy(source, destination);
		return scrPath;
	}
	public void executeJavaScript(WebDriver driver,String javaScript) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript(javaScript);
				
	}
	public void takeScreenShotForWebElement(WebElement element,FileUtils fLib,JavaUtils jLib) throws Exception {
		
		File source = element.getScreenshotAs(OutputType.FILE);
		String fileName = fLib.readDataFromPropertyFile("screenshotPath")+jLib.getSystemDateInFormat()+".png";
		File destination = new File(fileName);
		Files.copy(source, destination);
	}
	public void closeCurrentTab(WebDriver driver) {
		driver.close();
	}
	public void quitWindow(WebDriver driver) {
		driver.quit();
	}
}
 