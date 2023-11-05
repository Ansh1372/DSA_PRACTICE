package NumberTheory;

import java.util.Scanner;

public class ReverseString {
    public static String reverse_String(String s){
        String temp = "";
        StringBuilder sb = new StringBuilder();
        for (int i=s.length()-1;i>=0;i--) {
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                temp = c+temp;
            }
            else{
                sb.append(temp);
                sb.append(c);
                temp="";
            }

        }
        sb.append(temp);
        return sb.toString();
      
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Reversed string is: "+reverse_String(s));
    }
}
