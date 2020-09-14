
Feature: Customer profile validation
  
  @tag1
  Scenario: Validate that new customer can be created
    Given I have access to webpage
    And I pass "username" and "password" 
    When click on sign in, I will be on a home page
    Given I am on a home page I click on new customer
    When I add customer details, and click on submit
    Then new customer will be created, and customer Id will be provided
    
    
    Scenario: Validate that new customer can be Edited
    Given I have CustomerId 
    When I click on Edit Customer, I will be directed to Edit Customer page
    And I pass "CustomerID" and click on submit
 		Then I can Edit Customer details
    
    Scenario: Validate that new customer can be Deleted
    Given I have CustomerId 
   When I click on Delete Customer, I will be directed to Delete Cutomer page
    And I pass "CustomerID" and click on submit
 		Then I can Delete Customer 
  
