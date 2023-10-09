package lecture17.task1;

import java.util.Scanner;


/*Input to the console all abbreviations/strings from user. we will assume that Abbreviation is words from 2 to 6 symbols,
* that contains only Captil letters without any numbers*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PLease provide string/words: ");
        String userInput = scanner.nextLine();

        String[] words = userInput.split(" ");

        System.out.println("We have following abbreviations as: ");

        for (String word : words) {
            if (word.length() >= 2 && word.length() <= 6 && word.matches("[A-Z]+")) {
                System.out.println(word);
            }
        }

    }
}

