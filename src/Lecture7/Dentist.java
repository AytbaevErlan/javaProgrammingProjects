package Lecture7;

public class Dentist extends Doctor {
    @Override
    public void treat() {
        super.treat();
        System.out.println("Patient assigned to Dentist.");
        System.out.println("Treatment method of Dentist - Checking the growth of teeth and jawbones!");
        System.out.println();
    }

    @Override
    public String toString() {
        return "Dentist{}";
    }
}
