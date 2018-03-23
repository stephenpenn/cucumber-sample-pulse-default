
Feature: OrderHistoryFeature
  This is the description of the Order History Feature

  Scenario: OrderHistoryReorderTest
    Given I have gone to the order history screen
    When I enter an item into the search I previously ordered
    And I search for the item
    Then I should see the item in the list2
