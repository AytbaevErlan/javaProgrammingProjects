package Lecture10.task1_l10;

import java.util.Scanner;

import static Lecture10.task1_l10.LengthOfString.longestLengthOfString;
import static Lecture10.task1_l10.LengthOfString.shortestLenghtofString;
//input 3 string from consol, find the shortest and the longest strings. Output found string and their lenght
public class  Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide first string: ");
        String string1 = scanner.nextLine();
        System.out.println("Please provide second string: ");
        String string2 = scanner.nextLine();
        System.out.println("Please provide third string: ");
        String string3 = scanner.nextLine();

        String shortestString = shortestLenghtofString(string1, string2, string3);
        String longestString = longestLengthOfString(string1, string2, string3);

        System.out.println("the shortest string is " + shortestString);
        System.out.println("the length of shortest string is " + shortestString.length());
        System.out.println();
        System.out.println("the longest string is " + longestString);
        System.out.println("the length of longest string is " + longestString.length());

    }
}

