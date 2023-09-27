package lecture15.hw.l15task5;

import java.util.Scanner;
import java.util.function.Supplier;

/*Используя Supplier написать метод, который будет возвращать введенную с консоли
строку задом наперед.*/
public class ReverseReturn {
    public static void main(String[] args) {
        Supplier<String> str = () -> {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please provide string: ");
            String userInput = sc.nextLine();

            StringBuffer sb = new StringBuffer(userInput);
            return sb.reverse().toString();
        };

        String reversedString = str.get();
        System.out.println("Your string reversed version: " + reversedString);
    }
}

