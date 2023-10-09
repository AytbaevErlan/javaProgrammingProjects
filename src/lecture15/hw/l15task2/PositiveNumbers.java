package lecture15.hw.l15task2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
/*Используя Predicate среди массива чисел вывести только те, которые являются
положительными*/

public class PositiveNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, -1, 2, -2, 3, -3, 4, -4, 5, -4);

        Predicate<Integer> positiveNum = number -> number > 0;
        System.out.println(positiveNum);

        List<Integer> positiveNumbers = numbers.stream().filter(positiveNum).toList();
        System.out.println("Positive numbers are: " + positiveNumbers);
    }
}
