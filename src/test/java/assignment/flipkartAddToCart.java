package assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class flipkartAddToCart {
	@Test
	public void addToCartProduct() throws EncryptedDocumentException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.cssSelector("[class='Pke_EE\']")).sendKeys("redmi 12");
		driver.findElement(By.cssSelector("[class='_2iLD__']")).click();
		driver.findElement(By.cssSelector("[class='_4rR01T']")).click();
		Set<String> allId = driver.getWindowHandles();
		System.out.println(driver.getTitle());
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.createSheet("addTocart");
		
		
		allId.remove(driver.getWindowHandle());
		for (String str : allId) {
			driver.switchTo().window(str);
			break;
		}
		System.out.println(driver.getTitle());
		WebElement add = driver.findElement(By.xpath("//div[@class='_1AtVbE col-12-12']//button[@class=\"_2KpZ6l _2U9uOA _3v1-ww\"]"));
		new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(add));
		add.click();
		String pName = driver.findElement(By.cssSelector("[class='_2Kn22P gBNbID']")).getText();
		String pprice = driver.findElement(By.xpath("//div[@class='_3LxTgx']/descendant::span")).getText();
		Row row = sh.createRow(0);
		row.createCell(0).setCellValue(pName);
		row.createCell(1).setCellValue(pprice);
		System.out.println(pName + " " + pprice);
	}
}
