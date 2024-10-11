package com.amazon.Amazon_Mini_Project;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Amazon_HomePage {
	WebDriver driver;
	
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	WebElement accountsandlist;
	
	@FindBy(xpath="//button[.='Manage Profiles']")
	WebElement manage_profiles_button;

	@FindBy(partialLinkText="View")
	WebElement view_button;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement search_field;
		
	public void hoverover_accountandlists(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(accountsandlist).perform();	
	}
	
	public void click_manage_profiles_button()
	{
		manage_profiles_button.click();		
	}
	
	public void click_view_button(WebDriver driver)
	{
		view_button.click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[.='Your Profile']")).isDisplayed(),"sorry, profile page is not displayed");
	   // Assert.assertEquals(driver.getTitle(),"Profile Hub", "profile page not displayed");
	}
	
	
	public void enter_mobiles_in_search_field(WebDriver driver) throws EncryptedDocumentException, IOException
	{
		search_field.sendKeys("mobiles"+Keys.ENTER);
		Assert.assertEquals(driver.getTitle(), "Amazon.in : mobiles", "sorry, mobiles searched page title not matched");
	}
	
	
	public Amazon_HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
