package com.adlads.luma1.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/feature",
        glue = {"com.adlads.luma1.stepDefinition","com.adlads.luma1.cucumber"},
        format = {"pretty","html:target/site/cucumber-pretty"},
        tags = {"@SignIn"}



)

public class TestRunner {

}
