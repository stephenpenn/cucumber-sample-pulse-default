package com.glue;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

//  Scenario: OrderHistoryReorderTest
//    Given I have gone to the order history screen
//    When I enter an item into the search I previously ordered
//    And I search for the item
//    Then I should see the item in the list5


public class Order_History_Feature {
    @Given("^I have gone to the order history screen$")
    public void I_have_gone_to_the_order_history_screen() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @When("^I transfer 20,000 USD to my$")
    public void I_transfer_() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @And("^the balance shows $")
    public void the_balance_() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @Then("^the new balance should be $")
    public void the_new_balance_() throws Throwable {
        Assert.assertEquals(true, true);
    }


}