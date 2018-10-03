package co.com.choucairtesting.certification.reto3.stepdefinitions;

import co.com.choucairtesting.certification.reto3.model.AppointmentData;
import co.com.choucairtesting.certification.reto3.model.RegistrationData;
import co.com.choucairtesting.certification.reto3.questions.ThePerson;
import co.com.choucairtesting.certification.reto3.tasks.Create;
import co.com.choucairtesting.certification.reto3.tasks.ScheduleAn;
import co.com.choucairtesting.certification.reto3.tasks.Start;
import co.com.choucairtesting.certification.reto3.util.Reto3Actor;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
public class Reto3ScreenPlayStepDefinitions extends Reto3Actor {


    @Given("^that Carlos needs to register a new (.*)$")
    public void thatCarlosNeedsToRegisterANewDoctor(String role) {
        getCarlos().wasAbleTo(Start.herokuApp(role));

    }

    @When("^he performs the registration of itself on the application$")
    public void hePerformsTheRegistrationOfItselfOnTheApplication(List<RegistrationData> registrationData) {
        getCarlos().attemptsTo(Create.newPerson(registrationData));
    }



    @Then("^he verifies \"([^\"]*)\" is displayed on the screen$")
    public void heVerifiesIsDisplayedOnTheScreen(String message) {
       getCarlos().should(seeThat(ThePerson.wasAdd(message)));
    }

    @Given("^Given that Carlos needs to register a new (.*)$")
    public void givenThatCarlosNeedsToRegisterANewPacient(String role) {
        getCarlos().wasAbleTo(Start.herokuApp(role));

    }

    @Given("^given that Carlos needs to see the Doctor to perform (.*)$")
    public void givenThatCarlosNeedsToSeeTheDoctor(String role)  {
      getCarlos().wasAbleTo(Start.herokuApp(role));
    }

    @When("^he performs the scheduling of an Appointment$")
    public void hePerformsTheSchedulingOfAnAppointment(List<AppointmentData> appointmentData) {
        getCarlos().attemptsTo(ScheduleAn.appointment(appointmentData));
    }
}
