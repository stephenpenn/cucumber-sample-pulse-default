@scenariooutline
Feature: ScenarioOutline
  This is an example of a Scenario Outline

  Scenario: Feeding a cow
    Given the cow weighs <weight> kg
    When we calculate the feeding requirements
    Then the energy should be <energy> MJ
    And the protein should be <protein> kg
  
 
      | weight | energy | protein |
      | 450    | 26500  | 215     |
      | 500    | 29500  | 245     |
      | 575    | 31500  | 255     |
      | 600    | 37000  | 305     |
