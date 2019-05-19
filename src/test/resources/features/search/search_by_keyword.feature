# tag::header[]
Feature: Buy anything
	In order to look anything
  	As a potential buyer
  	I want to be able to buy anything that I feel like

# end::header[]
# tag::woolscenario[]
  	Scenario: Should list items and buy anything
    	Given I want to navigate the web
    	When I search for items containing 'wool'
    	And Select an item from the result list
    	And I add these item to cart
    	Then I should only see item related into cart shop
 # end::woolscenario[]
  