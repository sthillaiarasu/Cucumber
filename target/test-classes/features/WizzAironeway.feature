
Feature: Wizz air oneway trip search

Background: 
					Given goto wizz air home page

  Scenario: One way search
    
    When Select the source and destnation
    And select the date
    And select the no of passenger
    Then click the search 
    And verify the list of plane details

 