package Strings;
import java.util.*;
public class ParenthesisChecker{

    public static Boolean isper(String s){
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()){
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            }
            else{
                if (st.isEmpty()) return false;
                char top = st.peek();
                if(c==')' && top!='(') return false;
                if(c=='}' && top!='{') return false;
                if(c==']' && top!='[') return false;
                st.pop();
            } 

        }
        if(st.isEmpty()) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        System.out.println("Is the string balanced? " + isper(str));
    }
}