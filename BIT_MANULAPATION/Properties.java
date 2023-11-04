package BIT_MANULAPATION;

import java.util.Scanner;

public class Properties {
    // check if the 'ith' hit is set or not
    public static boolean isSet(int i , int n) {
        int mask = 1<<i;
        return (mask & n) !=0 ;
    }

    // set the ith bit of a number
    public static int setithbit(int n , int i){
        int mask=1 << i;
        return (n | mask);
    }

    //clean the ith bit of a number
    public static int cleanithbit(int n,int i){
        int mask=(~(1<<i));
        return (n&mask);
    }
    //remove the last set of bits
    public static int removeLastBitSet(int num){
        num = (num & (num-1));
        return num;
    }
    //check if a number is power of 2 or not
    public static boolean isPowerOfTwo(int x) {
        if((x & (x-1))== 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter number of hits:");
        int i = sc.nextInt();
        System.out.println(isSet(n, i));
        System.out.println("Enter value to be set at ith bit position:");
        int k = setithbit(n, i);

        System.out.println(k);
        System.out.println("clean ith bits are");
        System.out.println(cleanithbit(n, i));
        System.out.println("Remove all set bits from right side : " );
        System.out.println(removeLastBitSet(n));
        System.out.println("Checking whether given number is power of two or not ? " + isPowerOfTwo(n));
    }
}
