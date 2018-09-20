
Feature: Bank Account Transfer
 As a user I should be able to transfer money if the money is available in my account.

  Scenario: Balance Transfer Scenario
    Given I have logged into my bank account
    And the balance shows 100,000 USD1
    When I transfer 20,000 USD to my savings account1
    Then the new balance should be 80,000 GBR1

    
