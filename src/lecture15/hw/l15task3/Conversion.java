package lecture15.hw.l15task3;

import java.util.Scanner;

public class Conversion{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide the amount of money in currency BYN that you wish to convert to USD: ");
        double userBYN = scanner.nextDouble();

        CurrencyConvertor currencyConvertor = new ConversionRateFormula(userBYN);
        currencyConvertor.convertBynToUsd();
        System.out.println(currencyConvertor);
    }
}
