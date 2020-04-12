	
Feature: Product description
		
		
		@test
		Scenario: Verify product name 
		
			Given I am on the homepage
			When I click on Blouse
			Then The product page should also display Blouse
		
		
		@test
		Scenario: Verify default product quantity
		
			Given I am on the homepage
			When I click on Blouse
			Then I land on product page
			And The default quantity for the product should be 5
			

			
	
		
	 @plusminus
		Scenario: Verify plus and minus buttons
		
			Given I am on the homepage
			When I click on Blouse
			And I land on product page
			When I click on plus button 5 times
			Then The quantity should be correct
			And I click on minus button 3 times
			Then The quantity should be correct
			


		
		Scenario: Verify the database
		
			Given the first step
			When I do the second step
			Then I verify the third step
			

			
			
		
			
			
			
		
		

		
		
		
			
		
		
		
		

 