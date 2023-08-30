package Lecture8.extraTask1;

import java.util.ArrayList;

//We do work classes with the university. The university has a range of students, staff and dormitories.
// Students (field name, surname, group number, place of residence), staff (fields name, last name,
// position - deputy, dean, rector, etc.), dormitory (address, name, set of rooms). Make a 6 item
// menu: 1) Adding a student to the universe 2) Adding an employee to a universe 3) Settle a student into a dorm
// 4) View all students 5) View all staff 6) Exit.
public class Dorm {
    private String address;
    private String name;
    private ArrayList<String> rooms;
    public Dorm(String address, String name) {
        this.address = address;
        this.name = name;
        rooms = new ArrayList<>();
    }


    public void addRoom(String room) {
        rooms.add(room);
    }

    public String getRooms() {
        return String.join(", ", rooms);
    }

    @Override
    public String toString() {
        return "Dormitory: " + name + ", Address: " + address + ", Rooms: " + getRooms();
    }

    public String getAddress() {
        return " ";
    }
}
