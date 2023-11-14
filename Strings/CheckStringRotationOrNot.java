package Strings;

import java.util.Scanner;

public class CheckStringRotationOrNot {
    public static boolean areRotations(String s1, String s2 )
    {
        // Your code here
        if (s1.length() != s2.length()) {
            return false;
        }

        // Concatenate s1 with itself
        String concatenated = s1 + s1;

        // Check if s2 is a substring of the concatenated string
        return concatenated.contains(s2);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.println("second first string: ");
        String s2 = sc.nextLine();
        System.out.println("Are rotations? " + areRotations(s1, s2));
    }
}
