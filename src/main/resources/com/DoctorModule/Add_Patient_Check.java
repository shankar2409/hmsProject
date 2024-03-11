package com.DoctorModule;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.hms.genericUtils.ExcelUtils;
import com.hms.genericUtils.FileUtils;
import com.hms.genericUtils.IpathConstants;
import com.hms.genericUtils.JavaUtils;
import com.hms.genericUtils.WebDriverUtils;

public class Add_Patient_Check {

	ExcelUtils eLib;
	FileUtils fLib;
	JavaUtils jLib;
	WebDriverUtils wLib;
/*
	public void main(String[] args) throws Exception {
		Ba = new Add_Patient_Check();
		Ba.accessApplication();
		Ba.homeTologin("Doctors Login");
		Ba.login("d_un", "d_pwd");

		String patiName = eLib.readDataFromExcelFile("AddPatientSheet", 1, 0);
		String contact = eLib.readDataFromExcelFile("AddPatientSheet", 1, 1);
		String email = eLib.readDataFromExcelFile("AddPatientSheet", 1, 2);
		String gender = eLib.readDataFromExcelFile("AddPatientSheet", 1, 3);
		String address = eLib.readDataFromExcelFile("AddPatientSheet", 1, 4);
		String age = eLib.readDataFromExcelFile("AddPatientSheet", 1, 5);
		String medHis = eLib.readDataFromExcelFile("AddPatientSheet", 1, 6);

		driver.findElement(By.xpath("//span[.=' Patients ']/following-sibling::i")).click();
		driver.findElement(By.xpath("//span[.=' Add Patient']")).click();
		driver.findElement(By.name("patname")).sendKeys(patiName);
		driver.findElement(By.name("patcontact")).sendKeys(contact);
		driver.findElement(By.id("patemail")).sendKeys(email);
		if (gender.equalsIgnoreCase("male")) {
			driver.findElement(By.xpath("//input[@id='rg-female']/following-sibling::label[@for='rg-female']")).click();
		} else {
			driver.findElement(By.xpath("//input[@id='rg-male']/following-sibling::label[@for='rg-male']")).click();
		}
		driver.findElement(By.name("pataddress")).sendKeys(address);
		driver.findElement(By.name("patage")).sendKeys(age);
		driver.findElement(By.name("medhis")).sendKeys(medHis);
		driver.findElement(By.id("submit")).click();

		driver.findElement(By.xpath("//span[.=' Patients ']/following-sibling::i")).click();
		driver.findElement(By.xpath("//span[.=' Manage Patient ']")).click();
		List<WebElement> ele = driver.findElements(By.xpath("//table[@id='sample-table-1']/tbody/tr/td[2]"));
		boolean flag = false;
		for (WebElement we : ele) {
			if (we.getText().contains(patiName)) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("data is present");
			driver.findElement(By.xpath("//td[.='" + patiName + "']/..//td[last()]//i")).click();
			String result = driver.findElement(By.cssSelector("[class='table table-bordered']")).getText();
			System.out.println(result);
		} else {
			System.out.println("data not Added");
		}
		logout();
		homeTologin("Admin Login");
		login("a_un", "a_pwd");

	}

	*/
	
	
	
	
	
	

	
	public WebDriver accessApplication(WebDriver driver) throws Exception {

		eLib = new ExcelUtils();
		 fLib = new FileUtils();
		 jLib = new JavaUtils();
	wLib = new WebDriverUtils();
		// open browser
		String browser = fLib.readDataFromPropertyFile("browser_name");

		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			throw new Exception("invalid Browser");
		}
		// maximize window by using javaUtils
		wLib.maximizeWindow(driver);
		wLib.WaitForPageLoad(driver, 20);
		// access application
		String url = fLib.readDataFromPropertyFile("url");
		driver.get(url);
		return driver;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	public void homeTologin(WebDriver driver,String ele) {
		driver.findElement(By.xpath("//div[@class='listview_1_of_3 images_1_of_3' and contains(.,'" + ele
				+ "')]/descendant::a[.='Click Here']")).click();
	}

	public void login(WebDriver driver,String username, String password) throws Exception {
		eLib = new ExcelUtils();
		 fLib = new FileUtils();
		 jLib = new JavaUtils();
	wLib = new WebDriverUtils();

		driver.findElement(By.name("username")).sendKeys(fLib.readDataFromPropertyFile(""+username+""));
		driver.findElement(By.name("password")).sendKeys(fLib.readDataFromPropertyFile("" + password + ""));
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
	}

	public String[][] readDataFromExcel(String sheetName) throws EncryptedDocumentException, IOException {
		eLib = new ExcelUtils();
		 fLib = new FileUtils();
		 jLib = new JavaUtils();
	wLib = new WebDriverUtils();
		FileInputStream fis = new FileInputStream(IpathConstants.ExcelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);

		int row = sheet.getPhysicalNumberOfRows();
		int cell = sheet.getRow(0).getPhysicalNumberOfCells();
		String[][] data = new String[row][cell];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cell; j++) {

				try {
					data[i][j] = sheet.getRow(i).getCell(j).toString();
				} catch (Exception e) {
					break;
				}
			}
		}
		return data;
	}

	public void getDataFromArray(WebDriver driver) throws EncryptedDocumentException, IOException, InterruptedException {
		eLib = new ExcelUtils();
		 fLib = new FileUtils();
		 jLib = new JavaUtils();
	wLib = new WebDriverUtils();
		String[][] data = readDataFromExcel("AddPatientSheet");
		for (int i = 1; i <= 1; i++) {
			for (int j = 0; j < data[i].length; j++) {
				driver.findElement(By.xpath("//span[.=' Patients ']/following-sibling::i")).click();
				driver.findElement(By.xpath("//span[.=' Add Patient']")).click();
				System.out.print(data[i][j] + "  ");
				 String patiName = data[i][j++];
				driver.findElement(By.name("patname")).sendKeys(patiName);
				driver.findElement(By.name("patcontact")).sendKeys(data[i][j++]);
				driver.findElement(By.id("patemail")).sendKeys(data[i][j++]);
				if (data[i][j++].equalsIgnoreCase("male")) {
					driver.findElement(By.xpath("//input[@id='rg-female']/following-sibling::label[@for='rg-female']"))
							.click();
				} else {
					driver.findElement(By.xpath("//input[@id='rg-male']/following-sibling::label[@for='rg-male']"))
							.click();
				}
				driver.findElement(By.name("pataddress")).sendKeys(data[i][j++]);
				driver.findElement(By.name("patage")).sendKeys(data[i][j++]);
				driver.findElement(By.name("medhis")).sendKeys(data[i][j]);
				driver.findElement(By.id("submit")).click();
			}
			Thread.sleep(2000);
			System.out.println();
		}
	}

	public void logout(WebDriver driver) {
		driver.findElement(By.cssSelector("[class='dropdown-toggle']")).click();
		driver.findElement(By.xpath("//a[normalize-space(text())='Log Out']")).click();
	}
}
