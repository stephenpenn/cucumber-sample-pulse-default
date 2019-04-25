
Feature:AuthenticationFeature
  This is the description of the auth feature
@regression 
  Scenario:StephenHappyPathLogin
    Given I have opened the application
    When I put in valid credentials
    And click Login
    Then I should see my personalized home 
    Then I should see my personalized home page19
    And I put in my credentials
    Then I should be able to find my item to order
    And go to the search field - update