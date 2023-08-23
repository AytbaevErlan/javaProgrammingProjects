package Lecture7;


public class Therapist extends Doctor {
    @Override
    public void treat() {
        super.treat();
        System.out.println("Patient assigned to Therapist.");
        System.out.println("Therapist method of treating - reduce symptoms of mental illness");
        System.out.println();
    }
    public void assignDoctor(Patient patient){
        if (patient.getTreatmentPlan() == 1){
            patient.setDoctor(new Surgeon());
        }
        else if (patient.getTreatmentPlan() == 2){
            patient.setDoctor(new Dentist());
        }
        else {
            patient.setDoctor(new Therapist());
        }
    }

    @Override
    public String toString() {
        return "Therapist{}";
    }
}
