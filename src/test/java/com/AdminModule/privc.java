package com.AdminModule;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.ObjectRepo.AdminDashboardPage;
import com.ObjectRepo.Admin_DoctorEdiProfilePage;
import com.ObjectRepo.HomePage;
import com.ObjectRepo.loginPage;
import com.hms.genericUtils.BaseClass;

public class privc extends BaseClass {
	@Test
	public void Remove_user_Test() throws Exception {
		System.out.println("start..");
		AdminDashboardPage ad = new AdminDashboardPage(driver);
		Admin_DoctorEdiProfilePage ade = new Admin_DoctorEdiProfilePage(driver);
		loginPage loginPg = new loginPage(driver);
		HomePage hp = new HomePage(driver);
		
//		hp.loginText("admin");
//		String username = fLib.readDataFromPropertyFile("a_un");
//		String password = fLib.readDataFromPropertyFile("a_pwd");
//		loginPg.login(username, password);

		ad.manageUser();

		String name = "Avinash";
		driver.findElement(
				By.xpath("//table[@id='sample-table-1']/tbody//td[contains(text(),'" + name + "')]/../td[last()]"))
				.click();
		try {
			Alert alert = wLib.switchToAlert(driver);
			System.out.println(alert.getText());
			alert.accept();
		} finally {
			System.out.println("exception");
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
//		List<WebElement> patientsName = driver.findElements(By.xpath("//table/tbody/tr[*]/td[3]"));
//		System.out.println("patients Names");
	
//		ad.signOut();
		System.out.println("done..");
	}
}

