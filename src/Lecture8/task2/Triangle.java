package Lecture8.task2;
//Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг. Реализовать
//функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя
//абстрактный класс/методы). Создать массив из 5 разных фигур. Вывести на экран сумму
//периметра всех фигур в массиве
public class Triangle implements Shape {

    private final double A;
    private final double B;
    private final double C;

    public Triangle(double a, double b, double c) {
        A = a;
        B = b;
        C = c;
    }

    @Override
    public double resultOfArea() {
        double s = resultOfPerimeter() / 2;
        return Math.sqrt(s * (s - A) * (s - B) * (s - C));
    }

    public double resultOfPerimeter() {
        return A + B + C;
    }
}
