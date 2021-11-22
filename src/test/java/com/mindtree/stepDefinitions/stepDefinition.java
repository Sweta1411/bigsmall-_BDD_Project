package com.mindtree.stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.mindtree.pageobjects.HomePage;
import com.mindtree.reusableComponant.Base;
import com.mindtree.utilities.ReadProperty;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class stepDefinition extends Base {
	
	public static Logger log= LogManager.getLogger(Base.class.getName());
	
	HomePage hp=new HomePage(driver);
	
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

	@Then("BigSmall Website logo should be displayed")
	public void big_small_website_logo_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
//		log.info("Validating Title Image");
//		test.info("Verifiying Logo");
		Assert.assertTrue(hp.getTitleImg().isDisplayed());
//		test.pass("Logo Verified");
		
	}

	@Then("the Navigation Bar should be Displayed")
	public void the_navigation_bar_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
//		log.info("Validating Navigation Bar");
//		test.info("Validating Navigation Bar");
		Assert.assertTrue(hp.getNavBar().isDisplayed());
//		test.pass("Navigation Bar is displayed");
		
	}


}
