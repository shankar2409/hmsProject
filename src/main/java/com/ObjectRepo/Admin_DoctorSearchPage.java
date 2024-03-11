package com.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_DoctorSearchPage 
{
	WebDriver driver;
	
	public Admin_DoctorSearchPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			this.driver = driver;
		}

	// initialization
	@FindBy (name = "searchdata") private WebElement searchDataEdt;
	
	@FindBy (id = "submit") private WebElement searchBtn;

	// initialization done in constructor on top
	
	// utilization
	public WebElement getSearchDataEdt() 
	{
		return searchDataEdt;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}
	
	public void searchPatient(String nameOrNumber)
	{
		searchDataEdt.sendKeys(nameOrNumber);
		searchBtn.click();
	}
	

}
