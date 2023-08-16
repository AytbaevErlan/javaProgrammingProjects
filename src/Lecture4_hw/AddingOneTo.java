package Lecture4_hw;


import java.util.Arrays;

public class AddingOneTo {
    public static void main(String[] args) {
        int i;
        int[] arr = {9, 9, 9};
        System.out.println("Initial array: " + Arrays.toString(arr));

        int addition = 1;
        for (i = arr.length - 1; i >= 0; i--) {
            int sum = arr[i] + addition;
            arr[i] = sum % 10;
            addition = sum / 10;
        }

        System.out.println("Array changed/will change: ");
        if ( addition == 1)
        {
            int[] addArray = new int[arr.length + 1];
            addArray[0] = 1;
            System.out.println(Arrays.toString(addArray));
        }
    }
}
