package com.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hms.genericUtils.FileUtils;

public class loginPage {
	FileUtils prop;

	public loginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		prop = new FileUtils();
	}
	@FindBy(xpath="//h2")
	private WebElement title;
	
	
	
	@FindBy(name = "username")
	private WebElement userNameEdt;
	@FindBy(name = "password")
	private WebElement passwordEdt;
	@FindBy(partialLinkText = "Forgot Password")
	private WebElement forgotPasswordLink;
	@FindBy(name = "submit")
	private WebElement loginBtn;
	@FindBy(partialLinkText = "Create an account")
	private WebElement createNewAcc;
	@FindBy(id = "username-error")
	private WebElement unErrorMsg;
	@FindBy(id = "password-error")
	private WebElement pwdErrorMsg;
	@FindBy(xpath = "//span[@style]")
	private WebElement getErrorMsg;

	private WebElement getGetErrorMsg() {
		return getErrorMsg;
	}

	public WebElement getUserNameEdt() {
		return userNameEdt;
	}

	public WebElement getPasswordEdt() {
		return passwordEdt;
	}

	private WebElement getForgotPasswordLink() {
		return forgotPasswordLink;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public void getCreateNewAcc() {
		createNewAcc.click();
	}

	public WebElement getUnErrorMsg() {
		return unErrorMsg;
	}

	public WebElement getPwdErrorMsg() {
		return pwdErrorMsg;
	}
	public WebElement getTitle() {
		return title;
	}

	// business logic
	public void login(String username, String password) throws Exception {
		getUserNameEdt().sendKeys(username);
		getPasswordEdt().sendKeys(password);
		getLoginBtn().click();
	}

	public void getErrorMsg() {
		System.out.println(getUnErrorMsg().getText());
		System.out.println(getPwdErrorMsg().getText());
		System.out.println(getGetErrorMsg().getText());
	}

	public void fogetPassword() {
		getForgotPasswordLink().click();
	}
	 

}
