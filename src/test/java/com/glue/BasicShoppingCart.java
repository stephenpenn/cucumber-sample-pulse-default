package com.glue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
//Given I'm a logged-in User
//    When I go the Item page
//    And I click "Add item to cart"
//    Then the quanitity of items in my cart should go up
//    And my subtotal should increment
//    And the warehouse inventory should decrement
//    But I should be logged out if I'm inactive over 5 minuutes




public class BasicShoppingCart {
    @Given("^Given I'm a logged-in User$")
    public void Imaloggedinuser() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @When("^I go the Item page$")
    public void igotheitempage() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @Then("^the quanitity of items in my cart should go up$")
    public void thequantityofitmesinmycart() throws Throwable {
        Assert.assertEquals(true, true);
    }
}