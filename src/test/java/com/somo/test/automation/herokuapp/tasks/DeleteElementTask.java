package com.somo.test.automation.herokuapp.tasks;

import com.somo.test.automation.herokuapp.pages.AddItemsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.somo.test.automation.herokuapp.pages.AddItemsPage.DELETEELEMENT;

public class DeleteElementTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(DELETEELEMENT));
    }

    public static DeleteElementTask deleteElementTask(){
        return Tasks.instrumented(DeleteElementTask.class);
    }
}
