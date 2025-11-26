package hospital;

import java.time.LocalDate;

import java.time.LocalDate;

public class Appointment {
    
	private Patient patient;
    private Docter docter;
    private LocalDate date;

    public Appointment(Patient patient, Docter docter, LocalDate date) throws InvalidAppointmentException {
        if (date.isBefore(LocalDate.now())) {
            throw new InvalidAppointmentException("Cannot book appointment in the past.");
        }
        this.patient = patient;
        this.docter = docter;
        this.date = date;
    }

    public void displaySummary() {
        System.out.println("\n--- Appointment Summary ---");
        
        patient.getDetails();
        docter.getDetails();
        System.out.println("Date: " + date);
        System.out.println("Estimated Bill: ₹" + patient.generateBill());
    }

    public Patient getPatient() {
        return patient;
    }

    public Docter getDoctor() {
        return docter;
    }

    public LocalDate getDate() {
        return date;
    }
}