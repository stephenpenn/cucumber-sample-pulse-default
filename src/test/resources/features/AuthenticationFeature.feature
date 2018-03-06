
Feature:AuthenticationFeature
  This is the description of the auth feature

  Scenario:StephenHappyPathLogin
    Given i am a kid with an account
    When I put in valid credentials
    And click Login
    Then I should see my personalized home page11
    
    
