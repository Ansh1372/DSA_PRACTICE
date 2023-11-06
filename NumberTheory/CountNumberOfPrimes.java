package NumberTheory;

import java.util.Scanner;

public class CountNumberOfPrimes {
    public static int Count_Number_Of_Primes(int n){
        if(n<=2) return 0;
        boolean[] b = new boolean[n];
        int l = (int)Math.sqrt(n); 
        for(int i=2;i<=l;i++){
            if(b[i]=false){
                for(int j=i*i ; j<n;j+=i){
                    b[j] = true;
            
                }

            }
            
            
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(b[i]==false){
                c++;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.print("Count of primes less than "+num+" is: ");
        System.out.println(Count_Number_Of_Primes(num));
    }
}
