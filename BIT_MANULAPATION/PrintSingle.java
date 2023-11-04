package BIT_MANULAPATION;

import java.util.Scanner;

public class PrintSingle {
    public static int PrintSingleOne(int[] arr){
        if (arr == null || arr.length <= 0) return -1;
        int n=arr.length;
        int xor=0;
        for(int i=0;i<n;i++){
            xor=xor^arr[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the size of array");
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int r = PrintSingleOne(arr);
        System.out.print("The single number is "+r);
    }
}
