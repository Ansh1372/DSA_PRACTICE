package BIT_MANULAPATION;

import java.util.Scanner;

public class XorOperationFrom_1_to_N {
    //TC=0(N)
    public static int XorOperationFrom_1_to_N_return(int n){
        if (n <= 0) return -1; // check for invalid input
        int xor=0;
        while(n>0){
            xor=xor^n;
            n--;
        }
        return xor;
    }
    //OPTIMIZE CODE TC=O(1)
    public static int XorOperationFrom_1_to_N_optimize(int n){
        if(n%4==0) return n;
        if(n%4==1)return 1;
        if(n%4==2)return n+1;
        if(n%4==3)return 0;
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int res1 = XorOperationFrom_1_to_N_return(n);
        System.out.println("Result is : "+res1);
        int res2 = XorOperationFrom_1_to_N_optimize(n);
        System.out.println("Optimized Result is : "+res2);
    }
}
