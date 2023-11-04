package Strings;

import java.util.*;

public class Roman_to_int {
    public static int romanToInt(String s){
        Map<Character , Integer> m = new HashMap<>();
        m.put('I', 1);
        m.put('v', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);
        int r=m.get(s.charAt(s.length()-1));
        for (int i=s.length()-2 ;i>=0 ;i--) {
            if(m.get(s.charAt(i)) < m.get(s.charAt(i+1))){
                r -= m.get(s.charAt(i));
            }
            else{
                r += m.get(s.charAt(i));
            }
        }
        return r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String s = sc.nextLine();
        int r = romanToInt(s);
        System.out.println("The integer value of the given Roman numeral is "+r);
        sc.close();
    }
}
