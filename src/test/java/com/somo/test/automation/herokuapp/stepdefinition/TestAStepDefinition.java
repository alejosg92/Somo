package com.somo.test.automation.herokuapp.stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.somo.test.automation.herokuapp.pages.LoginPage.ERRORMESSAGE;
import static com.somo.test.automation.herokuapp.tasks.LoginTask.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.hasValue;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class TestAStepDefinition {


    @When("User logs in with user: {string} and Pass: {string}")
    public void userLogsInWithUserAndPass(String user, String pass) {
        theActorInTheSpotlight().attemptsTo(withUser(user).andPass(pass));
    }


    @Then("User able to see error message: {string}")
    public void userAbleToSeeErrorMessage(String message) {
        theActorInTheSpotlight().should(seeThat(the(ERRORMESSAGE), containsText(message)));
    }

    @Then("User able to see pass message: {string}")
    public void userAbleToSeePassMessage(String message) {
        theActorInTheSpotlight().should(seeThat(the(ERRORMESSAGE), containsText(message)));
    }
}
