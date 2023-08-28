package Lecture8.extraTask1;
//We do work classes with the university. The university has a range of students, staff and dormitories.
// Students (field name, surname, group number, place of residence), staff (fields name, last name,
// position - deputy, dean, rector, etc.), dormitory (address, name, set of rooms). Make a 6 item
// menu: 1) Adding a student to the universe 2) Adding an employee to a universe 3) Settle a student into a dorm
// 4) View all students 5) View all staff 6) Exit.
public class Student extends Person{
    private final String group;
    private final String address;

    public Student(String firstName, String lastName, String group, String address)
    {
        super(firstName, lastName);
        this.group = group;
        this.address = address;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "group='" + group + '\'' +
                ", address='" + address + '\'' +
                '}';
    }


}
