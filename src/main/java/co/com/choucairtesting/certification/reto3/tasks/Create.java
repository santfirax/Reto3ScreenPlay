package co.com.choucairtesting.certification.reto3.tasks;

import co.com.choucairtesting.certification.reto3.model.RegistrationData;
import co.com.choucairtesting.certification.reto3.userinterface.RegistrationForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

public class Create  implements Task {
    private Target target = RegistrationForm.PREPAID_HEALTH_CHECKBOX;
    private List<RegistrationData> registrationData;

    public Create(List<RegistrationData> registrationData) {
        this.registrationData = registrationData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(registrationData.get(0).getFirstName()).into(RegistrationForm.FIRST_NAME_FIELD));
        actor.attemptsTo(Enter.theValue(registrationData.get(0).getLastName()).into(RegistrationForm.LAST_NAME_FIELD));
        actor.attemptsTo(Enter.theValue(registrationData.get(0).getTelephone()).into(RegistrationForm.PHONE_FIELD));
        actor.attemptsTo(Click.on(RegistrationForm.IDENTIFICATION_TYPE));
        actor.attemptsTo(SelectFromOptions.byValue(registrationData.get(0).getIdentificationType()).from(RegistrationForm.IDENTIFICATION_TYPE));
        actor.attemptsTo(Enter.theValue(registrationData.get(0).getIdDocument()).into(RegistrationForm.ID_DOCUMENT_FIELD));
        if(target.resolveFor(actor).isVisible()){
            actor.attemptsTo(Click.on(RegistrationForm.PREPAID_HEALTH_CHECKBOX));
            actor.attemptsTo(Click.on(RegistrationForm.SUBMIT_BUTTON));
        }else {
            actor.attemptsTo(Click.on(RegistrationForm.SUBMIT_BUTTON));
        }
    }

    public static Create newPerson(List<RegistrationData> registrationData) {
        return Tasks.instrumented(Create.class, registrationData);
    }
}
