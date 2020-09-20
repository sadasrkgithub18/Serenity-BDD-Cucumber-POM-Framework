package com.qa.webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class ProjectsAndCustomersPage extends PageObject
{
	@FindBy(linkText="Projects & Customers")
	private WebElement ProjectsAndCutomers;
	
	@FindBy(xpath="//input[@value='Add New Customer']")
	private WebElement clickOnAddNewCustomer;
	
	@FindBy(className="successmsg")
	private WebElement customerCreatedSuccessfuly;
	
	@FindBy(linkText="OLAM")
	private WebElement cutomerOLAM;

	
	public String getProjectsAndCustomersPageTitle()
	{
		return getTitle();
	}
	
	public WebElement getProjectsAndCutomers() 
	{
		return ProjectsAndCutomers;
	}

	public WebElement getClickOnAddNewCustomer() 
	{
		return clickOnAddNewCustomer;
	}

	public WebElement getCustomerCreatedSuccessfuly() 
	{
		return customerCreatedSuccessfuly;
	}

	public WebElement getCutomerOLAM() 
	{
		return cutomerOLAM;
	}
	
	public void clickOnProjectsAndCutomers()
	{
		ProjectsAndCutomers.click();
	}
	
	public void clickOnAddNewCutomer()
	{
		clickOnAddNewCustomer.click();
	}
	
	public void clickonOLAMCustomer() 
	{
		cutomerOLAM.click();
	}
	
	
	public String retrieveSuccessMessage()
	{
		String data = customerCreatedSuccessfuly.getText();
		return data;
	}
	
}
