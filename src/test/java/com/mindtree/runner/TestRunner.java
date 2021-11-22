package com.mindtree.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

import com.mindtree.reusableComponant.Base;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features= ".//features//",
		glue= "com.mindtree.stepDefinitions"
		)
public class TestRunner extends AbstractTestNGCucumberTests {
	
	
}