package Gready;

import java.util.Arrays;
import java.util.Scanner;

public class AssignCookies {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        for(int j=0;i<g.length && j<s.length;j++)
	        if(g[i]<=s[j]) i++;
        return i;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of children:");
        int m = sc.nextInt();
        System.out.println("Enter number of cookies:");
        int n = sc.nextInt();
        int[] g = new int[m];
        System.out.print("Enter the size of each child's stomach (separated by space): ");
        for(int i=0;i<m;i++){
            g[i] = sc.nextInt();
        }
        int[] s = new int[n];
        System.out.print("Enter the sizes of all the cookies (separated by space): ");
        for(int j=0;j<n;j++){
            s[j] = sc.nextInt();
        }
        int count = findContentChildren(g,s);
        System.out.printf("%d children can be satisfied with %d cookies.\n",m,count);



    }
}
