package com.qa.steps;

import org.junit.Assert;

import com.qa.webpages.LoginPage;
import com.qa.webpages.OpenTaskPage;

import net.thucydides.core.annotations.Step;

public class LoginLogoutSteps 
{
	LoginPage loginPage;
	OpenTaskPage openTaskPage;
	
	@Step
	public void navigateToLoginPage()
	{
		loginPage.open();
	}
	
	@Step
	public void enterUserName(String username)
	{
		loginPage.enterUsername(username);
	}
	
	@Step
	public void enterPassword(String password)
	{
		loginPage.enterPassword(password);
	}
	
	@Step
	public void clickOnLogin() throws InterruptedException
	{
		loginPage.clickOnLoginButton();
		
		Assert.assertEquals("actiTIME - Open Tasks",openTaskPage.getTitle());
	}
	
}
