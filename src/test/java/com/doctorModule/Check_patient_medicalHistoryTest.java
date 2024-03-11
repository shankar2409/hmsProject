package com.doctorModule;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ObjectRepo.AdminDashboardPage;
import com.ObjectRepo.Admin_AddDoctorPage;
import com.ObjectRepo.Admin_DoctorSearchPage;
import com.ObjectRepo.Admin_DoctorSpecializationPage;
import com.ObjectRepo.DoctorManagePatientsPage;
import com.ObjectRepo.Doctor_SearchPatient;
import com.ObjectRepo.Doctor_dashboardPage;
import com.ObjectRepo.HomePage;
import com.ObjectRepo.User_BookAppointmentPage;
import com.ObjectRepo.User_DashboardPage;
import com.ObjectRepo.User_EditProfilePage;
import com.ObjectRepo.loginPage;
import com.ObjectRepo.logoutPage;
import com.hms.genericUtils.BaseClass;
@Listeners(com.hms.genericUtils.ITestListenerImpClass.class)
public class Check_patient_medicalHistoryTest extends BaseClass {
	@SuppressWarnings("unused")
	@Test
	public void Check_patient_medicalHistory_Test() throws Exception {
		System.out.println("start..");

		HomePage hp = new HomePage(driver);
		hp.loginText("admin");
		loginPage lp = new loginPage(driver);
		String dn = fLib.readDataFromPropertyFile("a_un");
		String dpwd = fLib.readDataFromPropertyFile("a_pwd");
		lp.login(dn, dpwd);
		AdminDashboardPage adp = new AdminDashboardPage(driver);
		adp.doctorSpecialization();
		String DoctorSpec = "Dentist";
		Admin_DoctorSpecializationPage adsp = new Admin_DoctorSpecializationPage(driver);
		adsp.addDoctorSpecialization(DoctorSpec);
		System.out.println(adsp.getSuccessMsg().getText());

		String dName = eLib.readDataFromExcelFile("AddDoctor", 1, 0);
		String CliAddress = eLib.readDataFromExcelFile("AddDoctor", 1, 1);
		String fees = eLib.readDataFromExcelFile("AddDoctor", 1, 2);
		String contactNo = eLib.readDataFromExcelFile("AddDoctor", 1, 3);
//		String email = eLib.readDataFromExcelFile("AddDoctor", 1, 4);
		String password = eLib.readDataFromExcelFile("AddDoctor", 1, 5);
		String confirmPass = eLib.readDataFromExcelFile("AddDoctor", 1, 6);
		String gender = eLib.readDataFromExcelFile("AddDoctor", 1, 7);
		adp.AddDoctor();
		int rnum = jLib.randomNo(500);
		dName += rnum;
		String email = "shankar" + rnum + "@gmail.com";
		
		Admin_AddDoctorPage aad = new Admin_AddDoctorPage(driver);
		aad.doctorRegis(DoctorSpec, dName, CliAddress, fees, contactNo, email, password, confirmPass);
		logoutPage lo = new logoutPage(driver);
		lo.logoutApp();
		hp.loginText("doctor");
//		String name = fLib.readDataFromPropertyFile("d_un");
//		String pss = fLib.readDataFromPropertyFile("d_pwd");
		lp.login(email,confirmPass);
		Doctor_dashboardPage ddp = new Doctor_dashboardPage(driver);
		ddp.getSearchLink().click();
		Doctor_SearchPatient dsp = new Doctor_SearchPatient(driver);
		dsp.SearchPatient("shankar");
		driver.findElement(By.xpath(
				"//table[@class='table table-hover']/tbody/tr/td[contains(text(),'shankar')]/../td[7]//i[@class='fa fa-eye']"))
				.click();
		driver.findElement(By.cssSelector("[class*='btn btn-primary wav']")).click();

		List<WebElement> ele = driver.findElements(
				By.xpath("//table[@class='table table-bordered table-hover data-tables']/tbody/tr[*]/td"));

		String bp = eLib.readDataFromExcelFile("Medical Prescription", 1, 0);
		String bs = eLib.readDataFromExcelFile("Medical Prescription", 1, 1);
		String weigh = eLib.readDataFromExcelFile("Medical Prescription", 1, 2);
		String temp = eLib.readDataFromExcelFile("Medical Prescription", 1, 3);
		String pres = eLib.readDataFromExcelFile("Medical Prescription", 1, 4);

		DoctorManagePatientsPage dmp = new DoctorManagePatientsPage(driver);
		dmp.addPrescription(bp, bs, weigh, temp, pres);

		lo.logoutApp();

		hp.loginText("patient");
		String username = fLib.readDataFromPropertyFile("p_un");
		String pwd = fLib.readDataFromPropertyFile("P_pwd");
		lp.login(username, pwd);

		// book Appointment
		User_EditProfilePage uep = new User_EditProfilePage(driver);

		User_DashboardPage udp = new User_DashboardPage(driver);
		udp.getUpdateProfile().click();

		uep.getCityEdt().sendKeys("tamilNadu");
		uep.getSubmitBtn().click();

		String confirmMsg = uep.getConfirmMsg().getText();
		System.out.println(confirmMsg);
		udp.getBookApmt().click();

		User_BookAppointmentPage uba = new User_BookAppointmentPage(driver);
		uba.bookAppointment("Dentist", "shankar", "27-02-2024", "02.00 pm");
		WebElement doct = driver.findElement(By.name("doctor"));
		wLib.select(doct, 3);

		lo.logoutApp();
		System.out.println("done..");
	}

	@Test
	public void Book_Appointments_Test() throws Exception {
		System.out.println("start...");

		String un = fLib.readDataFromPropertyFile("a_un");
		String pwd = fLib.readDataFromPropertyFile("a_pwd");
		HomePage hp = new HomePage(driver);
		hp.loginText("admin");
		loginPage lp = new loginPage(driver);
		lp.login(un, pwd);

		AdminDashboardPage adp = new AdminDashboardPage(driver);
		adp.doctorSpecialization();
		Admin_DoctorSpecializationPage adsp = new Admin_DoctorSpecializationPage(driver);

		Thread.sleep(3000);
		String DoctorSpec = "Dentist";
		adsp.addDoctorSpecialization(DoctorSpec);

		String Msg = adsp.getSuccessMsg().getText();
		System.out.println(Msg);

		adp.AddDoctor();
		Admin_AddDoctorPage aadp = new Admin_AddDoctorPage(driver);

		String dName = eLib.readDataFromExcelFile("AddDoctor", 1, 0);
		String CliAddress = eLib.readDataFromExcelFile("AddDoctor", 1, 1);
		String docFess = eLib.readDataFromExcelFile("AddDoctor", 1, 2);
		String contactNo = eLib.readDataFromExcelFile("AddDoctor", 1, 3);
		String email = eLib.readDataFromExcelFile("AddDoctor", 1, 4);
		String password = eLib.readDataFromExcelFile("AddDoctor", 1, 5);
		String confirmPass = eLib.readDataFromExcelFile("AddDoctor", 1, 6);
		System.out.println(password);
		System.out.println(confirmPass);
		int rnum = jLib.randomNo(500);
		email = "shankar" + rnum + "@gmail.com";
		aadp.doctorRegis(DoctorSpec, dName, CliAddress, docFess, contactNo, email, password, confirmPass);


		logoutPage lo = new logoutPage(driver);
		lo.logoutApp();
//		String dun = fLib.readDataFromPropertyFile("d_un");

//		String dpwd = fLib.readDataFromPropertyFile("d_pwd");
		hp.loginText("doctor");

		lp.login(email, password);

		Doctor_dashboardPage ddp = new Doctor_dashboardPage(driver);
		ddp.getSearchLink().click();
		Admin_DoctorSearchPage ads = new Admin_DoctorSearchPage(driver);
		String patientName = "shankar";
		ads.searchPatient("shankar");

		driver.findElement(By.xpath("//table[@class='table table-hover']/tbody/tr/td[contains(text(),'" + patientName
				+ "')]/../td[7]//i[@class='fa fa-eye']")).click();

		String bp = eLib.readDataFromExcelFile("Medical Prescription", 1, 0);
		String bs = eLib.readDataFromExcelFile("Medical Prescription", 1, 1);
		String weigh = eLib.readDataFromExcelFile("Medical Prescription", 1, 2);
		String temp = eLib.readDataFromExcelFile("Medical Prescription", 1, 3);
		String pres = eLib.readDataFromExcelFile("Medical Prescription", 1, 4);

		DoctorManagePatientsPage dmp = new DoctorManagePatientsPage(driver);
		try {
			dmp.addPrescription(bp, bs, weigh, temp, pres);
		} catch (Exception e) {
			try {
				dmp.addPrescription(bp, bs, weigh, temp, pres);
			} catch (Exception e2) {
				dmp.getCloseBtn().click();
			}
		}

		lo.logoutApp();
		System.out.println("done..");
	}
}
