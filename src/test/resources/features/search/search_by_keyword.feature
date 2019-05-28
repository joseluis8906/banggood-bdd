@buyAnithing
Feature: Buy anything
	In order to look anything
  	As a potential buyer
  	I want to be able to buy anything that I feel like

	@tshirtscenario
  	Scenario: Should list items and buy anything
    	Given Jose want to navigate the web
    	When Jose search for items containing 't-shirt'
    	And Jose select an item from the result list
    	And Jose add these item to the shopping cart
    	Then Jose should only see selected item in the shopping cart