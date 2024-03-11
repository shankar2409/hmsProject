package com.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_DoctorSpecializationPage {

	public Admin_DoctorSpecializationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name = "doctorspecilization")
	private WebElement docsplzation;
	@FindBy(name = "submit")
	private WebElement submitBtn;
	
	
	@FindBy(xpath = "//div[@class='panel-body']/p")
	private WebElement successMsg;
	
	public WebElement getSuccessMsg() {
		return successMsg;
	}
	public WebElement getDocsplzation() {
		return docsplzation;
	}
	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	public void addDoctorSpecialization(String doctorDept) {
		docsplzation.sendKeys(doctorDept);
		submitBtn.click();
	}
	
	
}
