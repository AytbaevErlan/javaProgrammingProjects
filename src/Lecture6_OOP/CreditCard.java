package Lecture6_OOP;

import java.util.Scanner;

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
public class CreditCard {
    String accountHolder;
    String accountNumber;
    int currentBalance;

    public CreditCard(String accountHolder, String accountNumber, int currentBalance)
    {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.currentBalance = currentBalance;
    }
    void deposit()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide the deposit amount to the card number " + accountNumber + " under name of " + accountHolder + ": ");
        int deposit = scanner.nextInt();

        if ( deposit > 0)
        {
            currentBalance += deposit;
            System.out.println("You deposited " + deposit + " to " + accountNumber + " and holder's name " + accountHolder + " and current account balance is: " + currentBalance);
        }
        else {
            System.out.println("Please provide number > 0");
        }
        System.out.println();
    }
       void withdraw()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide the withdrawal amount to " + accountNumber + " under name of " + accountHolder + ": ");
        int withdrawal = scanner.nextInt();
        if ( withdrawal > 0 && withdrawal <= currentBalance)
        {
            currentBalance -= withdrawal;
            System.out.println("You withdrawn " + withdrawal + " from " + accountNumber + " and Holder's name " + accountHolder + " and current account balance is: " + currentBalance);
        }
        else if (withdrawal < 0)
        {
            System.out.println("Please provide number > 0");
        }
        else {
            System.out.println("Not enough money on your Bank account!");
        }
        System.out.println();
    }
    void currentInfo()
    {
        System.out.println("The account holder's name is: " + accountHolder);
        System.out.println("Account number is: " + accountNumber);
        System.out.println("The account balance is: " + currentBalance);
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", currentBalance=" + currentBalance +
                '}';
    }
}
