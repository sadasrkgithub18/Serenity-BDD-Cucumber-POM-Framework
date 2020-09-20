package com.qa.steps;

import org.junit.Assert;

import com.qa.webpages.AddNewCustomerPage;
import com.qa.webpages.ProjectsAndCustomersPage;

import net.thucydides.core.annotations.Step;

public class CreateCustomerSteps 
{
	ProjectsAndCustomersPage projAndCust;
	AddNewCustomerPage addNewCustomerPage;
	
	@Step
	public void clickOnProjAndCustomers()
	{
		projAndCust.clickOnProjectsAndCutomers();
	}
	
	@Step
	public void clickOnAddNewCustomer()
	{
		projAndCust.clickOnAddNewCutomer();
	}
	
	@Step
	public void enterCustmerName(String customerName)
	{
		addNewCustomerPage.enterCustomername(customerName);
	}
	
	@Step
	public void clickOnCreateCustomerBtn()
	{
		addNewCustomerPage.clickOnCreateCustomerButton();
		Assert.assertEquals("Customer has been successfully registered.",projAndCust.retrieveSuccessMessage());
	}
	
	
}
