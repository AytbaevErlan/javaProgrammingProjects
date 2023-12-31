package Lecture8.task2;

//Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг. Реализовать
//функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя
//абстрактный класс/методы). Создать массив из 5 разных фигур. Вывести на экран сумму
//периметра всех фигур в массиве
public class Rectangle implements Shape {
    private final double width;
    private final double height;

    public Rectangle(double w, double h) {
        width = w;
        height = h;
    }


    @Override
    public double resultOfArea() {
        return width * height;
    }

    @Override
    public double resultOfPerimeter() {
        return 2 * (width + height);
    }
}
