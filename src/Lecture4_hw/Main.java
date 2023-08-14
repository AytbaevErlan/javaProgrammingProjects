package Lecture4_hw;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
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

        //Пройти по массиву, вывести все элементы в прямом и в обратном порядке
        System.out.println("Arrays in direct order will be: ");
        for (int i = 0; i < arrSize; i++)
        {
            System.out.println(arr[i] + " ");
        }
        //reverse one
        System.out.println("Arrays in reverse order will be: ");
        for (int i = arrSize - 1; i >= 0 ; i--)
        {
            System.out.println(arr[i] + " ");
        }
    }
}
