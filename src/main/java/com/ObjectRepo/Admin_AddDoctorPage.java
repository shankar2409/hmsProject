package com.ObjectRepo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hms.genericUtils.WebDriverUtils;

public class Admin_AddDoctorPage  extends WebDriverUtils{
	WebDriver driver;
	public Admin_AddDoctorPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	@FindBy(name = "Doctorspecialization")
	private WebElement doctorDropDown;
	@FindBy(name = "docname")
	private WebElement docName;
	@FindBy(name = "clinicaddress")
	private WebElement docAddress;
	@FindBy(name="docfees")
	private WebElement docFees;
	@FindBy(name="doccontact")
	private WebElement docContactNo;
	@FindBy(name="docemail")
	private WebElement docEmail;
	@FindBy(name="npass")
	private WebElement docPwd;
	@FindBy(name="cfpass")
	private WebElement confirmPwd;
	@FindBy(name="submit")
	private WebElement submitBtn;
	public WebElement getDoctorDropDown() {
		return  doctorDropDown;
	}
	public WebElement getDocName() {
		return docName;
	}
	public WebElement getDocAddress() {
		return docAddress;
	}
	public WebElement getDocFees() {
		return docFees;
	}
	public WebElement getDocContactNo() {
		return docContactNo;
	}
	public WebElement getDocEmail() {
		return docEmail;
	}
	public WebElement getDocPwd() {
		return docPwd;
	}
	public WebElement getConfirmPwd() {
		return confirmPwd;
	}
	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	public void doctorRegis(String docSpec,String docName,String clicnicAddress,String fees,String contactNo,String email,String pwd,String conPwd) {
		select(getDoctorDropDown(), docSpec);
		getDocName().sendKeys(docName);
		getDocAddress().sendKeys(clicnicAddress);
		getDocFees().sendKeys(fees);
		getDocContactNo().sendKeys(contactNo);
		getDocEmail().sendKeys(email);
		getDocPwd().sendKeys(pwd);
		getConfirmPwd().sendKeys(conPwd);
		getSubmitBtn().click();
		
		try {
			Alert alert = switchToAlert(driver);
			System.out.println(alert.getText());
			alert.accept();
			
		} catch (NoAlertPresentException e) {
			System.out.println(e.getMessage());
		}
	}
}
