package Lecture10.task3_l10;
//outprint strings which is less than average string lenght
public class LenghtCal {
    public static String CalculateLength(String string1, String string2, String string3) {
        double lengthOfAvarage = (double) (string1.length() + string2.length() + string3.length()) / 2;

        System.out.println("Average length of strings is " + lengthOfAvarage + " and strings less than " + lengthOfAvarage + " are :");

        if (string1.length() < lengthOfAvarage) {
            System.out.println(string1 + " (length) " + string1.length());
        }

        if (string2.length() < lengthOfAvarage) {
            System.out.println(string2 + " (length) " + string2.length());
        }

        if (string3.length() < lengthOfAvarage) {
            System.out.println(string3 + " (length) " + string3.length());
        }
        return "";
    }
}
