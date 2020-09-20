package com.qa.stepDefinitions;

import com.qa.steps.LoginLogoutSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginValidationSteps 
{
	@Steps
	LoginLogoutSteps loginLogoutSteps;
	
	
	@Given("^when user naviates to login pae$")
	public void when_user_naviates_to_login_pae() 
	{
		loginLogoutSteps.navigateToLoginPage();
	}

	@When("^user enters (.*)$")
	public void user_enters_admin(String username) 
	{
		loginLogoutSteps.enterUserName(username);
	}

	@When("^when user enters (.*)$")
	public void when_user_enters_manager(String password) 
	{
		loginLogoutSteps.enterPassword(password);
	}

	@When("^when user clicks on login button$")
	public void when_user_clicks_on_login_button() throws InterruptedException
	{
		loginLogoutSteps.clickOnLogin();
	}

	
}
