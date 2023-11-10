package Heap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Merge_Sorted_k_array {
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int k) 
    {
        // Write your code here.
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<k;i++){
            for(int j=0;j<k;j++){
                    pq.add(arr[i][j]);
                
            }

        }
        ArrayList<Integer> a = new ArrayList<>(pq);
        Collections.sort(a);
        return a;
    
    }
        
        
    
    public static void main(String[] args) {
        int k = 4;
        int arr[][]={{1,2,3,4},{2,2,3,4},
        {5,5,6,6},{7,8,9,9}};
        System.out.println("Merged array is: "+mergeKArrays(arr,k));
    
    }
}
