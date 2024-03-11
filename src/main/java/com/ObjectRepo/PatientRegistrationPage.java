package com.ObjectRepo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.hms.genericUtils.WebDriverUtils;

public class PatientRegistrationPage  extends WebDriverUtils{
	WebDriver driver;

	public PatientRegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	// initialization
	@FindBy(name = "full_name")
	private WebElement fullnameEdt;

	@FindBy(name = "address")
	private WebElement addressEdt;

	@FindBy(name = "city")
	private WebElement cityEdt;

	@FindBy(xpath = "//label[contains(.,'Male')]")
	private WebElement maleRadioBtn;

	@FindBy(xpath = "//label[contains(.,'Female')]")
	private WebElement femaleRadioBtn;

	@FindBy(name = "email")
	private WebElement emailEdt;

	@FindBy(name = "password")
	private WebElement passwordEdt;

	@FindBy(name = "password_again")
	private WebElement password_againEdt;

	@FindBy(id = "agree")
	private WebElement agreeChkBox;

	@FindBy(partialLinkText = "Log-in")
	private WebElement loginBtn;

	@FindBy(name = "submit")
	private WebElement submitBtn;

	@FindBy(id = "user-availability-status1")
	private WebElement emailExistsMsg;
	// initialization done in constructor on top

	// utilization
	public WebElement getFullnameEdt() {
		return fullnameEdt;
	}

	public WebElement getAddressEdt() {
		return addressEdt;
	}

	public WebElement getCityEdt() {
		return cityEdt;
	}

	public WebElement getMaleRadioBtn() {
		return maleRadioBtn;
	}

	public WebElement getFemaleRadioBtn() {
		return femaleRadioBtn;
	}

	public WebElement getEmailEdt() {
		return emailEdt;
	}

	public WebElement getPasswordEdt() {
		return passwordEdt;
	}

	public WebElement getPassword_againEdt() {
		return password_againEdt;
	}

	public WebElement getAgreeChkBox() {
		return agreeChkBox;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	// Business Logic
	/**
	 * this method is to register a user to application for the first time
	 * 
	 * @author Dev
	 * @param fullname
	 * @param address
	 * @param city
	 * @param gender
	 * @param email
	 * @param password
	 * @param pwdAgain
	 */
	public void registerApp(String fullname, String address, String city, String gender, String email, String password,
			String pwdAgain) {
		fullnameEdt.sendKeys(fullname);
		addressEdt.sendKeys(address);
		cityEdt.sendKeys(city);
		if (gender.equalsIgnoreCase("male")) {
			maleRadioBtn.click();
		} else if (gender.equalsIgnoreCase("female")) {
			femaleRadioBtn.click();
		} else
			System.out.println("invalid gender");
		
		emailEdt.sendKeys(email);
		passwordEdt.sendKeys(password);
		password_againEdt.sendKeys(pwdAgain);
//		agreeChkBox.click();
		
		
		try {
			waitUntilElementToBeClickable(driver, 10, submitBtn);
			try {
				submitBtn.click();
			} catch (Exception e) {
				emailEdt.clear();
				emailEdt.sendKeys(email);
				submitBtn.click();
			}
			Alert alert = switchToAlert(driver);
			String msg = alert.getText();
			Assert.assertEquals(msg,"Successfully Registered. You can login now", "validating patientRegistration ");
			System.out.println(msg);
		} catch (Exception e) {
				System.out.println(emailExistsMsg.getText());
		}

	}

}
