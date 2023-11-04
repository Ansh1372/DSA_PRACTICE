package BIT_MANULAPATION;

import java.util.Scanner;

public class XorOperationFromRange {
    public static int XorOperationFromRange_L_to_R(int l , int r){
        int xor=0;
        for(int i=l;i<=r;i++){
            xor=xor^i;
        }
        return xor;
        
        
    }
    public static int XorOperationFrom_L_to_R_optimize(int n , int r){
        int xor_l=0;
        int xor_r=0;
        if(n%4==0) xor_l= n;
        if(n%4==1)xor_l= 1;
        if(n%4==2)xor_l= n+1;
        if(n%4==3)xor_l= 0;

        if(r%4==0) xor_r= r;
        if(r%4==1)xor_r= 1;
        if(r%4==2)xor_r= r+1;
        if(r%4==3)xor_r= 0;

        int xorL_to_R = xor_r^xor_l;
        return xorL_to_R; 


    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("starting range ");
        int l = sc.nextInt();
        System.out.println("ending range ");
        int r = sc.nextInt();

        int res1 = XorOperationFromRange_L_to_R(l,r);
        System.out.println("Result is : "+res1);
        int res2 = XorOperationFrom_L_to_R_optimize(l,r);
        System.out.println("Optimized Result is : "+res2);
    }
}
