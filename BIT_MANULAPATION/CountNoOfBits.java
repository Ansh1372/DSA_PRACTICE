package BIT_MANULAPATION;

import java.util.*;


public class CountNoOfBits {
   
    
    public static int Count_No_Of_Bits_Integer_optimal(int n){
        int c=0;
        while (n!=0) {
            n=n&(n-1);
            c++;
            
            
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        
        int j = Count_No_Of_Bits_Integer_optimal(num);
        System.out.println(j);

    }
}
