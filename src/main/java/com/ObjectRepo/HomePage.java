package com.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	@FindBy(xpath="//h3[.='Patients']/parent::div//a")
	private WebElement patientLoginLink;
	@FindBy(xpath="//h3[.='Doctors Login']/parent::div//a")
	private WebElement doctorLoginLink;
	@FindBy(xpath = "//h3[.='Admin Login']/parent::div//a")
	private WebElement adminLoginLink;
	
	@FindBy(linkText = "Home")
	private WebElement homepageLink;
	@FindBy(xpath = "//a[.='contact']")
	private WebElement contactLink;
	@FindBy (css="[class='logo']")
	private WebElement logoSymbol;


	public WebElement getPatientLoginLink() {
		return patientLoginLink;
	}
	public WebElement getDoctorLoginLink() {
		return doctorLoginLink;
	}
	public WebElement getAdminLoginLink() {
		return adminLoginLink;
	}
	public WebElement getHomepageLink() {
		return homepageLink;
	}
	public WebElement getContactLink() {
		return contactLink;
	}
	public WebElement getLogoSymbol() {
		return logoSymbol;
	}
	//business logic
	/**
	 * this method is used to land into the specific login page 
	 * by passing the loginText value 
	 * 			Ex:if you passing logintext it will match particular value 
	 * and it will navigate to particular login page
	 * @param loginText
	 */
	public void loginText(String loginText) {
		if((loginText.toLowerCase()).contains("patient")) 
			patientLoginLink.click();
		else if((loginText.toLowerCase()).contains("doctor"))
			doctorLoginLink.click();
		else if((loginText.toLowerCase()).contains("admin"))
			adminLoginLink.click();
	}
}
