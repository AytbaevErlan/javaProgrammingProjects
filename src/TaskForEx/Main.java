package TaskForEx;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Shelby", 240.0, 2000, 4);
        Motorcycle myMotorcycle = new Motorcycle("Yamaha", 300.0, 1998, "Cruiser");
        Airplane myAirplane = new Airplane("Boeing", 900.0, 2019, 35000.0);

        System.out.println("Car Information:");
        myCar.displayInformation();
        System.out.println();

        System.out.println("Motorcycle Information:");
        myMotorcycle.displayInformation();
        System.out.println();

        System.out.println("Airplane Information:");
        myAirplane.displayInformation();
    }
    // Vehicle
    public static class Vehicle {
        private String brand;
        private double maxVelocity;
        private int yearOfManufacture;

        public Vehicle(String brand, double maxVelocity, int yearOfManufacture) {
            this.brand = brand;
            this.maxVelocity = maxVelocity;
            this.yearOfManufacture = yearOfManufacture;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public double getMaxVelocity() {
            return maxVelocity;
        }

        public void setMaxVelocity(double maxVelocity) {
            this.maxVelocity = maxVelocity;
        }

        public int getYearOfManufacture() {
            return yearOfManufacture;
        }

        public void setYearOfManufacture(int yearOfManufacture) {
            this.yearOfManufacture = yearOfManufacture;
        }

        public void displayInformation() {
            System.out.println("Brand: " + brand);
            System.out.println("Max Velocity: " + maxVelocity + " km/h");
            System.out.println("Year of Manufacture: " + yearOfManufacture);
        }
    }
    //Airplane -------------------------------------
    public static class Airplane extends Vehicle {
        private double maxOperationalAltitude;

        public Airplane(String brand, double maxVelocity, int yearOfManufacture, double maxOperationalAltitude) {
            super(brand, maxVelocity, yearOfManufacture);
            this.maxOperationalAltitude = maxOperationalAltitude;
        }

        public double getMaxOperationalAltitude() {
            return maxOperationalAltitude;
        }

        public void setMaxOperationalAltitude(double maxOperationalAltitude) {
            this.maxOperationalAltitude = maxOperationalAltitude;
        }

        @Override
        public void displayInformation() {
            super.displayInformation();
            System.out.println("Max Operational Altitude: " + maxOperationalAltitude + " feet");
        }
    }
    // Car ------------------------------------
    public static class Car extends Vehicle {
        private int numberOfDoors;

        public Car(String brand, double maxVelocity, int yearOfManufacture, int numberOfDoors) {
            super(brand, maxVelocity, yearOfManufacture);
            this.numberOfDoors = numberOfDoors;
        }

        public int getNumberOfDoors() {
            return numberOfDoors;
        }

        public void setNumberOfDoors(int numberOfDoors) {
            this.numberOfDoors = numberOfDoors;
        }

        @Override
        public void displayInformation() {
            super.displayInformation();
            System.out.println("Number of Doors: " + numberOfDoors);
        }
    }
    //Motorcycle ----------------------------
    public static class Motorcycle extends Vehicle {
        private String type;

        public Motorcycle(String brand, double maxVelocity, int yearOfManufacture, String type) {
            super(brand, maxVelocity, yearOfManufacture);
            this.type = type;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        @Override
        public void displayInformation() {
            super.displayInformation();
            System.out.println("Type: " + type);
        }
    }
}

