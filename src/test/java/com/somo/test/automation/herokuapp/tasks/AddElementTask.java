package com.somo.test.automation.herokuapp.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.somo.test.automation.herokuapp.pages.AddItemsPage.ADDELEMENT;

public class AddElementTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ADDELEMENT));

    }

    public static AddElementTask addElementTask(){
        return Tasks.instrumented(AddElementTask.class);
    }

}
