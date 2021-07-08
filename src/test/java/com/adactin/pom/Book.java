package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book {
	
	public static WebDriver driver;
	
	@FindBy (id = "first_name")
	private WebElement firstname;
	
	@FindBy (id = "last_name")
	private WebElement lastname;
	
	@FindBy (id = "address")
	private WebElement addersss;
	
	@FindBy (id = "cc_num")
	private WebElement cardnumber;
	
	@FindBy (id = "cc_type")
	private WebElement cardtype;
	
	@FindBy (id = "cc_exp_month")
	private WebElement expmonth;
	
	@FindBy (id = "cc_exp_year")
	private WebElement expyear;
	
	@FindBy (id = "cc_cvv")
	private WebElement cvvnumber;
	
	@FindBy (id = "book_now")
	private WebElement booknow;

	public Book(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddersss() {
		return addersss;
	}

	public WebElement getCardnumber() {
		return cardnumber;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getExpmonth() {
		return expmonth;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCvvnumber() {
		return cvvnumber;
	}

	public WebElement getBooknow() {
		return booknow;
	}

}
