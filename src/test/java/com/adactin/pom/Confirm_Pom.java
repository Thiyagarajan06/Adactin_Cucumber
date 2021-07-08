package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirm_Pom {
	public static WebDriver driver;
	
	
	@FindBy (id = "radiobutton_0")
	private WebElement select;
	
	@FindBy(id = "continue")
	private WebElement contd;

	public Confirm_Pom(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getSelect() {
		return select;
	}

	public WebElement getContd() {
		return contd;
	}
	
	

}
