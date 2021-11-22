package com.mindtree.stepDefinitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.mindtree.pageobjects.Login;
import com.mindtree.reusableComponant.Base;
import com.mindtree.utilities.ReadProperty;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginTeststepDefinition extends Base{
	
	public static Logger log= LogManager.getLogger(Base.class.getName());
	
	Login l = new Login(driver);
	
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
	
	@And("Clicks on sign in")
	public void clicks_on_sign_in() {
	    // Write code here that turns the phrase above throw new io.cucumber.java.PendingException();
		log.info("CLicking on sign in button");
		//test.info("CLicking on sign in button");

		l.getLogin().click();
	}

	@Then("User enters username and password")
	public void user_enters_username_and_password() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		FileInputStream fis1=new FileInputStream(rp.getExcelSheetPath());
		XSSFWorkbook workbook=new XSSFWorkbook(fis1);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		Iterator<Row> row=sheet.iterator();
		Row firstRow = row.next();
		Row secondRow= row.next();
		
		
		Iterator<Cell> cell=firstRow.cellIterator();
		cell.next();
		
		String name=cell.next().getStringCellValue();
		
		Iterator<Cell> cell1=secondRow.cellIterator();
		cell1.next();
		
		String pass=cell1.next().getStringCellValue();
		
		log.info("Entering username");
		//test.info("Entering username");
		l.getUserElement().sendKeys(name);
		
		log.info("Entering Password");
		//test.info("Entering Password");
		l.getUserPass().sendKeys(pass);
		
		log.info("Entered username= "+name);
		log.info("Entered password= "+pass);
		workbook.close();
	}

	@And("Click on submit")
	public void click_on_submit() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		log.info("Click on login");
		
		//test.info("Click on login");
		l.getSignin().click();
		
		Thread.sleep(40000);
		
	}

	@Then("let user manually enter captcha and My Account section should be displayed")
	public void let_user_manually_enter_captcha_and_my_account_section_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(l.getMyAccount().isDisplayed());
		log.info("Sign in successful");
		//test.pass("My Account Section is displayed");
		
	}
	

}
