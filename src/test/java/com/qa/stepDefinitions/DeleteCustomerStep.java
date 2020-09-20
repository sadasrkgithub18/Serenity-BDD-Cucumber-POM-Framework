package com.qa.stepDefinitions;

import com.qa.steps.DeleteCustomerSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class DeleteCustomerStep 
{
	@Steps
	DeleteCustomerSteps delCustSteps;
	
	@Given("^when user is on Proj and customers Page$")
	public void when_user_is_on_Proj_and_customers_Page() 
	{
		
	}

	@When("^user click on customer link to delete$")
	public void user_click_on_customer_link_to_delete() 
	{
		delCustSteps.clickOndeleteCustomer();
	}

	@Then("^user clicks on delete the cutomer button$")
	public void user_clicks_on_delete_the_cutomer_button() 
	{
		delCustSteps.deleteCust();
	}

	@Then("^user should be deleted sucessfully$")
	public void user_should_be_deleted_sucessfully() 
	{
		
	}


}
