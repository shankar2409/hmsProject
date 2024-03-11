package com.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Doctor_SearchPatient {
	
	public Doctor_SearchPatient(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "searchdata")
	private WebElement searchEdt;
	@FindBy(id = "submit")
	private WebElement SearchBtn;
	public WebElement getSearchEdt() {
		return searchEdt;
	}
	public WebElement getSearchBtn() {
		return SearchBtn;
	}
	
	public void SearchPatient(String patientName) {
		searchEdt.sendKeys(patientName);
		SearchBtn.click();
	}
}
