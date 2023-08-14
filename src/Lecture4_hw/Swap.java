package Lecture4_hw;

import java.util.Arrays;
import java.util.Scanner;
//Пройти по массиву и поменять местами элементы первый и последний, второй и
//предпоследний и т.д
public class Swap {
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
        for (int i = 0; i < arrSize; i++)
        {
            arr[i] = Math.round((float) (Math.random() * 100));
        }

        System.out.println("Your random array: ");
        System.out.println(Arrays.toString(arr));
        //task 5
        for ( int i = 0; i < arrSize / 2; i++)
        {
            int temp = arr[i];
            arr[i] = arr[arrSize - 1 - i];
            arr[arrSize - 1 - i] = temp;
        }

        System.out.println("Numbers after swapping: " + Arrays.toString(arr));
    }

}

