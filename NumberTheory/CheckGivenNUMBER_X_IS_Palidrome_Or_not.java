package NumberTheory;

import java.util.Scanner;

public class CheckGivenNUMBER_X_IS_Palidrome_Or_not {
    public static boolean isPalindrome(int x) {
        int rev=0;
        int temp = x;
        if(x<0){
            return false;
        }
        while(x!=0){
            rev= rev*10 + x%10;
            x=x/10;
        }
        if(temp!=rev){
           return false;
        }
        return true;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you want to check is palidrome or not");
        int x = sc.nextInt();
        if (isPalindrome(x)){
            System.out.println(x+" is a Palindrome number");
        }
        else{
            System.out.println(x+ " is not a Palindrome number");
        }

    }
}
