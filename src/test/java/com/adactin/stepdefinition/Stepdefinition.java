package com.adactin.stepdefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.adactin.baseclass.My_Baseclass;
import com.adactin.pom.LoginPage;
import com.adactin.properties.File_Reader_Manager;
import com.adactin.properties.Page_Object_Manager;
import com.adactin.runner.Runner;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class Stepdefinition extends My_Baseclass{
	
	public static WebDriver driver = Runner.driver;
	
	Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	@Before // run before every sceneario
	public void beforeHooks(Scenario scenario) {
		String status = scenario.getStatus();
		System.out.println("Scenario status" + status);

	}
	
	@After // run after every scenario 
	public void afterHooks(Scenario scenario) throws Throwable {
		if (scenario.isFailed()) {
			screenshot("C:\\Users\\thiya\\workspace\\Adactin_Project\\Screenshot\\image.png");
			
		}
		
			 System.out.println("exit from the page");
	}
	

	
	@Given("^user launching the adactin application$")
	public void user_launching_the_adactin_application() throws Throwable {
		String url = File_Reader_Manager.getInstance().getInstanceCR().getUrl();
		url(url);
	}

	@When("^User enter the \"([^\"]*)\" in username field$")
	public void user_enter_the_in_username_field(String arg1) throws Throwable {
		inputOfElement(pom.getInstanceLogin().getUsername(), arg1);
	}

	@When("^User enter the \"([^\"]*)\" in password field$")
	public void user_enter_the_in_password_field(String arg1) throws Throwable {
		inputOfElement(pom.getInstanceLogin().getPassword(), arg1);
	
	}

	@When("^user clicks login button$")
	public void user_clicks_login_button() throws Throwable {
		ClickOnElement(pom.getInstanceLogin().getLogin());
	}

	@Then("^User validate the username and password$")
	public void user_validate_the_username_and_password() throws Throwable {
	}


}



