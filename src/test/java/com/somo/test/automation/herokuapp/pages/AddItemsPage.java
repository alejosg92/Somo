package com.somo.test.automation.herokuapp.pages;

import net.serenitybdd.screenplay.targets.Target;

public class AddItemsPage {

    public static Target ADDELEMENT = Target.the("Add Elements").locatedBy("//BUTTON[text()='Add Element']");

    public static Target DELETEELEMENT = Target.the("Delete Element").locatedBy("//BUTTON[text()='Delete']");

}
