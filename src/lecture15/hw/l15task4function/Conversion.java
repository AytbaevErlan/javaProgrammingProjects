package lecture15.hw.l15task4function;

import java.util.Scanner;
import java.util.function.Function;

public class Conversion {
    public static void main(String[] args) {
        Function<String, Double> convertToUsd = input -> {
            String[] parts = input.split(" ");
            if (parts.length != 2) {
                System.out.println("Invalid input date. Please provide as \"amount\" BYN ");
                return null;
            }
            try {
                double amountInBYN = Double.parseDouble(parts[0]);
                double usdRate = 0.40;
                double convertedToUSD =  amountInBYN * usdRate;

                return convertedToUSD;
            } catch (NumberFormatException exception) {
                System.out.println("Invalid date provided");
                return null;
            }
            catch (NullPointerException exception) {
                System.out.println("invalid date provided");
                return null;
            }
        };

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, provide the amount of money in BYN currency that you wish to convert to USD: ");
        String str = sc.nextLine();
        Double result = convertToUsd.apply(str);

        //System.out.println(str + " in USD $" + result);

        if (result > 0) {
            System.out.println(str + " in USD: $" + result);
        } else if (result < 0) {
            System.out.println("You provided minus amount.");
        } else if (result == null) {
            System.out.println("Invalid date provided.");
        }
        else {
            System.out.println("Invalid input: " + str);
        }
    }
}

