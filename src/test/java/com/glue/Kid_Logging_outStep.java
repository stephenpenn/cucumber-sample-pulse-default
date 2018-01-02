package com.glue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Kid_Logging_outStep {

    @Given("^when I am logged in as a kid$")
    public void when_iam_logged_inasakid() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @When("^I click log out$")
    public void iclicklogout() throws Throwable {
        Assert.assertEquals(true, false);
    }

    @Then("^I should be forced to the login screenx$")
    public void ishouldbeforcedtotheloginscreenasdf() throws Throwable {
        Assert.assertEquals(true, true);
    }
}
