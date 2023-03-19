package com.T43.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "json:target/cucumber.json",
                "xml:target/report.xml"
        },
        features = "src/test/resources/features",
        glue = "com/T43/stepDefinitions",
        dryRun = false,
        tags = "@github-actions"
)

public class CukesRunner {


}
