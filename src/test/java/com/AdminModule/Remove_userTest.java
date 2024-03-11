package com.AdminModule;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.ObjectRepo.AdminDashboardPage;
import com.ObjectRepo.Admin_DoctorEdiProfilePage;
import com.ObjectRepo.Admin_DoctorSpecializationPage;
import com.ObjectRepo.HomePage;
import com.ObjectRepo.loginPage;
import com.ObjectRepo.logoutPage;
import com.hms.genericUtils.BaseClass;

public class Remove_userTest extends BaseClass {
	@Test(groups = "regression",enabled = false)
	public void Remove_user_Test() throws Exception {
		System.out.println("start..");

		AdminDashboardPage ad = new AdminDashboardPage(driver);
		Admin_DoctorEdiProfilePage ade = new Admin_DoctorEdiProfilePage(driver);
		loginPage loginPg = new loginPage(driver);
		HomePage hp = new HomePage(driver);

		// maximize window by using javaUtils
		wLib.maximizeWindow(driver);
		wLib.WaitForPageLoad(driver, 20);
		// access application
		String url = fLib.readDataFromPropertyFile("url");
		driver.get(url);
		hp.loginText("admin");
		String username = fLib.readDataFromPropertyFile("a_un");
		String password = fLib.readDataFromPropertyFile("a_pwd");
		loginPg.login(username, password);

		ad.manageUser();

		String name = "Avinash";
		driver.findElement(
				By.xpath("//table[@id='sample-table-1']/tbody//td[contains(text(),'" + name + "')]/../td[last()]"))
				.click();
		try {
			Alert alert = wLib.switchToAlert(driver);
			System.out.println(alert.getText());
			alert.accept();
		} catch (Exception e) {
			System.out.println("exception");
			e.printStackTrace();
		}

		ad.manageDoctor();
		driver.findElement(By.xpath(
				"//table[@id='sample-table-1']/tbody//td[contains(.,'Psychiatrists')]/following-sibling::td[text()='shankar']/following-sibling::td//i[contains(@class,'pencil')]"))
				.click();

		WebElement fees = ade.getDocFeesEdt();
		fees.clear();
		fees.sendKeys("3000");

		ade.getSubmitBtn().click();
		ad.getAppointmetnHstryLink().click();
		List<WebElement> patientsName = driver.findElements(By.xpath("//table/tbody/tr[*]/td[3]"));
		System.out.println("patients Names");
		for (WebElement we : patientsName) {

			System.out.println(we.getText());
		}
		logoutPage lo=new logoutPage(driver);
		lo.logoutApp();
//		ad.signOut();
		System.out.println("done..");
	}
	
	
	@Test
	public void verification() throws Exception {
		HomePage hp=new HomePage(driver);
		hp.loginText("admin");
		loginPage lp=new loginPage(driver);
		String un = fLib.readDataFromPropertyFile("a_un");
		String pwd = fLib.readDataFromPropertyFile("a_pwd");
		lp.login(un,pwd);
		AdminDashboardPage adp=new AdminDashboardPage(driver);
		adp.doctorSpecialization();
		Admin_DoctorSpecializationPage adsp=new Admin_DoctorSpecializationPage(driver);
		String DocSpec=fLib.readDataFromPropertyFile("DocSpec")+jLib.randomNo(100);
		adsp.addDoctorSpecialization(DocSpec);
		 String succesMsg = adsp.getSuccessMsg().getText();
		 System.out.println(succesMsg);
	}
}
