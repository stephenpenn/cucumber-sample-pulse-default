@scenariooutline
Feature: ScenarioOutline
  This is an example of a Scenario Outline
@smoke
  Scenario: Feeding a cow
    Given the cow weighs 200 kg
    When we calculate the feeding requirements
    Then the energy should be 20 MJ
    And the protein should be 30 kg
  
 
     
