package Lecture10.task2_l10;
import java.util.Scanner;
//sort string by the increasing lenght
public class SortString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("provide the first string: ");
        String string1 = scanner.nextLine();

        System.out.print("provide the second string: ");
        String string2 = scanner.nextLine();

        System.out.print("provide the third string: ");
        String string3 = scanner.nextLine();


        String[] sortedStrings = new String[3];

        if (string1.length() <= string2.length() && string1.length() <= string3.length()) {
            sortedStrings[0] = string1;
            if (string2.length() <= string3.length()) {
                sortedStrings[1] = string2;
                sortedStrings[2] = string3;
            } else {
                sortedStrings[1] = string3;
                sortedStrings[2] = string2;
            }
        } else if (string2.length() <= string1.length() && string2.length() <= string3.length()) {
            sortedStrings[0] = string2;
            if (string1.length() <= string3.length()) {
                sortedStrings[1] = string1;
                sortedStrings[2] = string3;
            } else {
                sortedStrings[1] = string3;
                sortedStrings[2] = string1;
            }
        } else {
            sortedStrings[0] = string3;
            if (string1.length() <= string2.length()) {
                sortedStrings[1] = string1;
                sortedStrings[2] = string2;
            } else {
                sortedStrings[1] = string2;
                sortedStrings[2] = string1;
            }
        }

        System.out.println("Sorted strings by length:");
        for (String str : sortedStrings) {
            System.out.println(str);
        }
    }
}
