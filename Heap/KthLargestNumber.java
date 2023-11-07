package Heap;

import java.util.*;

public class KthLargestNumber {
    public static int[] kLargest(int[] arr, int n, int k) {
        // code here
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);

        for (int i = 0; i < k; i++) {
            minHeap.offer(arr[i]);
        }

        // Iterate over the rest of the elements in the array
        for (int i = k; i < n; i++) {
            if (arr[i] > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(arr[i]);
            }
        }

        // The min-heap now contains the K largest elements in increasing orde
        // So, create an array and pop elements from the heap in decreasing order
        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = minHeap.poll();
        }

        return result;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alue of n");

        int n = sc.nextInt();
        System.out.println("Enter the alue of k");

        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] output = kLargest(arr, n, k);
        for (int num : output) {
            System.out.print(num + " ");
        }
        
        
       
    }
}
