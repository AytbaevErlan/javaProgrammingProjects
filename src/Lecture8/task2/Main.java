package Lecture8.task2;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Rectangle(10, 5),
                new Triangle(7, 3, 5),
                new Rectangle(10, 10),
                new Triangle(5, 5, 5)};

        double sumOfPerimeter = 0;
        double sumOfArea = 0;

        for (Shape shape : shapes) {
            sumOfArea += shape.resultOfArea();
        }
        System.out.println("Sum of area of all shapes : " + sumOfArea);

        for (Shape shape : shapes) {
            sumOfPerimeter += shape.resultOfPerimeter();
        }
        System.out.println("Sum of perimeters of all shapes : " + sumOfPerimeter);
    }

}
