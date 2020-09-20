package com.qa.webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class OpenTaskPage extends PageObject
{
	@FindBy(className="logoutImg")
	private WebElement logoutButton;
	
	public WebElement getLogoutButton() 
	{
		return logoutButton;
	}
	
	public String getOpenTaskPageTitile()
	{
		return getTitle();
	}
	
    public void clickOnLogoutButton()
    {
		logoutButton.click();
	}
    
}
