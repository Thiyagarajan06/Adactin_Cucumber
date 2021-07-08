package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.My_Baseclass;
import com.adactin.pom.LoginPage;
import com.adactin.pom.Logout_Pom;
import com.adactin.properties.Page_Object_Manager;
import com.adactin.runner.Runner;

import cucumber.api.java.en.When;

public class Logout extends My_Baseclass{
	
	public static WebDriver driver = Runner.driver;
	
	
	Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	
	@When("^User clicks the logout$")
	public void user_clicks_the_logout() throws Throwable {
		ClickOnElement(pom.LogoutPage().getLogout());
	   
	}
}
