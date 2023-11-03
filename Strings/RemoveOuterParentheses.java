package Strings;
import java.util.*;

public class RemoveOuterParentheses {
    public static String removeOuterParentheses(String s){
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(char c : s.toCharArray()){
            if(c =='('){
                if(count!=0) sb.append(c);
                count++;
                
            }
            else{
                count--;
                if(count != 0) sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Output after removing outer parentheses is "+removeOuterParentheses(str));
    }
}
