package javaPractice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class prac {
	@Test
	public void main() throws Exception {
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// to acces the application
		js.executeScript("window.location=arguments[0]", "https://www.amazon.in");

		// to downscroll the window with some value x-indicates horizontal scroll
		// y-indicates vertical scoll
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(4000);
		// to upscroll
		js.executeScript("window.scrollBy(0,-500)");
		// to locate the element
		js.executeScript("document.getElementById('twotabsearchtextbox').value='iphone 15';");
		js.executeScript("document.getElementById('nav-search-submit-button').click();");
//		js.executeScript("document.querySeletor('[class='puisg-row'] button').click();");
		Thread.sleep(3000);
		js.executeScript("window.location=arguments[0]","https://www.flipkart.com/");
		js.executeScript("history.go();");
		js.executeScript("history.back();");
		js.executeScript("history.forward();");
//		js.executeScript("document.querySelector('[class='Pke_EE']').value='iphone 15';");
	}
	
}
