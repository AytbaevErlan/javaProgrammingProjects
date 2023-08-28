package Lecture8.extraTask1;

import java.util.ArrayList;
import java.util.Scanner;

//We do work classes with the university. The university has a range of students, staff and dormitories.
// Students (field name, surname, group number, place of residence), staff (fields name, last name,
// position - deputy, dean, rector, etc.), dormitory (address, name, set of rooms). Make a 6 item
// menu: 1) Adding a student to the universe 2) Adding an employee to a universe 3) Settle a student into a dorm
// 4) View all students 5) View all staff 6) Exit.
public class University {
    public ArrayList<Student> students = new ArrayList<>();
    public ArrayList<Employee> employees = new ArrayList<>();
//    public ArrayList<Dorm> dorms = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

//    public void addDorm(Dorm dorm) {
//        dorms.add(dorm);
//    }

    public void displayStudents() {
        for (Student student : students) {
            System.out.println(student);
            System.out.println(student.getFullName());
        }
    }
    // public void displayStudents() {
    //        for (int i = 0; i < students.size(); i++) {
    //            Student student = students.get(i);
    //            System.out.println(student);
    //            System.out.println(student.getFullName());
    //        }
    //    }

    public void displayEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee);
            System.out.println(employee.getFullName());
        }
    }
    //public void displayEmployee() {
    //        for (int i = 0; i < employees.size(); i++) {
    //            Employee employee = employees.get(i);
    //            System.out.println(employee);
    //            System.out.println(employee.getFullName());
    //        }
    //    }


    public static void main(String[] args) {
        University university = new University();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu");
            System.out.println("1 - adding a student to the University.");
            System.out.println("2 - adding an employee to the University.");
            System.out.println("3 - Assign a room for student.");
            System.out.println("4 -Look up for all students");
            System.out.println("5 - Look up for all employees");
            System.out.println("6 - Exit");

            int check = scanner.nextInt();

            switch (check) {
                case 1 -> {
                    System.out.println("Please provide student's full Name: ");
                    String studentFirstName = scanner.nextLine();
                    System.out.println("Provide last name of Student: ");
                    String studentLastName = scanner.nextLine();
                    System.out.println("Provide group number: ");
                    String studentGroupNumber = scanner.nextLine();
                    System.out.println("Provide student's address: ");
                    String studentAddress = scanner.nextLine();
                    Student student = new Student(studentFirstName, studentLastName, studentGroupNumber, studentAddress);
                    university.addStudent(student);
                }
                case 2 -> {
                    System.out.println("Please provide employee's Name: ");
                    String employeeFirstName = scanner.nextLine();
                    System.out.println("Provide last name of Employee: ");
                    String employeeLastName = scanner.nextLine();
                    System.out.println("Provide position of employee: ");
                    String employeePosition = scanner.nextLine();
                    Employee employee = new Employee(employeeFirstName, employeeLastName, employeePosition);
                    university.addEmployee(employee);
                }
                case 3 -> {// not finished
                    System.out.println("Choose a student to settle:");
                    university.displayStudents();
                    System.out.println("Choose a room to settle: ");
                }
                case 4 -> {
                    System.out.println("List of all students: ");
                    university.displayStudents();
                }
                case 5 -> {
                    System.out.println("List of all employees:");
                    university.displayEmployee();
                }
                case 6 -> {
                    System.out.println("Exit.");
                    System.exit(0);

//          default:
                    System.out.println("Please provide valid information.");
                }
            }
        }
    }

}
