package com.ObjectRepo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hms.genericUtils.WebDriverUtils;

public class patient_changePasswordPage  extends WebDriverUtils{
	WebDriver driver;
	public patient_changePasswordPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	@FindBy(name = "cpass")
	private WebElement currentpwd;
	@FindBy(name = "npass")
	private WebElement newPwd;
	@FindBy(name = "cfpass")
	private WebElement confirmpwd;
	@FindBy(name = "submit")
	private WebElement submitBtn;

	public WebElement getCurrentpwd() {
		return currentpwd;
	}

	public WebElement getNewPwd() {
		return newPwd;
	}

	public WebElement getConfirmpwd() {
		return confirmpwd;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public void changePwd(String currentpassword, String newPassword, String Confirmpassword) {
		currentpwd.sendKeys(currentpassword);
		newPwd.sendKeys(newPassword);
		confirmpwd.sendKeys(Confirmpassword);
		submitBtn.click();
		try {
			 Alert alert = switchToAlert(driver);
			 String text = alert.getText();
			 System.out.println(text);
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}

	}

}
