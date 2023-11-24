package Gready;

import java.util.*;

public class MaximNoOfCoinYouGet {
    public static int maxCoins(int[] piles) {
        int ans =0;
        int n = piles.length;
        Arrays.sort(piles);
        for(int i=n/3;i<n;i=i+2){
            ans+=piles[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] piles = new int[n];
        for(int i=0;i<n;i++){
            piles[i] = sc.nextInt();
        }
        System.out.println("Maximum number of coins you can get is: "+maxCoins(piles));
    
    }
}
