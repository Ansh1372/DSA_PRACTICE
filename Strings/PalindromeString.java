package Strings;
import java.util.*;

public class PalindromeString {
    public int ispalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while (i<j) {
            if(s.charAt(i)==s.charAt(j)) {
                i++;
                j--;
            }
            else{
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
    
        String str = sc.nextLine();
        PalindromeString ps = new PalindromeString();
        if(ps.ispalindrome(str) == 1){
            System.out.println("The given string is palindrome");
        }
        else{
            System.out.println("not palindrome");
        }

    }
}
