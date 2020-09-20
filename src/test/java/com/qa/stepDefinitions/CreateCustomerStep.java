package com.qa.stepDefinitions;

import com.qa.steps.CreateCustomerSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CreateCustomerStep 
{
	@Steps
	CreateCustomerSteps createCustSteps;
	
	@Given("^when user is on open task page$")
	public void when_user_is_on_open_task_page() 
	{
	  
	}

	@When("^when user clicks on link$")
	public void when_user_clicks_on_link() 
	{
		createCustSteps.clickOnProjAndCustomers();
	}

	@And("^when user clicks on add new cutomer$")
	public void when_user_clicks_on_add_new_cutomer() 
	{
		createCustSteps.clickOnAddNewCustomer();
	}

	@And("^user enterscustomer name to add \"([^\"]*)\"$")
	public void user_enterscustomer_name_to_add(String customerName) 
	{
		createCustSteps.enterCustmerName(customerName);
	}

	@And("^when user clicks on create customer button$")
	public void when_user_clicks_on_create_customer_button() 
	{
		createCustSteps.clickOnCreateCustomerBtn();
	}

	@Then("^new cutomer should be created$")
	public void new_cutomer_should_be_created() 
	{
	
	}


}
