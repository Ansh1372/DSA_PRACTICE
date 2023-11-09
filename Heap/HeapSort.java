package Heap;

import java.util.Scanner;

public class HeapSort {
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void heapify(int[] arr, int n, int i)
    {
        int largest = i;
        int l = 2*i + 1;
        int r = 2*i + 2;

        //check if the left child is greater than the largest
        if(l < n && arr[l] > arr[largest])
        {
            largest = l;
        }

        //check if the right child is greater than the largest
        if(r < n && arr[r] > arr[largest])
        {
            largest = r;
        }

        //if largest is not root
        if(largest != i)
        {
            swap(arr, i, largest);

            heapify(arr, n, largest);
        }
    }
    public static void inserarray(int[] a , int n){
        Scanner scanner = new Scanner(System.in);
        
        for(int i=0;i<n;i++){
            a[i] = scanner.nextInt();
        }
        
    }
    public static void printArray(int[] arr, int n)
    {
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void HeapSorts(int[] a , int n){
        for(int i=(n/2)-1;i>=0;i--){
            heapify(a, n, i);
        
        }
        for (int i=n-1; i >=0 ; i-- )
        {
            swap(a, i, 0);
            heapify(a, i, 0);
        }
    }
    public static void main(String[] args) {
        int MAX = 100;

        int[] arr = new int[MAX];

        arr[0] = 100;
        arr[1] = 70;
        arr[2] = 60;
        arr[3] = 40;
        arr[4] = 50;

        int n = 5;

        System.out.println("Before sort, heap elements are : ");
        printArray(arr, n);
        HeapSorts(arr, n);
        System.out.println("After sort, heap elements are : ");
        printArray(arr, n);



    }
    
}
