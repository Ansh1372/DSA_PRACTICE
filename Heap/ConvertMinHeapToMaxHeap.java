package Heap;

import java.util.*;



public class ConvertMinHeapToMaxHeap {
        public static void convertMinToMaxHeap(int N, int arr[]) {
            // code here
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for(int i=0;i<N;i++){
                pq.add(arr[i]);
            }
            
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            convertMinToMaxHeap(n, arr);
        }
}
