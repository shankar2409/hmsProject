package assignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class storepriceinExcel {

	

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
//		driver.findElement(By.cssSelector("[class='Pke_EE']")).sendKeys("iphone");
//		driver.findElement(By.xpath("//button[contains(@class,'2iLD')]")).click();
		driver.findElement(By.cssSelector("[class=\"Pke_EE\"]")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[contains(@class,'2iLD')]")).click();

		List<WebElement> phName = driver.findElements(By.cssSelector("[class='_4rR01T']"));
		List<WebElement> price = driver.findElements(By.cssSelector("[class='_30jeq3 _1_WHN1']"));

		FileInputStream fos = new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fos);
		Sheet sh = wb.createSheet("flipkart21");

		for (int i = 0; i < phName.size(); i++) {
			Row row = sh.createRow(i);

			for (int j = 0; j < 1; j++) {
				row.createCell(j).setCellValue(phName.get(i).getText());
				row.createCell(j + 1).setCellValue(price.get(i).getText());
			}
			System.out.println("done.." + i);
		}

		System.out.println("done......");
		FileOutputStream ros = new FileOutputStream(".\\src\\test\\resources\\TestData.xlsx");
		wb.write(ros);
		wb.close();
		System.out.println("....");

	}
}
