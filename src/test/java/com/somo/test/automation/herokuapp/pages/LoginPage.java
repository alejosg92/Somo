package com.somo.test.automation.herokuapp.pages;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static Target USER = Target.the("Input User").locatedBy("//INPUT[@id='username']");

    public static Target PASS = Target.the("Input Pass").locatedBy("//INPUT[@ id='password']");

    public static Target LOGIN = Target.the("Button Login").locatedBy("//BUTTON");

    public static Target ERRORMESSAGE = Target.the("Error: Your username is invalid!").locatedBy("//DIV[@id='flash']");
}
