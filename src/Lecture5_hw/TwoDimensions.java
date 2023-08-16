package Lecture5_hw;

import java.util.Scanner;
import java.util.Random;
//1.1 Создать двумерный массив, заполнить его случайными числами
public class TwoDimensions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter row length: ");
        int n = scanner.nextInt();
        System.out.println("Please enter column length: ");
        int m = scanner.nextInt();
        int[][] arr1 = new int[n][m];

        Random random = new Random();

        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < m; j++) {
                arr1[i][j] = random.nextInt(10);
                System.out.println("Row [" + i + "]; column [" + j + "]" + arr1[i][j]);
            }
        }
        //1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли

        System.out.println("Please provide number to add for each value: ");
        int addition = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr1[i][j] += addition;
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        //1.3 Найти сумму всех получившихся элементов и вывести в консоль
        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m ; j++)
            {
                sum += arr1[i][j];
            }
        }
        System.out.println("Sum of numbers will be: " + sum);
    }
}