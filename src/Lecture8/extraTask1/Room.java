package Lecture8.extraTask1;
public class Room {
        private int number;
        private final int room;

        public Room(int number, int room) {
            this.number = number;
            this.room = room;
        }

        @Override
        public String toString() {
            return "Комната №" + number + ", Вместимость: " + room;
        }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
