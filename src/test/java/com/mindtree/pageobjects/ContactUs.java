package com.mindtree.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.reusableComponant.Base;
import com.mindtree.uistore.ContactUsPageLocators;

public class ContactUs extends Base{
	
	public ContactUs(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getContact() {
		return driver.findElement(ContactUsPageLocators.Contact);
	}
	public WebElement getContName() {
		return driver.findElement(ContactUsPageLocators.contName);
	}
	public WebElement getContEmail() {
		return driver.findElement(ContactUsPageLocators.contEmail);
	}
	public WebElement getContMessage() {
		return driver.findElement(ContactUsPageLocators.contMessage);
	}
	public WebElement getContSubmit() {
		return driver.findElement(ContactUsPageLocators.contSubmit);
	}
	

}
