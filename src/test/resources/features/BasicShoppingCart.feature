
Feature: BasicShoppingCart
  A basic shopping cart experience so that users can shop for items
  
  Background:
      Given a global administrator named "Greg"
      And a customer named "Wilson"

  Scenario: User add itms to cart
    Given that I'm a logged in parent
    When I go the Item page
    And I click "Add item to cart"
    Then the quanitity of items in my cart should go up
    And my subtotal should increment
    And the warehouse inventory should decrement
    But I should be logged out if I'm inactive over 5 minuutes
    
    
      
