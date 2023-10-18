package lecture16.task1;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
       List<Integer> nums = new ArrayList<>();
       nums.add(1);
       nums.add(2);
       nums.add(3);
       nums.add(2);
       nums.add(7);
       nums.add(5);
       nums.add(8);
       nums.add(2);
       nums.add(9);
       nums.add(4);
       nums.add(6);
       nums.add(2);

       nums = nums.stream().distinct().toList();

       List<Integer> evenNums = nums.stream().filter(n -> n % 2 ==0).sorted().toList();

       int sum = evenNums.stream().mapToInt(Integer::intValue).sum();

        System.out.println(nums);
        System.out.println(evenNums);
        System.out.println(sum);
    }
}
