 package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.My_Baseclass;
import com.adactin.pom.Hotel_Pom;
import com.adactin.properties.Page_Object_Manager;
import com.adactin.runner.Runner;

import cucumber.api.java.en.*;

public class Hotel_Stepdefinition extends My_Baseclass {
	
	public static WebDriver driver = Runner.driver;
	
	Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	

@When("^user enters the location$")
public void user_enters_the_location() throws Throwable {
	dropDown(pom.select_Hotel().getLocation(), "byValue", "Melbourne");
}

@When("^User enters the hotel$")
public void user_enters_the_hotel() throws Throwable {
	dropDown(pom.select_Hotel().getHotels(), "byValue", "Hotel Sunshine");
}

@When("^User enters the room type$")
public void user_enters_the_room_type() throws Throwable {
	dropDown(pom.select_Hotel().getRoomtype(), "byValue", "Super Deluxe");
}

@When("^User enters the number of rooms$")
public void user_enters_the_number_of_rooms() throws Throwable {
	dropDown(pom.select_Hotel().getRoomnos(), "byValue", "1");
}

@When("^User enters the check in date$")
public void user_enters_the_check_in_date() throws Throwable {
	clearOnElement(pom.select_Hotel().getDatepick());
	inputOfElement(pom.select_Hotel().getDatepick(), "06/06/2021");
}

@When("^User enters the check out date$")
public void user_enters_the_check_out_date() throws Throwable {
	clearOnElement(pom.select_Hotel().getDateout());
	inputOfElement(pom.select_Hotel().getDateout(), "8/6/2021");
}

@When("^User enters the Adults per room$")
public void user_enters_the_Adults_per_room() throws Throwable {
	dropDown(pom.select_Hotel().getAdultroom(), "byValue", "2");
}

@When("^User enters the children per room$")
public void user_enters_the_children_per_room() throws Throwable {
	dropDown(pom.select_Hotel().getChildRoom(), "byValue", "0");
}

@When("^User clicks the search button$")
public void user_clicks_the_search_button() throws Throwable {
	ClickOnElement(pom.select_Hotel().getSubmit());
}

@Then("^Validate the details of search hotel$")
public void validate_the_details_of_search_hotel() throws Throwable {
}

}
