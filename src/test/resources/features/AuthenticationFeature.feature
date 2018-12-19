
Feature:AuthenticationFeature
  This is the description of the auth feature
@regression 
  Scenario:StephenHappyPathLogin
    Given I have opened the application
    When I put in valid credentials
    And click Login
    Then I should see my personalized home - test -  modified
    
  Scenario: Hello World - Elise
     Given I have opened the application
      When I look at it
      Then I say hello!
    
    
    
