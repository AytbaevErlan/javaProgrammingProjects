package Lecture8;

public class Main {
    public static void main(String[] args) {
        JobTitle accountant = new Accountant();
        JobTitle director = new Director();
        JobTitle employee = new Employee();
        accountant.getJobTitle();
        director.getJobTitle();
        employee.getJobTitle();
    }
}
