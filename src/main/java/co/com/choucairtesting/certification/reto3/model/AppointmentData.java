package co.com.choucairtesting.certification.reto3.model;

public class AppointmentData {
    private String dateOfTheAppointment;

    public String getDateOfTheAppointment() {
        return dateOfTheAppointment;
    }

    public String getIdDocumentPatient() {
        return idDocumentPatient;
    }

    public String getIdDocumentDoctor() {
        return idDocumentDoctor;
    }

    public String getObservations() {
        return observations;
    }

    private String idDocumentPatient;
    private String idDocumentDoctor;
    private String observations;
}
