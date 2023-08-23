package Lecture8.task2;

import java.util.Scanner;

//Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг. Реализовать
//функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя
//абстрактный класс/методы). Создать массив из 5 разных фигур. Вывести на экран сумму
//периметра всех фигур в массиве
public class Triangle extends Shape {
    @Override
    void resultOfArea() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide base of triangle: ");
        float base = scanner.nextInt();
        System.out.println("Please provide height of triangle: ");
        float height = scanner.nextInt();

        float area = (base * height) / 2;
        System.out.println("Area of triangle when base is " + base + " and height is " + height + " will be " + area);
    }


}
