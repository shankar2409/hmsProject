package com.PatientModule;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ObjectRepo.HomePage;
import com.ObjectRepo.PatientRegistrationPage;
import com.ObjectRepo.loginPage;
import com.hms.genericUtils.BaseClass;
import com.hms.genericUtils.ExcelUtils;

public class patientRegis extends BaseClass{
	@Test(dataProvider = "getData")
	public void regis(String patientName,String address,String city,String gender,String email,String password,String confirmPassword) throws Exception{
	
		HomePage hp=new HomePage(driver);
		try {
			hp.loginText("patient");
			loginPage lp=new loginPage(driver);
			lp.getCreateNewAcc();
		} catch (Exception e) {
			
		}
		PatientRegistrationPage prp=new PatientRegistrationPage(driver);
		email+=jLib.randomNo(500)+"@gmail.com";
		prp.registerApp(patientName, address, city, gender, email, password, confirmPassword);
		Thread.sleep(3000);
	}
	@DataProvider
	public Object[][] getData() throws EncryptedDocumentException, Exception{
		ExcelUtils e=new ExcelUtils();
		Object[][] obj = e.excelData("patientRegis");
		return obj;
		
	}
	
}
