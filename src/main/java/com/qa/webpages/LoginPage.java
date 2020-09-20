package com.qa.webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.base.BasePage;

import net.serenitybdd.core.pages.PageObject;

public class LoginPage extends PageObject
{
	BasePage basePage;
	
	@FindBy(name="username")
	private WebElement usernameTextField;
	
	@FindBy(name="pwd")
	private WebElement passwordTextField;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement loginButton;

	public WebElement getUsernameTextField() 
	{
		return usernameTextField;
	}

	public WebElement getPasswordTextField() 
	{
		return passwordTextField;
	}

	public WebElement getLoginButton() 
	{
		return loginButton;
	}
	
	public String getLoginPageTitle()
	{
		return getTitle();
	}
	
	public void navigateToLoginPage()
	{
		open();
	}
	
	public void enterUsername(String username)
	{
		basePage.dataTypingAction("name", "username", username);
		//usernameTextField.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		basePage.dataTypingAction("name", "pwd", password);
		//passwordTextField.sendKeys(password);
	}
	
	public void clickOnLoginButton()
	{
		basePage.clickAction("xpath","//input[@type='submit']");
		basePage.waitForPageTitle("title");
	}

}
