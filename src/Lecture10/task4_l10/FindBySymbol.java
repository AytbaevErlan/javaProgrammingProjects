package Lecture10.task4_l10;

import java.util.Arrays;
import java.util.Scanner;
//Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов.
//Если таких слов несколько, найти первое из них.

//input 3 string from console. Find a word, which contains only different symbols.
//if there are more than 1, then find the first one
public class FindBySymbol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide the first strings with symbols: ");
        String string1 = scanner.nextLine();
        System.out.println("Please provide the second strings with symbols: ");
        String string2 = scanner.nextLine();
        System.out.println("Please provide the third strings with symbols: ");
        String string3 = scanner.nextLine();

        String uniqueWord1 = findUniqueCharacterWord(string1);
        String uniqueWord2 = findUniqueCharacterWord(string2);
        String uniqueWord3 = findUniqueCharacterWord(string3);

        String allStr = string1 + " " + string2 + " " + string3;

        String[] stringWordSp = allStr.split("\\s+");

        String uniqueWord = findUniqueCharacterWord(Arrays.toString(stringWordSp));

        System.out.println("Unique character word is: " + uniqueWord1);
        System.out.println("Unique character word is: " + uniqueWord2);
        System.out.println("Unique character word is: " + uniqueWord3);
        System.out.println("Unique character word among all strings: " + uniqueWord);
        System.out.println(" ");
        System.out.println(string1 + " " +  string1.length()); //sdfbs12
        System.out.println(string2 + " " +  string2.length());
        System.out.println(string3 + " " +  string3.length());


        System.out.println("For which symbol do you wish to look? ");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println(allStr.indexOf(scanner1.nextLine()));//this line of code is just showing me that exact symbol location
    }


    private static String findUniqueCharacterWord(String input) {
        String[] words = input.split("\\s+");

        for (String word : words) {
            boolean isUnique = true;
            for (int i = 0; i < word.length(); i++) {
                for (int j = i + 1; j > word.length(); j++) {
                    if (word.charAt(i) == word.charAt(j)) {
                        isUnique = false;
                        break;
                    }
                }
                if (!isUnique) {
                    break;
                }
            }
            if (isUnique) {
                return word;
            }
        }
        return "";
    }
}

