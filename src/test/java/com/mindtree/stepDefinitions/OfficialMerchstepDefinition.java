package com.mindtree.stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.mindtree.pageobjects.OfficialMerchandise;
import com.mindtree.reusableComponant.Base;
import com.mindtree.utilities.ReadProperty;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OfficialMerchstepDefinition extends Base {
	
	public static Logger log= LogManager.getLogger(Base.class.getName());
	
	OfficialMerchandise om=new OfficialMerchandise(driver);
	
	Actions a=new Actions(driver);

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
	
	@And("^Hover the mouse over Official Merchandise section$")
    public void hover_the_mouse_over_official_merchandise_section() throws Throwable {
		
		
		log.info("Hovered over Official Merchandise Tab");
		//test.info("Hovered over Official Merchandise Tab");
		a.moveToElement(om.getOfficialMerchandise()).build().perform();
		Thread.sleep(2000);
       
    }

    @When("^The Option inside it are displayed user hover to Marvel Merchandise$")
    public void the_option_inside_it_are_displayed_user_hover_to_marvel_merchandise() throws Throwable {
    	
    	log.info("Hovered to Marvel Merchandise in subsection and clicked on it");
		//test.info("Hovered to Marvel Merchandise in subsection and clicked on it");
		
        
    }
    
    @And("^Click On The Marvel merchandise$")
    public void click_on_the_marvel_merchandise() throws Throwable {
    	
    	a.moveToElement(om.getMarvelMerch()).click().build().perform();
		Thread.sleep(2000);
        
    }

    @Then("^the page displaying results for Marvel Merchandise should be displayed$")
    public void the_page_displaying_results_for_marvel_merchandise_should_be_displayed() throws Throwable {
    	
    	Assert.assertEquals(om.getVerifiedTitle().getText(),"Marvel Merchandise");
		log.info("Title Verified");
		//test.pass("Successfully navigated to Marvel Merchandise Page");
        
    }

}
