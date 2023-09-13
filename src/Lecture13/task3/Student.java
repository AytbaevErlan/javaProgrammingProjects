package Lecture13.task3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*Создать класс Student, содержащий следующие характеристики – имя, группа, курс,
оценки по предметам. Создать коллекцию, содержащую объекты класса Student.
Написать метод, который удаляет студентов со средним баллом <3. Если средний
балл>=3, студент переводится на следующий курс. Дополнительно написать метод
printStudents(List<Student> students, int course), который получает список студентов и
номер курса. А также печатает на консоль имена тех студентов из списка, которые
обучаются на данном курсе*/
public class Student {
    private String name;
    private String group;
    private int course;
    private ArrayList<Double> grades;

    public Student(String name, String group, int course, ArrayList<Double> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public double averageGrades() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        double sum = 0.0;
        for (int i = 0; i < grades.size(); i++) {
            Double grade = grades.get(i);
            sum += grade;
        }
        return sum / grades.size(); //avg
    }

    public void NextCourse() {
        if (averageGrades() >= 3.0) {
            course++;
        }
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public static class PrintAndRemove {
        public static void removeStudentsWithLowGrades(ArrayList<Student> students) {
            Iterator<Student> iterator = students.iterator();
            while (iterator.hasNext()) {
                Student student = iterator.next();
                if (student.averageGrades() < 3.0) {
                    iterator.remove();
                }
            }
        }


        public static void printStudents(ArrayList<Student> students, int course) {
            for (Student student : students) {
                if (student.getCourse() == course) {
                    System.out.println(student.getName());
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Alex", "Group1", 1, new ArrayList<>(List.of(1.5, 2.5, 3.0))));
        students.add(new Student("Omar","Group2", 2, new ArrayList<>(List.of(2.0, 4.5, 2.0))));
        students.add(new Student("Romeo", "group3", 2, new ArrayList<>(List.of(2.5, 3.0, 3.5))));
        students.add(new Student("Olivia", "group2", 3, new ArrayList<>(List.of(5.0, 4.5, 5.0))));


        PrintAndRemove.removeStudentsWithLowGrades(students);

        System.out.println("List of students after removing ones who was not studying well: ");
        for (Student student : students){
            System.out.println(student.getName() + " Course: " + student.getCourse() + ".");
        }

        System.out.println("Current course students: ");
        PrintAndRemove.printStudents(students, 2);
    }

}
