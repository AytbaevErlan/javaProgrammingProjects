package Lecture8.task2;


public class Circle implements Shape {
    private final double radius;


    public Circle(double r) {
        radius = r;
    }

    @Override
    public double resultOfArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public double resultOfPerimeter() {
        return 2 * Math.PI * radius;
    }
}
