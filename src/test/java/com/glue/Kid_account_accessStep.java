package com.glue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import org.junit.Assert;
//Given I'm a logged-in User
//    When I go the Item page
//    And I click "Add item to cart"
//    Then the quanitity of items in my cart should go up
//    And my subtotal should increment
//    And the warehouse inventory should decrement
//    But I should be logged out if I'm inactive over 5 minuutes
public class Kid_account_accessStep {

    @Given("^i am a kid with an account$")
    public void that_i_am_a_logged_in_parent() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @When("^i log in after my parent has made an account$")
    public void i_view_the_kid_list_page() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @And("^my subtotal should increment$")
    public void mysubtotalshouldincrement () throws Throwable {
        Assert.assertEquals(true, true);
    }

    @Then("^i should see my account balance$")
    public void i_should_see_a_link_to_add_kids() throws Throwable {
        Assert.assertEquals(true, true);
    }
}
