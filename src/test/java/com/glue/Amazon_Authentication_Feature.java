package com.glue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

//  Scenario: AmazonLoginToOrder
//    Given I have login to Amazon
//    When I put in my credentials
//    And click Login
//    And go to the search field
//    Then I should be able to find my item to order

public class Amazon_Authentication_Feature {

    @Given("^I have login to Amazon$")
    public void i_have_login_to_amazon () throws Throwable {
        Assert.assertEquals(true, true);
    }

    @When("^I put in my credentials$")
    public void I_put_in_my_credentials () throws Throwable {
        Assert.assertEquals(true, true);
    }

    @Then("^I should be able to find my item to order$")
    public void i_should_be_able_to_find_my_item_to_order () throws Throwable {
        Assert.assertEquals(true, true);
    }
}
