package Lecture7;
//Создать программу для имитации работы клиники. Пусть в клинике будет три врача:
//хирург, терапевт и дантист. Каждый врач имеет метод «лечить», но каждый врач лечит
//по-своему. Так же предусмотреть класс «Пациент» с полем «План лечения» и полем
//«Доктор». Создать объект класса «Пациент» и добавить пациенту план лечения. У
//терапевта создать метод, который будет назначать врача пациенту согласно плану
//лечения:
//Если план лечения имеет код 1 – назначить хирурга и выполнить метод лечить.
//Если план лечения имеет код 2 – назначить дантиста и выполнить метод лечить.
//Если план лечения имеет любой другой код – назначить терапевта и выполнить метод
//лечить.

//create a program to simulate work process of clinic. Let there be 3 doctors: surgeon, therapist,
//dentist. Each of the doctors has method "treat", but each of them treats by their own method. And also, create class
//"Patient" with field "Treatment plan" and field "Doctor". Create an object class of "Patient" and add treatment plan.
//Create a method under Therapist's class which will assign a doctor for patient according to the treatment plan:
//If treatment plan has code 1 - assign surgeon and run treat method.
//if treatment plan has code 2 - assign dentist and run treat method.
//if treatment plan has any other codes - assign therapist and run treat method.
public class Clinic {
    public static void main(String[] args) {
        Therapist therapist = new Therapist();
        Patient patient1 = new Patient(1);
        Patient patient2 = new Patient(2);
        Patient patient3 = new Patient(3);

        therapist.assignDoctor(patient1);
        patient1.treatmentMethod();

        therapist.assignDoctor(patient2);
        patient2.treatmentMethod();

        therapist.assignDoctor(patient3);
        patient3.treatmentMethod();
    }
}
