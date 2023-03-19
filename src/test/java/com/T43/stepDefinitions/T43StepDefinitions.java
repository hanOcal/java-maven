package com.T43.stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;

public class T43StepDefinitions {

    @Then("verify it is {string}")
    public void verify_it_is(String expectedResult) {
        Assert.assertEquals(expectedResult, "github-actions");
    }

}
