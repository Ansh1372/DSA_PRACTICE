package NumberTheory;

import java.util.Scanner;

public class CountCommenFactor {
    public static int countCommenFactor(int a , int b){
        if(a==0 || b==0){
            return 0;
        }
        int c=0;
            for(int i=1;i<=b;i++){
                if(a%i==0 && b%i==0){
                    c+=1;
                }
            }
        
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Count of common factors is "+countCommenFactor(a,b));
    }
}
