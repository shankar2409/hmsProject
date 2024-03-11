package com.PatientModule;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

import com.ObjectRepo.HomePage;
import com.ObjectRepo.PatientRegistrationPage;
import com.ObjectRepo.User_DashboardPage;
import com.ObjectRepo.loginPage;
import com.ObjectRepo.patient_changePasswordPage;
import com.hms.genericUtils.BaseClass;

public class PatientRegistrationAndLoginTest extends BaseClass {


	@Test
	public void PatientRegistrationLoginTest() throws Exception {
		HomePage hp = new HomePage(driver);
		hp.loginText("patient");
		loginPage lp = new loginPage(driver);
		lp.getCreateNewAcc();
		PatientRegistrationPage prp = new PatientRegistrationPage(driver);

		String fullname = eLib.readDataFromExcelFile("PatientRegistration", 1, 0);
		String address = eLib.readDataFromExcelFile("PatientRegistration", 1, 1);
		String city = eLib.readDataFromExcelFile("PatientRegistration", 1, 2);
		String gender = eLib.readDataFromExcelFile("PatientRegistration", 1, 3);
		String email = eLib.readDataFromExcelFile("PatientRegistration", 1, 4);
		String password = eLib.readDataFromExcelFile("PatientRegistration", 1, 5);
		String confirmPassword = eLib.readDataFromExcelFile("PatientRegistration", 1, 6);
		email += jLib.randomNo(500) + "@gmail.com";
		prp.registerApp(fullname, address, city, gender, email, password, confirmPassword);
		try {
			Alert alert = wLib.switchToAlert(driver);		
			System.out.println(alert.getText());
			alert.accept();

		} catch (Exception e2) {
			System.out.println(driver.findElement(By.id("user-availability-status1")).getText());
		}
		prp.getLoginBtn().click();
		Thread.sleep(3000);
		lp.login(email, password);

	}

	@Test(invocationCount = 0)
	public void loginWithUpdatedemailAndPwd() throws Exception {
		HomePage hp = new HomePage(driver);
		hp.loginText("patient");
		loginPage lp = new loginPage(driver);
		String username = fLib.readDataFromPropertyFile("p_un");
		String password = fLib.readDataFromPropertyFile("p_pwd");
		lp.login(username, password);
		User_DashboardPage udp=new User_DashboardPage(driver);
		udp.getChangePwd();
		patient_changePasswordPage pcp=new patient_changePasswordPage(driver);
		int ranNo = jLib.randomNo(5000);
		String newpassword="Test"+ranNo;
		String confirmpwd="Test"+ranNo;
		pcp.changePwd(password, newpassword, confirmpwd);
		String actualtitle=driver.getTitle();
		
		lp.login(username, newpassword);
		
		String expectedtitle=driver.getTitle();
		
		assertEquals(expectedtitle, actualtitle, "validation for whether patient is created or not");
//		if(actualtitle.equals(expectedtitle)) 
//			Reporter.log("password wrong");
//		else 
//			Reporter.log("password is correct--logged in successfully");

	}
}
