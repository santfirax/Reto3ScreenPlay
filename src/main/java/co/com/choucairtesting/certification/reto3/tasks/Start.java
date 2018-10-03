package co.com.choucairtesting.certification.reto3.tasks;

import co.com.choucairtesting.certification.reto3.userinterface.AutomationHerokuApp;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;


public class Start implements Task {
    private String role;

    public Start(String role) {
        this.role = role;
    }

    private AutomationHerokuApp automationHerokuApp = new AutomationHerokuApp();

    public static Start herokuApp(String role) {
        return Tasks.instrumented(Start.class, role);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(automationHerokuApp));
        actor.attemptsTo(Click.on(AutomationHerokuApp.ADD_BUTTON_OPTION.of(role)));
    }
}
