
Feature: BasicShoppingCart
  A basic shopping cart experience so that users can shop for items

  Scenario: User add itms to cart
    Given that I am a logged in parent
    When I go the Item page
    And I click "Add item to cart"
    Then the quanitity of items in my cart should go up
    And my subtotal should increment
    And the warehouse inventory should decrement
    But I should be logged out if I'm inactive over 8 minuutes - update
    
    Scenario: Send a message on Twitter
      Given I'm logged into twitter
      When go to the editor
      And I type in my message
      And I push send
      Then my message is sent to my timeline
    
      
