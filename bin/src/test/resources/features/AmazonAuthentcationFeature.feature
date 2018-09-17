
Feature: AmazonAuthentcationFeature
  This is the description of the description for the Amazon login and order feature

  Scenario: AmazonLoginToOrder
    Given I have login to Amazon
    When I put in my credentials
    And I click Login
    And go to the search field
    Then I should be able to find my item to order
