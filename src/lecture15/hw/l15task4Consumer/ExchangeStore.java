package lecture15.hw.l15task4Consumer;

import java.util.Scanner;
import java.util.function.Consumer;

//Используя Consumer реализовать лямбду, которая будет принимать в себя строку в
//формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
//выводить сумму, переведенную сразу в доллары
public class ExchangeStore {
    public static void main(String[] args) {
        Consumer<String> consumer = input -> {
            String[] parts = input.split(" ");
            if (parts.length != 2) {
                System.out.println("Invalid input date. Please provide as \"amount\" BYN ");
                return ;
            }
            try {
                double amountInBYN = Double.parseDouble(parts[0]);
                double rateUSD = 0.40;
                double convertsionCalculation = amountInBYN * rateUSD;

                System.out.println(amountInBYN + " in USD $" + convertsionCalculation);
            } catch (NumberFormatException exception) {
                System.out.println("Invalid date provided. Please provide as \"amount\" BYN ");
            }
        };

        Scanner sc = new Scanner(System.in);
        System.out.println("Any: ");
        String userInputBYN = sc.nextLine();

        consumer.accept(userInputBYN);
    }
}
