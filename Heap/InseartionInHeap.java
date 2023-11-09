package Heap;

import java.util.*;

public class InseartionInHeap {
    public static void swap( int[]a ,int i , int j){
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void printarray(int arr[] , int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void heapfy(int[] a , int n, int i){
        //i=2*parent+1
        int parent = (i-1)/2;
        if(a[parent]>0){
            if(a[i]>a[parent]){
                swap(a, i, parent);
                heapfy(a, n, parent);
            }
        }
    }
    public static int insert(int[] a , int n , int value){
        n++;
        a[n-1] = value;
        heapfy(a, n, n-1);
        return n;
    }
    public static void inserarray(int[] a , int n){
        Scanner scanner = new Scanner(System.in);
        
        for(int i=0;i<n;i++){
            a[i] = scanner.nextInt();
        }
        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = scanner.nextInt();
        int max = 100;
        int[] a = new int[max];
        System.out.println("Enter elements in array:");
        inserarray(a , size);
        System.out.println("before heapfy/inserting");
        printarray(a, size);
        int value = 88;
        insert(a, size, value);
        System.out.println("After heapfy/inserting");
        printarray(a, size);





    }

}