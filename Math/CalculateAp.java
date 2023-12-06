package Math;

import java.util.Scanner;

public class CalculateAp {
    public static int totalMoney(int n) {
        int number_of_complete_week = n/7;

        int number_of_days_last_week = n%7;
        
        int amount_DEPOSITED_COMPLETE_WEEK = number_of_complete_week*(2*28 + (number_of_complete_week-1)*7);

        amount_DEPOSITED_COMPLETE_WEEK=amount_DEPOSITED_COMPLETE_WEEK/2;

        int l = number_of_complete_week+number_of_days_last_week;

        int AMOUNT_IN_LASTWEEK  = number_of_days_last_week*(number_of_complete_week+1+l);

        AMOUNT_IN_LASTWEEK  =  AMOUNT_IN_LASTWEEK/2;

        return AMOUNT_IN_LASTWEEK +amount_DEPOSITED_COMPLETE_WEEK;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days:");
        int n = sc.nextInt();
        System.out.println("The total amount is : "+totalMoney(n));
    }
}
