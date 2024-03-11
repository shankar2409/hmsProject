package com.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hms.genericUtils.WebDriverUtils;

public class DoctorAddPatientPage  extends WebDriverUtils
{
	WebDriver driver;
	
	public DoctorAddPatientPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			this.driver = driver;
		}

	// initialization
	@FindBy (name = "patname") private WebElement patientNameEdt;
	
	@FindBy (name = "patcontact") private WebElement patientContactNoEdt;
	
	@FindBy (name = "patemail") private WebElement patientEmailEdt;
	
	@FindBy (xpath = "//label[contains(.,'Male')]") private WebElement maleRadioBtn;
	
	@FindBy (xpath = "//label[contains(.,'Female')]") private WebElement femaleRadioBtn;
	
	@FindBy (name = "pataddress") private WebElement patientAddressEdt;
	
	@FindBy (name = "patage") private WebElement patientAgeEdt;
	
	@FindBy (name = "medhis") private WebElement medicalHistoryEdt;
	
	@FindBy (name = "submit") private WebElement addBtn;
	@FindBy(id="user-availability-status1")
	private WebElement errorMsg;

	// initialization done in constructor on top
	
	public WebElement getErrorMsg() {
		return errorMsg;
	}

	// utilization
	public WebElement getPatientNameEdt() {
		return patientNameEdt;
	}

	public WebElement getPatientContactNoEdt() {
		return patientContactNoEdt;
	}

	public WebElement getPatientEmailEdt() {
		return patientEmailEdt;
	}

	public WebElement getMaleRadioBtn() {
		return maleRadioBtn;
	}

	public WebElement getFemaleRadioBtn() {
		return femaleRadioBtn;
	}

	public WebElement getPatientAddressEdt() {
		return patientAddressEdt;
	}

	public WebElement getPatientAgeEdt() {
		return patientAgeEdt;
	}

	public WebElement getMedicalHistoryEdt() {
		return medicalHistoryEdt;
	}

	public WebElement getAddBtn() {
		return addBtn;
	}
	
	public void addPatient(String name, String number, String email, String gender, String address, String age, String medHistory)
	{
		try {
			waitUntilElementToBeVisible(driver, 20, patientNameEdt);
		} catch (Exception e) {
		}
		patientNameEdt.sendKeys(name);
		patientContactNoEdt.sendKeys(number);
		patientEmailEdt.sendKeys(email);
		if(gender.toLowerCase().equalsIgnoreCase("male"))
		{
			maleRadioBtn.click();
		}
		else if(gender.toLowerCase().equalsIgnoreCase("female"))
		{
			femaleRadioBtn.click();
		}
		else System.out.println("invalid gender");
		
		patientAddressEdt.sendKeys(address);
		patientAgeEdt.sendKeys(age);
		medicalHistoryEdt.sendKeys(medHistory);
		addBtn.click();
		
	}
	
	

}
