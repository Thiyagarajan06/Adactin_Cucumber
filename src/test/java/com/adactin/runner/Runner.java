package com.adactin.runner;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.My_Baseclass;
import com.adactin.properties.File_Reader_Manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)


@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature" , 
                                 glue = "com\\adactin\\stepdefinition", monochrome = true,  plugin = {"pretty"})

public class Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() throws Throwable {
		String browser = File_Reader_Manager.getInstance().getInstanceCR().getBrowser();
		driver = My_Baseclass.browserLaunc(browser);
	}
	
	@AfterClass
	public static void tearDown() {
		driver.quit();

	}
	
	
	
}
