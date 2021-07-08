package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.My_Baseclass;
import com.adactin.pom.Book;
import com.adactin.properties.Page_Object_Manager;
import com.adactin.runner.Runner;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Booking extends My_Baseclass {
	
	public static WebDriver driver = Runner.driver;
	
	Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	@When("^User enter \"([^\"]*)\" the first name$")
	public void user_enter_the_first_name(String arg1) throws Throwable {
	   inputOfElement(pom.Booking_page().getFirstname(), arg1);
	}

	@When("^User enter \"([^\"]*)\" the second name$")
	public void user_enter_the_second_name(String arg1) throws Throwable {
	    inputOfElement(pom.Booking_page().getLastname(), arg1);
	}

	@When("^User enter \"([^\"]*)\" the Address$")
	public void user_enter_the_Address(String arg1) throws Throwable {
	    inputOfElement(pom.Booking_page().getAddersss(), arg1);
	}

	@When("^User enter \"([^\"]*)\" the credit card number$")
	public void user_enter_the_credit_card_number(String arg1) throws Throwable {
	    inputOfElement(pom.Booking_page().getCardnumber(), arg1);
	}

	@When("^User enter the cardtype$")
	public void user_enter_the_cardtype() throws Throwable {
	    dropDown(pom.Booking_page().getCardtype(), "byvalue", "VISA");
	}

	@When("^User enter the month and year$")
	public void user_enter_the_month_and_year() throws Throwable {
	    dropDown(pom.Booking_page().getExpmonth(), "byvalue", "4");
	    dropDown(pom.Booking_page().getExpyear(), "byvalue", "2022");
	}

	@When("^User enter \"([^\"]*)\" the cvv number$")
	public void user_enter_the_cvv_number(String arg1) throws Throwable {
	    inputOfElement(pom.Booking_page().getCvvnumber(), arg1);
	}

	@Then("^user Booking the hotel$")
	public void user_Booking_the_hotel() throws Throwable {
	    ClickOnElement(pom.Booking_page().getBooknow());
	}

}
