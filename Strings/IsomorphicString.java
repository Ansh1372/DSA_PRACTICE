package Strings;

import java.util.HashMap;

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
        String s1="egg";
        String s2="add";
        System.out.println("Are the strings isomorphic? "+areIsomorphic(s1,s2));
    
    }
}
