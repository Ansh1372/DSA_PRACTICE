package BIT_MANULAPATION;

import java.util.Scanner;

public class Swaping {
    public static void swap(int a, int b){
        System.out.println("Before swapping");
        System.out.println(a + " & " + b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swapping");
        System.out.println(a+" & "+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a & b ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        swap(a,b);
    }

}
