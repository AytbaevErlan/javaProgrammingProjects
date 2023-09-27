package lecture15.hw.l15task1;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class GuessWhenHundred {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your date of birth: ");
        String dateOfBirth = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try {
            LocalDate birthDate = LocalDate.parse(dateOfBirth, formatter);
            LocalDate hundredYears = birthDate.plusYears(100);

            System.out.println("You will turn 100 in " + hundredYears.format(formatter));
        } catch (Exception exception) {
            System.out.println("Please provide valid date as yyyy-MM-dd, otherwise system will not be able to accept the value.");
        }
    }
}
