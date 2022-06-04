package com.somo.test.automation.herokuapp.stepdefinition;

import com.somo.test.automation.herokuapp.drivers.ChromeDriver;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class LoadPageStepDefinition {

    @Before
    public void setUserName(){
        setTheStage(new Cast());
        theActorCalled("User");
    }

    @Given("User visits heroku login")
    public void userVisitsHerokuLogin() {
        theActorInTheSpotlight().can(BrowseTheWeb.with(ChromeDriver.chrome().withURL("http://the-internet.herokuapp.com/login")));
    }


    @Given("User visits heroku elements")
    public void userVisitsHerokuELements() {
        theActorInTheSpotlight().can(BrowseTheWeb.with(ChromeDriver.chrome().withURL("http://the-internet.herokuapp.com/add_remove_elements/")));
    }
}
