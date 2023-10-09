package lecture15.hw.l15task5;

import java.util.Scanner;
import java.util.function.Supplier;
//2-nd way of solving task5
public class ReverseBasic {
    public static void main(String[] args) {
        Supplier<String> str = () -> {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please provide string: ");
            String userInput = sc.nextLine();
            String rev = "";
            int lenght = userInput.length();
//I just tried to use another basic method, while in ReverseReturn one i have already written one which i simply need to apply.
            for (int i = lenght - 1; i >= 0; i--) {
                rev = rev + userInput.charAt(i);
            }
            return rev;
        };

        String reversedString = str.get();
        System.out.println("Your string reversed version: " + reversedString);
    }
}
