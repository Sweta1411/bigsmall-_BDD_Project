package com.mindtree.stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.mindtree.pageobjects.SortItem;
import com.mindtree.reusableComponant.Base;
import com.mindtree.utilities.ReadProperty;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SortItemstepDefinition extends Base{
	
	public static Logger log= LogManager.getLogger(Base.class.getName());
	
	SortItem so=new SortItem(driver);
	
	WebElement sort=so.getSortItem();
	
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
	
	@And("Click on Secret Santa Gifts section")
	public void click_on_secret_santa_gifts_section() {
	    // Write code here that turns the phrase above into concrete actions
		//test.info("Clicking on Secret Santa Gifts section from Navigation Bar");
		
		so.getSecretSantaGifts().click();

	}

	@Then("The page with results should be displayed")
	public void the_page_with_results_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		log.info("Clicking on  Secret Santa Gifts section from Navigation Bar");
	}

	@When("User clicks on sort by")
	public void user_clicks_on_sort_by() {
	    // Write code here that turns the phrase above into concrete actions
		//test.info("Clicking on Sort and choose the Best Selling option from the dropdown");
		log.info("Clicking on Sort and choose the Best Selling option from the dropdown");
		sort.click();
	}

	@And("Clicks on Best Selling Option from the drop-down")
	public void clicks_on_best_selling_option_from_the_drop_down() {
	    // Write code here that turns the phrase above into concrete actions
		sort.sendKeys(Keys.ARROW_DOWN);
		sort.sendKeys(Keys.ARROW_DOWN);
		sort.sendKeys(Keys.ENTER);
	}

	@Then("The Page showing results sorted with hot sellers should be displayed")
	public void the_page_showing_results_sorted_with_hot_sellers_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(so.getSortCheck().getText(),"Hot Seller");
		log.info("Best Selling Products displayed");
		
		//test.pass("Sucessfully sorted and displayed the best selling products"); 
		
	}

}
