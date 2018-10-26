
Feature: Bank Account Transfer
 As a user I should be able to transfer money if the money is available in my account.

  Scenario: Balance Transfer Scenario
    Given I have logged into my bank account
    And the balance shows 100,000 USD
    When I transfer 20,000 USD to my savings account
    Then the new balance should be 80,000 GBR 
  
  Scenario: Second Balance Transfer Scenario
    Given I have a balance of $2,000 dollars
    When I request to withdraw $200 dollars
    Then I should have a remaining balance of $1,800

    