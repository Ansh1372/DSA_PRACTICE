package NumberTheory;

import java.util.Scanner;

public class AddDigits {
    public static int addDigits(int num) {
    if(num==0) return 0;
       if(num%9==0) return 9;
       return num%9;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Sum of digits is : "+addDigits(n));
    }
}
