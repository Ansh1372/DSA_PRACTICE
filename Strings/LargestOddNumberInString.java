package Strings;
import java.util.*;
public class LargestOddNumberInString {
     public static String largestOddNumber(String num) {
      for(int i=num.length()-1;i>=0;i--){
          int n=num.charAt(i);
          if(n%2!=0){
              return num.substring(0,i+1);
          }
      } 
      return ""; 
        
    }
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = d.nextLine();
        System.out.print("largest odd number in givin string is : " + largestOddNumber(str));
    }
}
