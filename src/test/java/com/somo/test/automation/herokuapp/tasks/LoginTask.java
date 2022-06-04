package com.somo.test.automation.herokuapp.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.somo.test.automation.herokuapp.pages.LoginPage.*;

public class LoginTask implements Task {

    private String user;
    private String pass;


    public LoginTask(String user){
        this.user = user;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(user).into(USER));
        actor.attemptsTo(Enter.theValue(pass).into(PASS));
        actor.attemptsTo(Click.on(LOGIN));

    }

    public static LoginTask withUser(String user){
        return Tasks.instrumented(LoginTask.class,user);
    }

    public LoginTask andPass(String pass){
        this.pass = pass;
        return this;
    }
}
