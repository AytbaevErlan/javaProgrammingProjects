package Lecture5_hw;

import java.util.Random;

/*Создайте двумерный массив и заполните его псевдослучайными числами с помощью
класса Random*/
public class Random12 {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        int[][] arr1 = new int[n][m];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr1[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr1[i][j] + "  ");
            }
            System.out.println();
        }


        int min = arr1[0][0];
        int max = arr1[0][0];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                min = Math.min(min, arr1[i][j]);
                max = Math.max(max, arr1[i][j]);
            }
        }
        System.out.println("Minimum number from your array is: " + min + " " + " and Maximum number is: " + max);
    }

}