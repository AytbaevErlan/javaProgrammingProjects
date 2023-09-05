package Lecture10.task4_l10;

import java.util.Scanner;

////Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов.
////Если таких слов несколько, найти первое из них.
//
////input 3 string from console. Find a word, which contains only different symbols.
////if there are more than 1, then find the first one
public class FindUniqCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();
        String thirdLine = scanner.nextLine();

        String[] lines = {firstLine, secondLine, thirdLine};

        for (String line : lines) {
            String[] words = line.split(" ");
            for (String word : words) {
                if (uniqueCharacters(word)) {
                    System.out.println("first word that contains only different symbols: " + word);
                    scanner.close();
                    return;
                }
            }
        }

        System.out.println("a word that contains different symbols not found");
        scanner.close();
    }

    private static boolean uniqueCharacters(String word) {
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}

