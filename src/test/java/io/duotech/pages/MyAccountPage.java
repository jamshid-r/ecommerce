package io.duotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.duotech.utilities.Driver;

public class MyAccountPage {
	
	public MyAccountPage () {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (className = "info-account")
	public WebElement welcomeMessage;

}
