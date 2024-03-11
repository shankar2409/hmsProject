package com.ObjectRepo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.hms.genericUtils.WebDriverUtils;

public class DoctorManagePatientsPage extends WebDriverUtils {
	WebDriver driver;

	public DoctorManagePatientsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(xpath = "//button[.='Add Medical History']")
	private WebElement addMedicalHistory;

	@FindBy(xpath = "//th[contains(.,'Blood Pressure')]/following-sibling::td/input")
	private WebElement bloodPressure;
	@FindBy(xpath = "//th[contains(.,'Blood Sugar')]/following-sibling::td/input")
	private WebElement bloodSuger;
	@FindBy(xpath = "//th[contains(.,'Weight')]/following-sibling::td/input")
	private WebElement weigh;
	@FindBy(xpath = "//th[contains(.,'Body Temprature')]/following-sibling::td/input")
	private WebElement bodyTemp;
	@FindBy(xpath = "//th[contains(.,'Prescription')]/following-sibling::td/textarea")
	private WebElement prescription;
	@FindBy(xpath = "//button[@class='btn btn-primary' and @name='submit']")
	private WebElement submitBtn;
	@FindBy(xpath = "//button[@class='btn btn-secondary' and contains(.,'Close')]")
	private WebElement closeBtn;
	@FindBy(css = "[class='close']")
	private WebElement closeicon;
	@FindBy(xpath = "//div[@class='modal-content']")
	private WebElement medicalHisPage;

	public WebElement getMedicalHisPage() {
		return medicalHisPage;
	}

	public WebElement getWeigh() {
		return weigh;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public WebElement getCloseBtn() {
		return closeBtn;
	}

	public WebElement getCloseicon() {
		return closeicon;
	}

	public WebElement getAddMedicalHistory() {
		return addMedicalHistory;
	}

	public WebElement getBloodPressure() {
		return bloodPressure;
	}

	public WebElement getBloodSuger() {
		return bloodSuger;
	}

	public WebElement getWeight() {
		return weigh;
	}

	public WebElement getBodyTemp() {
		return bodyTemp;
	}

	public WebElement getPrescription() {
		return prescription;
	}

	public void addPrescription(String Bp, String BSuger, String weight, String temp, String Prescription)
			throws InterruptedException {
//		waitUntilElementToBeClickable(driver, 20, addMedicalHistory);
		Thread.sleep(3000);
		addMedicalHistory.click();
		Thread.sleep(3000);
		bloodPressure.sendKeys(Bp);
		bloodSuger.sendKeys(BSuger);
		weigh.sendKeys(weight);
		bodyTemp.sendKeys(temp);
		prescription.sendKeys(Prescription);
		waitUntilElementToBeClickable(driver, 20, submitBtn);
		submitBtn.click();
		try {
			Alert alert = switchToAlert(driver);
			System.out.println(alert.getText());
			alert.accept();
		} catch (Exception e) {

		}

	}
}
