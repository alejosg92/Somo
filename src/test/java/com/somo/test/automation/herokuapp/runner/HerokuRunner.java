package com.somo.test.automation.herokuapp.runner;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.*;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features",
                snippets = CAMELCASE,
                glue = "com.somo.test.automation.herokuapp.stepdefinition")
public class HerokuRunner {
}
