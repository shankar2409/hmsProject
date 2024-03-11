package com.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_DoctorEdiProfilePage {
	
	public Admin_DoctorEdiProfilePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name = "Doctorspecialization")
	private WebElement docSpecDD;
	@FindBy(name = "docname")
	private WebElement docNameEdt;
	@FindBy(name = "clinicaddress")
	private WebElement clinicAddressEdt;
	@FindBy(name = "docfees")
	private WebElement docFeesEdt;
	@FindBy(name = "doccontact")
	private WebElement docContactNoEdt;
	@FindBy(name = "docemail")
	private WebElement emailEdt;
	@FindBy(name = "submit")
	private WebElement submitBtn;
	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	public WebElement getDocSpecDD() {
		return docSpecDD;
	}
	public WebElement getDocNameEdt() {
		return docNameEdt;
	}
	public WebElement getClinicAddressEdt() {
		return clinicAddressEdt;
	}
	public WebElement getDocFeesEdt() {
		return docFeesEdt;
	}
	public WebElement getDocContactNoEdt() {
		return docContactNoEdt;
	}
	public WebElement getEmailEdt() {
		return emailEdt;
	}
}



