#Author: Jose Santiago Molano Perdomo, jsmolano@bancolombia.com.co, jmolanop@choucairtesting.com
@Regresion
Feature: Reto3Screenplay

  @succesFullCaseDoctor
  Scenario: perform a register of a new Doctor
    Given that Carlos needs to register a new Doctor
    When he performs the registration of itself on the application
      | firstName | lastName | telephone  | identificationType   | idDocument |
      | santiago  | molano   | 3158985879 | Cédula de ciudadanía | 7017233845   |
    Then he verifies "Datos guardados correctamente" is displayed on the screen

  @sucessFullCasePacient
  Scenario: performs a register of a new Pacient
    Given Given that Carlos needs to register a new Pacient
    When he performs the registration of itself on the application
      | firstName | lastName | telephone  | identificationType | idDocument |
      | santiago  | molano   | 3158985879 | Pasaportes         | 7017233846   |
    Then he verifies "Datos guardados correctamente" is displayed on the screen

  @sucessFullCaseNewAppointmentDate
  Scenario: performs a register of a new schedule appointment date
    Given given that Carlos needs to see the Doctor to perform Cita
    When he performs the scheduling of an Appointment
      | dateOfTheAppointment | idDocumentPatient | idDocumentDoctor | observations   |
      | 22/09/2018           | 7017233846          | 7017233845         | ElMolaAutomata |
    Then he verifies "Datos guardados correctamente" is displayed on the screen




