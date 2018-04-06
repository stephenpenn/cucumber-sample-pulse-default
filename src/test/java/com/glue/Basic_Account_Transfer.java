package com.glue;

import cucumber.api.java.en.*;
import org.junit.Assert;
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

    @When("^I go the Item page$")
    public void igotheitempage() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @And("^the warehouse inventory should decrement$")
    public void thewarehouseinventoryshoulddecrement() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @Then("^the quanitity of items in my cart should go up$")
    public void thequantityofitmesinmycart() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @But("^I should be logged out if I'm inactive over 5 minuutes$")
    public void ishouldbeloggedoutifiminactive () throws Throwable {
        Assert.assertEquals(true, true);
    }
}