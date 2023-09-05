package Lecture10.task3_l10;

import java.util.Scanner;

import static Lecture10.task3_l10.LenghtCal.CalculateLength;
//outprint strings which is less than average string lenght
public class LessThanAvarage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide the first string: ");
        String string1 = scanner.nextLine();
        System.out.println("Provide the second string: ");
        String string2 = scanner.nextLine();
        System.out.println("Provide the third string: ");
        String string3 = scanner.nextLine();

        String lessThanAvStr = CalculateLength(string1, string2, string3);
        System.out.println(lessThanAvStr);

    }
}
