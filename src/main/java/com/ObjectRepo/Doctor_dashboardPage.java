package com.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Doctor_dashboardPage {
	
	public Doctor_dashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[contains(.,'Dashboard') and @class='title']")
	private WebElement dashboardLink;
	@FindBy(xpath = "//span[contains(.,'Appointment History') and @class='title']")
	private WebElement appointmntHis;
	
	@FindBy(xpath = "//span[contains(.,'Patients') and @class='title']")
	private WebElement patients;
	@FindBy(xpath = "//span[contains(.,'Add Patient') and @class='title']")
	private WebElement addPatient;
	
	@FindBy(xpath = "//span[contains(.,'Manage Patient') and @class='title']")
	private WebElement managePatient;
	
	@FindBy(xpath = "//span[contains(.,'Search') and @class='title']")
	private WebElement searchLink;
	public WebElement getDashboardLink() {
		return dashboardLink;
	}
	public WebElement getAppointmntHis() {
		return appointmntHis;
	}
	public WebElement getPatients() {
		return patients;
	}
	public WebElement getAddPatient() {
		return addPatient;
	}
	public WebElement getManagePatient() {
		return managePatient;
	}
	public WebElement getSearchLink() {
		return searchLink;
	}
	
	//business Logic
	public void AddPatientLink()
	{
		patients.click();
		addPatient.click();
	}
	public void ManagePatient() {
		patients.click();
		managePatient.click();
	}
}
