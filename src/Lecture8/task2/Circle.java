package Lecture8.task2;

import java.util.Scanner;

public class Circle extends Shape{
    @Override
    void resultOfArea() {
        Scanner scanner = new Scanner(System.in);
        float pi = 3.14f;
        System.out.println("Please provide height of Circle: ");
        float radius = scanner.nextInt();

        float area = pi * (radius * radius);
        System.out.println("Area of Circle when pi is " + pi + " and height is " + radius + " will be " + area);
    }
}
