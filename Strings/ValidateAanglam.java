package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class ValidateAanglam {
    
    public boolean isAnagram(String s, String t) {
         if (s.length()!=t.length()){
            return false;
        }

        HashMap<Character, Integer> first = new HashMap<>();
        HashMap<Character, Integer> second = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (first.get(s.charAt(i))!=null){
                first.put(s.charAt(i), first.get(s.charAt(i)) + 1);
            }else {
                first.put(s.charAt(i), 0);
            }

            if (second.get(t.charAt(i))!=null){
                second.put(t.charAt(i), second.get(t.charAt(i)) + 1);
            }else {
                second.put(t.charAt(i), 0);
            }
        }
        
        for (Map.Entry<Character, Integer> secondString : second.entrySet()) {
            if (!Objects.equals(first.get(secondString.getKey()), secondString.getValue())) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        ValidateAanglam validateAanglam=new ValidateAanglam();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two strings");
        String str1 = sc.nextLine().trim();
        String str2 = sc.nextLine().trim();
        System.out.println(validateAanglam.isAnagram(str1, str2));
    }
}

