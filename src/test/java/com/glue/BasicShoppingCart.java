package com.glue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

//
//  Scenario: kid should log in
//          Given i am a kid with an account
//          When i log in after my parent has made an account
//          Then i should see my account balance
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