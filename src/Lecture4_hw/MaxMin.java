package Lecture4_hw;

import java.util.Arrays;
import java.util.Scanner;

//Найти минимальный-максимальный элементы и вывести в консоль.

public class MaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrSize;
        System.out.println("Please input array size > 0: ");
        if (scanner.hasNextInt()) {
            arrSize = scanner.nextInt();
        } else {
            System.out.println("Incorrect input");
            return;
        }
        if (arrSize <= 0) {
            System.out.println("Incorrect input");
            return;
        }

        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            arr[i] = Math.round((float) (Math.random() * 100));

        }
        System.out.println("Your random array: ");
        System.out.println(Arrays.toString(arr));

        int min = arr[0];
        int max = arr[0];

        for ( int i = 1; i < arrSize; i++)
        {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        System.out.println("Minimum number from your array is: " + min + " " + " and Maximum number is: " + max );
    }
}