package co.com.choucairtesting.certification.reto3.questions;

import co.com.choucairtesting.certification.reto3.userinterface.RegistrationForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ThePerson implements Question<Boolean> {
    private String message;

    private ThePerson(String message) {
        this.message = message;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Text.of(RegistrationForm.DATA_STORED_LABEL).viewedBy(actor).asString().contains(message);
    }

    public static ThePerson wasAdd(String message) {
        return new ThePerson(message);
    }
}
