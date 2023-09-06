package Lecture10.task5_l10;

import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide a word: ");
        String str = scanner.nextLine();

        String duplicate = duplicateLetters(str);
        System.out.println(duplicate);
    }

    public static String duplicateLetters(String str){
        StringBuilder duplicated = new StringBuilder();
        for (int i = 0; i < str.length(); i++){
            char add = str.charAt(i);
            duplicated.append(add).append(add);
        }
        return duplicated.toString();
    }
}
