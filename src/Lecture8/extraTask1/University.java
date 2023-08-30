package Lecture8.extraTask1;


import java.util.ArrayList;
import java.util.Scanner;

//We do work classes with the university. The university has a range of students, staff and dormitories.
// Students (field name, surname, group number, place of residence), staff (fields name, last name,
// position - deputy, dean, rector, etc.), dormitory (address, name, set of rooms). Make a 6 item
// menu: 1) Adding a student to the universe 2) Adding an employee to a universe 3) Settle a student into a dorm
// 4) View all students 5) View all staff 6) Exit.
public class University {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Employee> employeeList = new ArrayList<>();
        ArrayList<Dorm> dormitories = new ArrayList<>();
        Dorm dorm1 = new Dorm("Dorm Address AAA", "Dorm 1");
        Dorm dorm2 = new Dorm("Dorm Address BBB", "Dorm 2");


        dorm1.addRoom("101");
        dorm1.addRoom("102");
        dorm2.addRoom("201");
        dorm2.addRoom("202");

        dormitories.add(dorm1);
        dormitories.add(dorm2);

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
                    students.add(new Student(studentFirstName, studentLastName, studentGroupNumber, studentAddress));
                    System.out.println("Student added!");
                    break;
                }
                case 2 -> {
                    System.out.println("Please provide employee's Name: ");
                    String employeeFirstName = scanner.nextLine();
                    System.out.println("Provide last name of Employee: ");
                    String employeeLastName = scanner.nextLine();
                    System.out.println("Provide position of employee: ");
                    String employeePosition = scanner.nextLine();
                    employeeList.add(new Employee(employeeFirstName, employeeLastName, employeePosition));
                    System.out.println("Employee added!");
                    break;
                }
                case 3 -> {
                    boolean studentSettled = false;

                    if (students.isEmpty()) {
                        System.out.println("No students to settle.");
                    } else if (dormitories.isEmpty()) {
                        System.out.println("No dormitories available.");
                    } else {
                        System.out.println("Select a student to settle:");
                        for (int i = 0; i < students.size(); i++) {
                            System.out.println((i + 1) + ") " + students.get(i).getFullName());
                        }
                        int studentIndex = scanner.nextInt() - 1;
                        scanner.nextLine();

                        System.out.println("Select a dormitory to settle the student:");
                        for (int i = 0; i < dormitories.size(); i++) {
                            System.out.println((i + 1) + ") " + dormitories.get(i));
                        }
                        int dormIndex = scanner.nextInt() - 1;
                        scanner.nextLine();

                        Dorm selectedDormitory = dormitories.get(dormIndex);
                        String roomNumber = selectedDormitory.getRooms();
                        int nextRoomNumber = selectedDormitory.getRooms().split(", ").length + 1;
                        students.get(studentIndex).residence = selectedDormitory.getAddress() + ", Room: " + nextRoomNumber;
                        selectedDormitory.addRoom(Integer.toString(nextRoomNumber)); // Convert it to a string before adding
                        System.out.println("Student settled into the dormitory successfully!");

                        studentSettled = true;
                    }

                    if (studentSettled) {
                        break;
                    }
                }


                case 4 -> {
                    if (students.isEmpty()) {
                        System.out.println("No students to display.");
                    } else {
                        System.out.println("List of Students:");
                        for (Student student : students) {
                            System.out.println(student.getFullName());
                            System.out.println(student);
                        }
                    }
                    break;
                }
                case 5 -> {
                    if (employeeList.isEmpty()) {
                        System.out.println("No staff to display.");
                    } else {
                        System.out.println("List of Staff:");
                        for (Employee employee : employeeList) {
                            System.out.println(employee.getFullName());
                            System.out.println(employee);
                        }
                    }
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
