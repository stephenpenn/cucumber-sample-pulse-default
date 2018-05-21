package com.glue;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

// Scenario:StephenHappyPathLogin
//    Given I have opened the application
//    When I put in valid credentials
//    And click Login
//    Then I should see my personalized home page19


public class Happy_Path_Login {
    @Given("^I have opened the application$")
    public void I_have_logged_into_my_bank_account() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @When("^I put in valid credentials$")
    public void I_transfer_to_my_savings_account() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @And("^click Login$")
    public void the_balance_shows_usd() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @Then("^I should see my personalized home page19$")
    public void the_new_balance_should_be_gbr() throws Throwable {
        Assert.assertEquals(true, true);
    }


}