package com.qa.webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class AddNewCustomerPage extends PageObject
{
	@FindBy(name="name")
	private WebElement customerNameTextField;
	
	@FindBy(xpath="//input[@value='Create Customer']")
	private WebElement  createCustomerButton;

	public String  getAddNewCustomerPageTitle()
	{
		return getTitle();
	}
	
	public WebElement getCustomerNameTextField() 
	{
		return customerNameTextField;
	}

	public WebElement getCreateCustomerButton() 
	{
		return createCustomerButton;
	}
	
	public void enterCustomername(String customerName)
	{
		customerNameTextField.sendKeys(customerName);
	}
	
	public void clickOnCreateCustomerButton()
	{
		createCustomerButton.click();
	}
	
}
