
Feature: Inventory Control
  Add a description

  Scenario: Coffee should reduce inventory county
    Given an inventory list of 10 coffees
    When I purchase a coffee
    And I receive it
    Then I expect the inventory cound to equal 9