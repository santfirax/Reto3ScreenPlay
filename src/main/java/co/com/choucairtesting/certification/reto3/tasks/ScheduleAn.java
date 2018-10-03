package co.com.choucairtesting.certification.reto3.tasks;

import co.com.choucairtesting.certification.reto3.model.AppointmentData;
import co.com.choucairtesting.certification.reto3.userinterface.AppointmentRegistrationForm;
import co.com.choucairtesting.certification.reto3.userinterface.RegistrationForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

public class ScheduleAn implements Task {
    private List<AppointmentData> appointmentData;

    public ScheduleAn(List<AppointmentData> appointmentData) {
        this.appointmentData = appointmentData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(appointmentData.get(0).getDateOfTheAppointment()).into(AppointmentRegistrationForm.APPOINTMENT_DATE_FIELD).thenHit(Keys.TAB));
        actor.attemptsTo(Enter.theValue(appointmentData.get(0).getIdDocumentPatient()).into(AppointmentRegistrationForm.ID_DOCUMENT_PATIENT_FIELD));
        actor.attemptsTo(Enter.theValue(appointmentData.get(0).getIdDocumentDoctor()).into(AppointmentRegistrationForm.ID_DOCUMENT_DOCTOR_FIELD));
        actor.attemptsTo(Enter.theValue(appointmentData.get(0).getObservations()).into(AppointmentRegistrationForm.OBSERVATIONS_FIELD));
        actor.attemptsTo(Click.on(RegistrationForm.SUBMIT_BUTTON));
    }

    public static ScheduleAn appointment(List<AppointmentData> appointmentData) {
        return Tasks.instrumented(ScheduleAn.class,appointmentData);
    }
}
