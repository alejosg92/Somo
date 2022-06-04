package com.somo.test.automation.herokuapp.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.somo.test.automation.herokuapp.pages.AddItemsPage.DELETEELEMENT;
import static com.somo.test.automation.herokuapp.tasks.AddElementTask.addElementTask;
import static com.somo.test.automation.herokuapp.tasks.DeleteElementTask.deleteElementTask;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class TestBStepDefinition {
    @When("User add an element")
    public void userAddAnElement() {
        theActorInTheSpotlight().attemptsTo(addElementTask());
    }

    @Then("User able to see element added with delete button")
    public void userAbleToSeeElementAddedWithDeleteButton() {
        theActorInTheSpotlight().should(seeThat(the(DELETEELEMENT), isVisible()));
    }

    @And("User delete the element selected")
    public void userDeleteTheElementSelected() {
        theActorInTheSpotlight().attemptsTo(deleteElementTask());
    }

    @Then("User able to see the page with non element added")
    public void userAbleToSeeThePageWithNonElementAdded() {
        theActorInTheSpotlight().should(seeThat(the(DELETEELEMENT), isNotVisible()));
    }
}
