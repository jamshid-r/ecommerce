package io.duotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.duotech.utilities.Driver;

public class HomePage {
	
	
	public HomePage () {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (className = "login")
	public WebElement signInLink;
	
	
	@FindBy (xpath = "(//a[@title='Blouse'])[2]")
	public WebElement blouse;

	

}
