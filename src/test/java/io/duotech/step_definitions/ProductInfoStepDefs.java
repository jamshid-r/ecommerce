package io.duotech.step_definitions;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.duotech.pages.HomePage;
import io.duotech.pages.ProductPage;
import io.duotech.utilities.Driver;

public class ProductInfoStepDefs {
	String homepageName;
	Integer globalTimes;
	
	@When("I click on Blouse")
	public void i_click_on_Blouse() {
	    HomePage homepage = new HomePage();
	    homepageName = homepage.blouse.getText();
	    homepage.blouse.click();
	}
	@Then("The product page should also display Blouse")
	public void the_product_page_should_also_display_Blouse() {
	    ProductPage productPage = new ProductPage();
	    String productPageName = productPage.productName.getText()+"sdavgd";
	    
	    assertEquals(homepageName, productPageName);
	}
	
	
	@Then("I land on product page")
	public void i_land_on_product_page() {
	  String actual = Driver.getDriver().getTitle();
	  String expected = "Blouse - My Store";
	  assertEquals(expected, actual);
	}

	@Then("The default quantity for the product should be {int}")
	public void the_default_quantity_for_the_product_should_be(Integer expected) {
	   ProductPage productPage = new ProductPage();
	   String actual = productPage.quantityBox.getAttribute("value");
	    assertEquals(expected.toString(), actual);
		
	}
	
	@Then("I click on {word} button {int} times")
	public void i_click_on_plus_button_times(String word, Integer times) {
	   ProductPage pp = new ProductPage();
	  
	   for (int i = 0; i < times; i++) {
		if(word.equalsIgnoreCase("plus")){
			 pp.plusButton.click();
		}else{
			pp.minusButton.click();
		}
	}
	   	
	   globalTimes = times + 1;
	   
	  
	}

	@Then("The quantity should be correct")
	public void the_quantity_should_be_correct() {
		ProductPage pp = new ProductPage();
		String actual = pp.quantityBox.getAttribute("value");
		assertEquals(globalTimes.toString(), actual);
	}
	
	
	@Given("the first step")
	public void the_first_step() {
	    System.out.println("1");
	}

	@When("I do the second step")
	public void i_do_the_second_step() {
	    System.out.println("2");
	}

	@Then("I verify the third step")
	public void i_verify_the_third_step() {
	    System.out.println("3");

	}



	

}
