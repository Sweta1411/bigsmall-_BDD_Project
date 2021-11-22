package com.mindtree.stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.mindtree.pageobjects.Wishlist;
import com.mindtree.reusableComponant.Base;
import com.mindtree.utilities.ReadProperty;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WishListstepDefinition extends Base {
	
	public static Logger log= LogManager.getLogger(Base.class.getName());
	
	Wishlist wl=new Wishlist(driver);
	
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
	
	@And("User search for gifts in search box")
	public void user_search_for_gifts_in_search_box() throws InterruptedException {

		
		log.info("Searching an item from the search bar");
		//test.info("Searching an item from the search bar");
		wl.getSearchResult().sendKeys("gifts",Keys.ENTER);
		
		Thread.sleep(3000);

	}

	@When("The Page is displayed user clicks on the product")
	public void the_page_is_displayed_user_clicks_on_the_product() {
	   
		log.info("Clicked on the desired product");
		//test.info("Clicked on the desired product");
		wl.selectWishlistItem().click();
		
	}

	@Then("The Page with product details open")
	public void the_page_with_product_details_open() {
	    
		log.info("Clicked on the Add to wishlist");
		//test.info("Clicked on the Add to wishlist");
		
	}

	@And("User clicks on add to Wishlist Option")
	public void user_clicks_on_add_to_wishlist_option() throws InterruptedException {
		
		Thread.sleep(5000);
		wl.addToWishlist().click();
	    
	}

	@Then("A popup is displayed where user clicks on View wishlist url in the popup")
	public void a_popup_is_displayed_where_user_clicks_on_view_wishlist_url_in_the_popup() throws InterruptedException {
	    
		log.info("Clicked on View product in wishlist link and naviagated to the page");
		//test.info("Clicking on view product link and navigating to wishlist");
		wl.viewWishList().click();
		Thread.sleep(3000);
	}

	@When("The wishlist Page is displayed close popups")
	public void the_wishlist_page_is_displayed_close_popups() {
	   
		wl.closePopup().click();
	}

	@Then("The product added should be displayed correctly")
	public void the_product_added_should_be_displayed_correctly() throws InterruptedException {
		
		Assert.assertTrue(wl.getWishlist().isDisplayed());
		log.info("Product verified");
		//test.pass("Added item is present in Wishlist, Product Verified");
		
		Thread.sleep(5000);
	    
	}


}
