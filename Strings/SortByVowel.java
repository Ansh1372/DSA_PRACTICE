package Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SortByVowel {
    public static String sortVowels(String s) {
        char[] arr = s.toCharArray();

        List<Integer> index = new ArrayList<>();
        List<Character> vowel = new ArrayList<>();
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');

        for (int i=0; i<arr.length; i++) {
            if (set.contains(arr[i])) {
                index.add(i);
                vowel.add(arr[i]);
            }
        }

        Collections.sort(vowel);
        for (int i=0; i<index.size(); i++) {
            arr[index.get(i)] = vowel.get(i);
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine().trim();
        System.out.println("Sorted Vowels in the given string are : " + sortVowels(str));
        


    }
}

