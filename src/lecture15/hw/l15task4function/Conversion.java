package lecture15.hw.l15task4function;

import java.util.Scanner;
import java.util.function.Function;

public class Conversion {
    public static void main(String[] args) {
        Function<String, Double> convertToUsd = input -> {
            //overrided method without try, catch
            String[] parts = input.split(" ");
            if (parts.length != 2) {
                System.out.println("Invalid input date. Please provide as \"amount\" BYN ");
                return (double) 0;
                //return 0.0 - will also work as point after zero means double
            }
            else {
                double amountInBYN = Double.parseDouble(parts[0]);
                double usdRate = 0.40;
                double convertedToUSD =  amountInBYN * usdRate;

                return convertedToUSD;
            }
        };

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, provide the amount of money in BYN currency that you wish to convert to USD: ");
        String str = sc.nextLine();
        Double result = convertToUsd.apply(str);

        //System.out.println(str + " in USD $" + result);

        if (result > 0) {
            System.out.println(str  + " in USD: $" + result);
        } else if (result < 0) {
            System.out.println("You provided minus amount.");
        }
        else {
            System.out.println("Invalid input: " + str);
        }
    }
}

