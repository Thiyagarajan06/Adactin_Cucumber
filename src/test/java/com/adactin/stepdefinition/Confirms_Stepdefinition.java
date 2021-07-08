package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.My_Baseclass;
import com.adactin.pom.Confirm_Pom;
import com.adactin.properties.Page_Object_Manager;
import com.adactin.runner.Runner;

import cucumber.api.java.en.*;

public class Confirms_Stepdefinition extends My_Baseclass {
	public static WebDriver driver = Runner.driver;
	
	
	
	Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	@When("^User selects the hotel$")
	public void user_selects_the_hotel() throws Throwable {
		ClickOnElement(pom.Confirm_page().getSelect());
	}

	@When("^User clicks the submit button$")
	public void user_clicks_the_submit_button() throws Throwable {
		ClickOnElement(pom.Confirm_page().getContd());
	}

	@Then("^Validate the selection$")
	public void validate_the_selection() throws Throwable {
	}

}
