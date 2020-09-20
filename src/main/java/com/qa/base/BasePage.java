package com.qa.base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class BasePage extends PageObject
{
	private static WebElementFacade element;
	 
	
	
	public void waitForElementPresent(By locator) 
	{
		try 
		{
			waitForCondition().until(ExpectedConditions.elementToBeClickable(locator));
		}
		catch(Exception e)
		{
			System.out.println("Some error occured while waiting for the element "+locator.toString());
		}
	}
	
	
	public void waitForPageTitle(String title) 
	{
		try 
		{
			waitForCondition().until(ExpectedConditions.titleContains(title));
		}
		catch(Exception e)
		{
			System.out.println("Some error occured while waiting for the element "+title);
		}
	}
	
	public void alertHandlingAccept()
	{
		getDriver().switchTo().alert().accept();
	}
	
	   public void dataTypingAction(String locMech, String locValue, String testData)
	   {
		   element  = identifyElement(locMech, locValue);
		   if(element.isDisplayed() && element.isEnabled())
		   {
			   element.clear();
			   element.sendKeys(testData);
		   }
	   }
	   
	   
	   
	   
	   public void clickAction(String locMech, String locValue)
	   {
		   element = identifyElement(locMech, locValue);
		   if(element.isDisplayed() && element.isEnabled())
		   {
			   element.click();
		   }
	   }
	   
	   
	   public void clickActionUsingActionsClass()
	   {
		   withAction().sendKeys(Keys.ENTER).build().perform();
	   }
	   
	   public void mouseHoverAction(String locMech, String locValue)
	   {
		   element = identifyElement(locMech, locValue);
		   withAction().sendKeys(element).build().perform();
	   }
	   
	   public WebElementFacade identifyElement(String locMech, String locValue)
	   {
		
		    switch(locMech)
		   {
		     case "id"              :  element = find(By.id(locValue));
		                               break;
		                 
		     case "name"            :  element =  find(By.name(locValue));            
		                               break;
		                   
		     case "classname"       :  element =  find(By.className(locValue));              
		                               break;
		                        
		     case "tagName"         :  element =  find(By.tagName(locValue));
		                               break;
		                      
		     case "linkText"        :  element =  find(By.linkText(locValue));  
		                               break;
		                       
		     case "partialLinkText" :  element =  find(By.partialLinkText(locValue)); 
	                                   break;
	            
		     case "xpath"           :  element =  find(By.xpath(locValue));                       
		    		                   break;
		    
		     case "cssSelector"     :  element =  find(By.cssSelector(locValue));
		    		                   break;
		   }
		   return element;
		   
	   }
	   
	  
}
