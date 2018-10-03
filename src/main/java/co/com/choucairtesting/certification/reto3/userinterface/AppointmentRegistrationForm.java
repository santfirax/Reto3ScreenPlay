package co.com.choucairtesting.certification.reto3.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class AppointmentRegistrationForm  {
    public static final Target APPOINTMENT_DATE_FIELD = Target.the("appointment date field").located(By.id("datepicker"));
    public static final Target ID_DOCUMENT_PATIENT_FIELD = Target.the("id document patient field").locatedBy("//*[@class='col-md-4']/div[2]/input");
    public static final Target ID_DOCUMENT_DOCTOR_FIELD = Target.the("id document doctor field").locatedBy("//*[@class='col-md-4']/div[3]/input");
    public static final Target OBSERVATIONS_FIELD = Target.the("id document doctor field").locatedBy("//*[@class='col-md-4']/div[4]/textarea");
    private AppointmentRegistrationForm(){}

}
