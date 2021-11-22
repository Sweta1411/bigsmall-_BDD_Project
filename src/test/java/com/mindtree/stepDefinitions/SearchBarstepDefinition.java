package com.mindtree.stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.mindtree.pageobjects.SearchItem;
import com.mindtree.reusableComponant.Base;
import com.mindtree.utilities.ReadProperty;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SearchBarstepDefinition extends Base {
	
	public static Logger log= LogManager.getLogger(Base.class.getName());
	
	SearchItem si=new SearchItem(driver);
	
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

	@And("^User pass the input into search box and press Enter$")
    public void user_pass_the_input_into_search_box_and_press_enter() throws Throwable {
		
		log.info("Entering text into the search bar");
		//test.info("Entering text into the search bar");
		
		si.getSearchBar().click();
		Thread.sleep(5000);
		si.getSearchBar().sendKeys("Iron Man",Keys.ENTER);
		Thread.sleep(5000);
		  
    }
	
	@Then("^The relevant products should be displayed onto the screen$")
    public void the_relevant_products_should_be_displayed_onto_the_screen() throws Throwable {
     
		log.info("Product dsiplayed");
		//test.pass("Product dsiplayed");
		Assert.assertTrue(si.getSearchItem().isDisplayed());
		
    }


}
