package Lecture13;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//пользователь вводит набор чисел в виде одной строки с клавиатуры. Например: "1, 2, 3,
//4, 4, 5". Избавиться от повторяющихся элементов в строке. Вывести результат на экран.
//При решении использовать коллекции
public class Duplicate {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Please, provide numbers and add coma  , and space: ");
        String input = scanner.nextLine();

        String[] numbers = input.split(", " );
        Set<String> uniqNumber = new HashSet<>();

        for (String number : numbers){
            uniqNumber.add(number);
        }

        System.out.println("Unique numbers are: " + uniqNumber);
        scanner.close();
    }
}
