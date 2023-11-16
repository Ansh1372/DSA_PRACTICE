package Strings;

import java.util.*;

public class IsomorphicString {
    public static boolean areIsomorphic(String str1,String str2)
    {
        // Your code here
        if(str1.length()!=str2.length())
        {
            return false;
        }
        HashMap<Character,Character>map=new HashMap<>();
        for(int i=0;i<str1.length();i++)
        {
            if(map.containsKey(str1.charAt(i)))
            {
                if(map.get(str1.charAt(i))!=str2.charAt(i))
                {
                    return false;
                }
            }
            else
            {
                if(map.containsValue(str2.charAt(i)))
                {
                    return false;
                }
                map.put(str1.charAt(i),str2.charAt(i));
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two string");
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        System.out.println("Are the strings isomorphic? "+areIsomorphic(s1,s2));
    
    }
}
