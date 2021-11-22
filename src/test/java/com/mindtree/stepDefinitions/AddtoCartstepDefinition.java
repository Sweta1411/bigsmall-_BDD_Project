package com.mindtree.stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.mindtree.pageobjects.AddToCart;
import com.mindtree.reusableComponant.Base;
import com.mindtree.utilities.ReadProperty;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddtoCartstepDefinition extends Base {
	
	public static Logger log= LogManager.getLogger(Base.class.getName());
	
	AddToCart ac=new AddToCart(driver);
	
	@Given("^User lands on Home Page$")
    public void user_lands_on_home_page() throws Throwable {
    	log.info("Accessing the property file");
		rp = new ReadProperty();
		
		log.info("Initializing Browser");
		WebDriver driver = Base.initializeDriver();
		
		log.info("Invoking the website");
		driver.get(rp.getUrl());
		
		log.info("Maximizing the window");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
	
	@And("Clicks on Cart")
	public void clicks_on_cart() {
	    // Write code here that turns the phrase above into concrete actions
		//test.info("Clicking on cart");
		log.info("Clicked on cart");
		ac.clickCart().click();
	}

	@Then("User selects the item and click on it")
	public void user_selects_the_item_and_click_on_it() {
	    // Write code here that turns the phrase above into concrete actions
		//test.info("Selecting the item");
		log.info("Selecting the item");
		ac.getSelectedItem().click();
	}

	@When("the Page loads the details user clicks on add to cart")
	public void the_page_loads_the_details_user_clicks_on_add_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
		//test.info("Adding the item to cart");
		log.info("Adding the item to cart");
		ac.AddItem().click();
	}

	@And("Clicks on checkout option and close the popups")
	public void clicks_on_checkout_option_and_close_the_popups() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		//test.info("Clicking on checkout");
		log.info("Click on checkout");
		ac.getCheckout().click();
		Thread.sleep(900);
		log.info("Closing the popup");
		ac.closeWAPopup().click();
		Thread.sleep(3000);
	}

	@Then("A page with the order summary should be displayed")
	public void a_page_with_the_order_summary_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(ac.getSummary().isDisplayed());
		//test.info("Product succesfully added to cart and checkout and Order Summary displayed");
		log.info("Order Summary displayed sucessfully");
		
	}

}
