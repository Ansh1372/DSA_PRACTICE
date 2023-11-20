package Strings;
import java.util.*;

public class ReverseWords {
    public static String reverseStringwords(String s){
        String[] words = s.split("\\.");
        StringBuilder sb = new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]);
            if(i>0) sb.append(".");
        }
        return sb.toString();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        System.out.println("--------before revise-------");
        System.out.println(s);
        System.out.println("-------after revise--------------");
        System.out.println(reverseStringwords(s));
    }
}
