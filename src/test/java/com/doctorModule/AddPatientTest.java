package com.doctorModule;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ObjectRepo.DoctorAddPatientPage;
import com.ObjectRepo.DoctorManagePatientsPage;
import com.ObjectRepo.Doctor_dashboardPage;
import com.ObjectRepo.HomePage;
import com.ObjectRepo.loginPage;
import com.ObjectRepo.logoutPage;
import com.hms.genericUtils.BaseClass;
@Listeners(com.hms.genericUtils.ITestListenerImpClass.class)
public class AddPatientTest extends BaseClass {
	@Test(retryAnalyzer = com.hms.genericUtils.RetryImpClass.class)
	public void AddPatient_Test() throws Throwable {
		System.out.println("start");
		

		String username = fLib.readDataFromPropertyFile("d_un");
		String password = fLib.readDataFromPropertyFile("d_pwd");
		
		//initailization
		HomePage hp=new HomePage(driver);
		loginPage lp=new loginPage(driver);
		
		String exptitle="http://rmgtestingserver/domain/Hospital_Management_System/";
		hp.loginText("doctor");
		String actualtitle=driver.getTitle();
		SoftAssert sa=new SoftAssert();
		Assert.assertNotEquals(actualtitle, exptitle,"titlecomparision");
		lp.login(username, password);

		String patiName = eLib.readDataFromExcelFile("AddPatientSheet", 1, 0);
		String contact = eLib.readDataFromExcelFile("AddPatientSheet", 1, 1);
		String email = eLib.readDataFromExcelFile("AddPatientSheet", 1, 2);
		String gender = eLib.readDataFromExcelFile("AddPatientSheet", 1, 3);
		String address = eLib.readDataFromExcelFile("AddPatientSheet", 1, 4);
		String age = eLib.readDataFromExcelFile("AddPatientSheet", 1, 5);
		String medHis = eLib.readDataFromExcelFile("AddPatientSheet", 1, 6);
		Doctor_dashboardPage dd=new Doctor_dashboardPage(driver);
		email=email+jLib.randomNo(500)+"@gmail.com";
		FluentWait wait = new FluentWait(driver);
		wait.until(ExpectedConditions.alertIsPresent());
		wait.pollingEvery(Duration.ofSeconds(10));
		wait.withTimeout(Duration.ofSeconds(50));
		wait.ignoring(NoAlertPresentException.class);
		dd.AddPatientLink();
		DoctorAddPatientPage dap=new DoctorAddPatientPage(driver);
			dap.addPatient(patiName, contact, email, gender, address, age, medHis);
			try {
				String err = dap.getErrorMsg().getText();
				System.out.println(err);
			} catch (Exception e) {
				throw new Exception("no error msg");
		}
	
		dd.ManagePatient();
		
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
			driver.findElement(By.xpath("//td[.='mavarick']/..//td[last()]//i[contains(@class,'eye')]")).click();
			String result = driver.findElement(By.cssSelector("[class='table table-bordered']")).getText();
			System.out.println(result);
		} else {
			System.out.println("data not Added");
		}
		
		DoctorManagePatientsPage dmp=new DoctorManagePatientsPage(driver);
		Thread.sleep(4000);
		dmp.addPrescription("120/80", "400", "200","30", "eat healthy foods");
		
		
		logoutPage lo=new logoutPage(driver);
		lo.logoutApp();
		hp.loginText("admin");
		username=fLib.readDataFromPropertyFile("a_un");
		password=fLib.readDataFromPropertyFile("a_pwd");
//		String eexptitle="dashboard.php";
		lp.login(username, password);
//		String actual=driver.getTitle();
//		assertEquals(actual, eexptitle, "Msg");
		System.out.println("done..");
		sa.assertAll();
	}
	

}
