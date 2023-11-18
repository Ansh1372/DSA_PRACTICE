package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumElementAfterDecreasingReaggaging1846leetcode {
     public static int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        int pre = 0;
        for (int a: arr)
            pre = Math.min(pre + 1, a);
            return pre;
        
        
        
         
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int m = maximumElementAfterDecrementingAndRearranging(arr);
        System.out.println("Maximum element after decreasing and rearranging is "+m);



    }
}
