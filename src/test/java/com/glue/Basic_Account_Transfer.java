package com.glue;


import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;

//Scenario: Balance Transfer Scenario
//    Given I have logged into my bank account
//    And the balance shows 100,000 USD
//    When I transfer 20,000 USD to my savings account
//    Then the new balance should be 80,000 GBR


public class Basic_Account_Transfer {
    @Given("^I have logged into my bank account$")
    public void I_have_logged_into_my_bank_account() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @When("^I transfer 20,000 USD to my savings account$")
    public void I_transfer_to_my_savings_account() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @And("^the balance shows 100,000 USD$")
    public void the_balance_shows_usd() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @Then("^the new balance should be 80,000 GBR$ - update")
    public void the_new_balance_should_be_gbr() throws Throwable {
        Assert.assertEquals(true, true);
    }


}