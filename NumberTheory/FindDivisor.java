package NumberTheory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FindDivisor {
    public static void divisor(int n){
        ArrayList<Integer> a = new ArrayList<>();
        for (int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                a.add(i);
                if(i != n/i){
                    a.add(n/i);
                }
            }
        }
        Collections.sort(a);
        for(int b : a){
            System.out.println(b + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        divisor(num);
    }
}
