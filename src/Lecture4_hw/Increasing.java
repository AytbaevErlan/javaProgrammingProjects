package Lecture4_hw;

import java.util.Arrays;
import java.util.Scanner;

public class Increasing {
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

        //Проверить, является ли массив возрастающей последовательностью (каждое следующее
        //число больше предыдущего)
        boolean increasingArray = true;

        for (int i = 1; i < arrSize; i++)
        {
            if (arr[i] <= arr[i - 1]) {
                increasingArray = false;
                break;
            }
        }

        if (increasingArray)
        {
            System.out.println("Array is increasing");
        }
        else
        {
            System.out.println("Array is not increasing!");
        }
    }
}
