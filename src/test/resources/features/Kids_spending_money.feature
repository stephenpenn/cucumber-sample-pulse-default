
Feature: Kids spending money
  Kids should be able to spend money from their ledger if they have some

  Scenario: Kid landing page is ledger screen
    Given I am a kid who has an account
    When kid logs in
    Then I should be redirected to the ledgar screen

  Scenario: Kid should see spend money button 
    Given I am a logged in kid with an account balance greater than 0
    When kid logs in
    Then I should have a Spend Money Button
    
  Scenario: This is the name of the new scenario or test case
    Given I am doing a demo and writing a new test case
    When I hit save
    Then qtest manager will have a failed test after jenkins builds
    
