package com.T43.stepDefinitions;

import com.T43.pages.SeleniumEasyPages;
import com.T43.utilities.BrowserUtil;
import com.T43.utilities.ConfigurationReader;
import com.T43.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumEasyStepDefinition extends SeleniumEasyPages {


    @Given("user is on home page")
    public void user_is_on_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("user clicks on Maven")
    public void user_clicks_on() {
        BrowserUtil.sleep(2);
        maven.click();
    }
    @Then("title is {string}")
    public void title_is(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

}
