
Feature: Kid logging out
  Feature description of kid logging out goes here. This doesn't anything other than helps the code documentation.

  Scenario: Kid can log out
    Given when I am logged in as a kid
    When I click log out
    Then I should be forced to the login screen
 