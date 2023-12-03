package Strings;

import java.util.*;

public class CheckArrayOfTwoStringEqualOrNot {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = String.join("", word1);
        String str2 = String.join("", word2);

        // Compare the concatenated strings
        return str1.equals(str2);
    }
    public static void main(String[] args) {
       String[] arr1 = {"hello","world"};
       String[] arr2 = {"hello","world"};
       String[] arr3 = {"ellohw","world"};
       String[] arr4 = {"hellohw","world"};
       System.out.println(arrayStringsAreEqual(arr1, arr2));
       System.out.println(arrayStringsAreEqual(arr4, arr3));   // Output: true
       System.out.println(arrayStringsAreEqual(arr1, arr3));
       System.out.println(arrayStringsAreEqual(arr2, arr3));
       System.out.println(arrayStringsAreEqual(arr1, arr4));
       System.out.println(arrayStringsAreEqual(arr2, arr4));

    }
}
