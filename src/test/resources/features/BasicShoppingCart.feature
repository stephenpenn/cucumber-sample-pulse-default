
Feature: BasicShoppingCart
  A basic shopping cart experience so that users can shop for items

  Scenario: User add itms to cart
    Given that I am a logged in parent
    When I go the Item page
    And I click "Add item to cart"
    Then the quanitity of items in my cart should go up
    And my subtotal should increment
    And the warehouse inventory should decrement
    But I should be logged out if I'm inactive over 7 minuutes
    
    
      
