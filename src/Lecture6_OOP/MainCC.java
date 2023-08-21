package Lecture6_OOP;

//Задача 1:
//Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте
//метод, который позволяет начислять сумму на кредитную карточку. Добавьте метод,
//который позволяет снимать с карточки некоторую сумму. Добавьте метод, который
//выводит текущую информацию о карточке. Напишите программу, которая создает три
//объекта класса CreditCard у которых заданы номер счета и начальная сумма.
//Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с
//третьей. Выведите на экран текущее состояние всех трех карточек

//create a class Credit card with fields for account number and current balance. Add method
// that allows to deposit money on a credit card. Add a method which allows to withdraw from
// credit card a certain amount of money. Add a method that displays current information
// about credit card. Write a program that creates three objects class of CreditCard
// which have assigned account number, and initial balance.
// Test scenario to check: Deposit money to first and second cards and withdraw from
// third card. Display current information of all three card on screen
public class MainCC {
    public static void main(String[] args)
    {
        CreditCard creditCard1 = new CreditCard("William", "1111 1111 1111 1111", 250);
        CreditCard creditCard2 = new CreditCard("Smith","2222 2222 2222 2222",500);
        CreditCard creditCard3 = new CreditCard("Ashley","3333 3333 3333 3333", 800);


        creditCard1.deposit();
        System.out.println(creditCard1);

        creditCard2.deposit();
        System.out.println(creditCard2);

        creditCard3.withdraw();
        System.out.println(creditCard3);

        System.out.println();

        System.out.println("Information about Credit card 1: ");
        creditCard1.currentInfo();

        System.out.println();

        System.out.println("Information about Credit card 2: ");
        creditCard2.currentInfo();

        System.out.println();

        System.out.println("Information about Credit card 3: ");
        creditCard3.currentInfo();
    }
}
