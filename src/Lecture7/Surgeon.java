package Lecture7;

public class Surgeon extends Doctor {
    @Override
    public void treat() {
        super.treat();
        System.out.println("Patient assigned to Surgeon.");
        System.out.println("Treatment method of surgeon - surgery!");
        System.out.println();
    }

    @Override
    public String toString() {
        return "Surgeon{}";
    }
}
