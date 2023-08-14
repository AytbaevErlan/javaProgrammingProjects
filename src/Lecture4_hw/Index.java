package Lecture4_hw;

import java.util.Arrays;
import java.util.Scanner;

public class Index {
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

            int min = 0;
            int max = 0;

            for (int i = 1; i < arrSize; i++)
            {
                if (arr[i] < arr[min])
                {
                  min = i;
                }
                if (arr[i] > arr[max])
                {
                    max = i;
                }
            }
            System.out.println("Minimun index is: " + min + " and Maximum index is: " + max);
        }
}
