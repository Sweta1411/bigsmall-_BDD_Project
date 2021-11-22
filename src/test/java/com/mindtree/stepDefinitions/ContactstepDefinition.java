package com.mindtree.stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.mindtree.pageobjects.ContactUs;
import com.mindtree.reusableComponant.Base;
import com.mindtree.utilities.ReadProperty;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactstepDefinition extends Base{
	
	ContactUs cu=new ContactUs(driver);
	
	public static Logger log= LogManager.getLogger(Base.class.getName());

//	@Given("^User lands on Home Page$")
//    public void user_lands_on_home_page() throws Throwable {
//    	log.info("Accessing the property file");
//		rp = new ReadProperty();
//		
//		log.info("Initializing Browser");
//		WebDriver driver = Base.initializeDriver();
//		
//		log.info("Invoking the website");
//		driver.get(rp.getUrl());
//		
//		log.info("Maximizing the window");
//		driver.manage().window().maximize();
//		
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//    }
	
	@Then("User clicks on Contact Us link")
	public void user_clicks_on_contact_us_link() {
	    
		//test.info("Click on contact us");
		log.info("Click on contact us");
	    
	}

	@When("the User lands on Contact Us form")
	public void the_user_lands_on_contact_us_form() {
	    // Write code here that turns the phrase above into concrete actions
		cu.getContact().click();
	    
	}
	
	@Then("^User should enter with name \"([^\"]*)\" , Email-id \"([^\"]*)\" and Message \"([^\"]*)\"$")
    public void user_should_enter_with_name_something_emailid_something_and_message_something(String strArg1, String strArg2, String strArg3) throws Throwable {
        log.info("Name entered");
        log.info(strArg1);
        log.info("Email-id entered");
        log.info(strArg2);
        log.info("Message entered");
        log.info(strArg3);
        
    }



	@And("User Clicks on submit")
	public void user_clicks_on_submit() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		//test.info("Click on submit");
		log.info("Click on submit");
		cu.getContSubmit().click();
		
		
		Thread.sleep(3000);
	}

	
}
