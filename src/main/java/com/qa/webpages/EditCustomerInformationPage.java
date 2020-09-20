package com.qa.webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.base.BasePage;

import net.serenitybdd.core.pages.PageObject;

public class EditCustomerInformationPage extends PageObject
{
	BasePage basePage;
	@FindBy(xpath="//input[@value='Delete This Customer']")
	private WebElement deleteTheCustomer;

	public String getEditCustomerInformationPageTitle()
	{
	   return getTitle();	
	}
	
	public WebElement getDeleteTheCustomer() 
	{
		return deleteTheCustomer;
	}

	public void deleteThisCustomer() 
	{
		deleteTheCustomer.click();
		basePage.alertHandlingAccept();
	}
	
}
