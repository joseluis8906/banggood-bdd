@buyAnithingFeature
Feature: Buy anything
	In order to look anything
  	As a potential buyer
  	I want to be able to buy anything that I feel like

	@buyAnythingScenario
  	Scenario: Should list items and buy anything
    	Given Jose want to navigate the web
    	When Jose search for items containing 't-shirt'
    	And Jose select an item from the result list
    	And Jose add these item to the shopping cart
    	Then Jose should only see selected item in the shopping cart
    
    @toDoListScenario
    Scenario: Add item in todo list
    	Given Juan want to add items to list
    	When Juan attemp to add 'anything' item to the list
    	Then  Juan shoul see the item in the list
    
    @Ignore
    @NothingSceneario
    Scenario: Nothing to do
    	Given Pepe want to make nothing
    	When Pepe make some action
    	Then Pepe should see movements in the page
    
    