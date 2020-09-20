package com.qa.steps;

import org.junit.Assert;

import com.qa.webpages.EditCustomerInformationPage;
import com.qa.webpages.ProjectsAndCustomersPage;

import net.thucydides.core.annotations.Step;

public class DeleteCustomerSteps 
{
	ProjectsAndCustomersPage projAndCust;
	EditCustomerInformationPage delCustPage;
	
	@Step
	public void clickOndeleteCustomer()
	{
		projAndCust.clickonOLAMCustomer();
	}
	
	@Step
	public void deleteCust()
	{
		delCustPage.deleteThisCustomer();
		Assert.assertEquals("Customer has been successfully deleted.",projAndCust.retrieveSuccessMessage());
	}
	
	
}
