package Lecture7;


//create a program to simulate work process of clinic. Let there be 3 doctors: surgeon, therapist,
//dentist. Each of the doctors has method "treat", but each of them treats by their own method. And also, create class
//"Patient" with field "Treatment plan" and field "Doctor". Create an object class of "Patient" and add treatment plan.
//Create a method under Therapist's class which will assign a doctor for patient according to the treatment plan:
//If treatment plan has code 1 - assign surgeon and run treat method.
//if treatment plan has code 2 - assign dentist and run treat method.
//if treatment plan has any other codes - assign therapist and run treat method.
public class Doctor {
    public void treat(){
        System.out.println("Hello Patient!");
        System.out.println("We will check you and will assign proper treatment plan.");
    }

}
