package Lecture5_hw;

import java.util.Scanner;
import java.util.Arrays;

/*Создайте двумерный массив и заполните его псевдослучайными числами с помощью
класса Random*/
public class Random {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter row length: ");
        int n = scanner.nextInt();
        System.out.println("Please enter column length: ");
        int m = scanner.nextInt();
        int arr1[][] = new int[n][m];
        System.out.println("Enter " + n * m + " elements to store in array");

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                arr1[i][j] = scanner.nextInt();
            }
        }
        for (int i =0; i < n; i++)
        {
            for (int j = 0; j < m; j++) {
                System.out.println("Row [" + i + "]; column [" + j + "]" + arr1[i][j]);
            }
        }

        int min = arr1[0][0];
        int max = arr1[0][0];
        for ( int i = 0; i < arr1.length; i++)
        {
            for (int j = 0; j < arr1.length; j++) {
                min = Math.min(min, arr1[i][j]);
                max = Math.max(max, arr1[i][j]);
            }
        }
        System.out.println("Minimum number from your array is: " + min + " " + " and Maximum number is: " + max );
    }
}
