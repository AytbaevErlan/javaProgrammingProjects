package Lecture5_hw;

import java.util.Scanner;
//Создать зубчатый n-мерный массив(от 3 уровней). Посчитать количество ячеек в нём
public class Jagged {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter row length: ");
        int n = scanner.nextInt();
        System.out.println("Please enter column length: ");
        int m = scanner.nextInt();
        System.out.println("Please enter k length: ");
        int x = scanner.nextInt();
        int[][][] arr = new int[n][m][x];
        System.out.println("Enter " + n * m * x + " elements to store in array");

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                for (int k = 0; k < x; k++)
                {
                    arr[i][j][k] = scanner.nextInt();
                }
            }
        }
// number of cells are following
        int totalCells = n * m * x;
        System.out.println("Elements that stored in array: " + totalCells);

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                for (int k = 0; k < x; k++)
                {
                    System.out.println("Row [" + i + "]; Column [" + j + "]; Level [" + k + "]; Value: " + arr[i][j][k]);
                }
            }
        }
    }
}

