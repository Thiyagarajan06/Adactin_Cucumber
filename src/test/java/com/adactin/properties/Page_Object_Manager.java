package com.adactin.properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adactin.pom.Book;
import com.adactin.pom.Confirm_Pom;
import com.adactin.pom.Hotel_Pom;
import com.adactin.pom.LoginPage;
import com.adactin.pom.Logout_Pom;

public class Page_Object_Manager {
	
	public static WebDriver driver;
    
	private LoginPage login;
	private Hotel_Pom hotel;
	private Book booking;
	private Confirm_Pom confirm;
	private Logout_Pom logout;
	
	
	public Page_Object_Manager(WebDriver Ldriver) {
		this.driver = Ldriver;
		PageFactory.initElements(Ldriver, this);
	}
	
	public LoginPage getInstanceLogin() {
		login = new LoginPage(driver);
		return login;
    }
	
	public Hotel_Pom select_Hotel() {
		hotel = new Hotel_Pom(driver);
		return hotel;

	}
	
	public Book Booking_page() {
		booking = new Book(driver);
		return booking;

	}
	
	public Confirm_Pom Confirm_page() {
		confirm = new Confirm_Pom(driver);
		return confirm;

	}
	
	public Logout_Pom LogoutPage() {
		logout = new Logout_Pom(driver);
		return logout;

	}

	

	
	
}
