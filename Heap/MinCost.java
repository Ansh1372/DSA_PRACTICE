package Heap;

import java.util.PriorityQueue;
import java.util.Scanner;

public class MinCost {
    public static long minCost(long arr[], int n) 
    {
        // your code here
        PriorityQueue<Long> minHeap = new PriorityQueue<>();
        for(long k : arr){
            minHeap.add(k);
        }
        long c =0;
        while(minHeap.size()>1){
            long a = minHeap.remove();
            long b = minHeap.remove();
            long cu = a+b;
            c+=cu;
            minHeap.add(cu);
        }
        return c;
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        long arr[] = new long[(int)n];
        System.out.println("Enter elements in array");
        for (int i=0 ;i < n;i++){
            arr[i] = sc.nextLong();
        }
        System.out.print("Minimum cost to connect all points is: "+ minCost(arr,n));
    }
}
