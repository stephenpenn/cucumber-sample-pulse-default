
Feature:AuthenticationFeature
  This is the description of the auth feature
@regression 
  Scenario:StephenHappyPathLogin
    Given I have opened the application
    When I put in valid credentials
    And click Login
    Then I should see my personalized home 
    And go to the search field - 7:31