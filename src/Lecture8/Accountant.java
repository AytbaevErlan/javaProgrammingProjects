package Lecture8;
//Создать классы "Директор", "Рабочий", "Бухгалтер". Реализовать интерфейс с методом,
//который печатает название должности и имплементировать этот метод в созданные
//классы
public class Accountant implements JobTitle {
    @Override
    public void getJobTitle() {
        System.out.println("Job title - Accountant.");
    }
}
