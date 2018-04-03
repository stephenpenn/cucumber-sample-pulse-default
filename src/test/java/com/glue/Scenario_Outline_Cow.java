package com.glue;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

//@scenariooutline
//Feature: ScenarioOutline
//  This is an example of a Scenario Outline
//
//  Scenario: Feeding a cow
//    Given the cow weighs 200 kg
//    When we calculate the feeding requirements
//    Then the energy should be 20 MJ
//    And the protein should be 30 kg

public class Scenario_Outline_Cow {

    @Given("^the cow weighs 200 kg$")
    public void given_the_cow_weights_200kg() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @When("^we calculate the feeding requirements$")
    public void we_calculate_the_feeding_requirements() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @Then("^the energy should be 20 MJ$")
    public void the_energy_should_be_20_MJ () throws Throwable {
        Assert.assertEquals(true, true);
    }

    @And("^the protein should be 30 kg$")
    public void the_protein_should_be_30_kg () throws Throwable {
        Assert.assertEquals(true, true);
    }


}
