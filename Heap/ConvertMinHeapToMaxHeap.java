package Heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class ConvertMinHeapToMaxHeap {
        public static void convertMinToMaxHeap(int N, int arr[]) {
            // code here
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for(int i=0;i<N;i++){
                pq.add(arr[i]);
            }
            
        }
        public static void main(String[] args) {
            int n = 4;
            int arr[] = {1,2,3,4};
            convertMinToMaxHeap(n, arr);
        }
}
