package io.duotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.duotech.utilities.Driver;

public class ProductPage {
	
	public ProductPage () {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (tagName = "h1")
	public WebElement productName;
	
	@FindBy (id = "quantity_wanted")
	public WebElement quantityBox;
	

	
	@FindBy (className = "icon-plus")
	public WebElement plusButton;
	

	@FindBy (className = "icon-minus")
	public WebElement minusButton;


}
