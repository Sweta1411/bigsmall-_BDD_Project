package com.mindtree.stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.mindtree.pageobjects.GiftCard;
import com.mindtree.reusableComponant.Base;
import com.mindtree.utilities.ReadProperty;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GiftCardstepDefinition extends Base {
	
	public static Logger log= LogManager.getLogger(Base.class.getName());
	
	GiftCard gc=new GiftCard(driver);
	
//    @Given("^User lands on Home Page$")
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
    
    @And("^User clicks on Gift Card$")
    public void user_clicks_on_gift_card() throws Throwable {
    	
    	//test.info("Clicking on GiftCard");
		log.info("Clicking on GiftCard");
		gc.getGiftCard().click();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
    
    @Then("^A box for entering postal code is displayed$")
    public void a_box_for_entering_postal_code_is_displayed() throws Throwable {
    	
    	//test.info("Enter post code in post code column");
		
		log.info("Enter post code in post code column");
		gc.getPostCode().click();

        
    }

    @When("^The User enters the postal code and click on check$")
    public void the_user_enters_the_postal_code_and_click_on_check() throws Throwable {
       
    	gc.getPostCode().sendKeys("400014");
		
		log.info("Desired Message is displayed");
		gc.getCodeCheck().click();
		Thread.sleep(5000);
    }

    
    @Then("^The Available Message should be displayed on the screen$")
    public void the_available_message_should_be_displayed_on_the_screen() throws Throwable {
    	
    	Assert.assertEquals(gc.getCodeText().getText(),"Cash on Delivery is available.");
		//test.info("PostCode check");
		//test.pass("Cash on Delivery is Avaialable message is displayed");
        
    }

    
}
