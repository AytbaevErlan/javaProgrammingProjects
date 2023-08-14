package Lecture4_hw;

import java.util.Arrays;
import java.util.Scanner;

public class Zero {
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

        int counter = 0;

        for (int i = 0; i < arrSize; i++)
        {
            if (arr[i] == 0)
            {
                counter++;
            }
        }
        if (counter > 0)
        {
            System.out.println("Zero elements number: " + counter);
        }
        else
        {
            System.out.println("Array does not containt any zero elements!");
        }
    }

}
