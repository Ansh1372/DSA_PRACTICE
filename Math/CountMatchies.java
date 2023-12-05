package Math;
import java.util.*;
public class CountMatchies {
    public static int numberOfMatches(int n) {
        int matches = 0;
        while (n > 1) {
            matches += n / 2;
            n = (n + 1) / 2;  // Calculate the number of teams that advance to the next round
        }
        return matches;
        
    
    }
    public static int numberOfMatches2(int n){
        return n-1;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("count number matches");
        int k = numberOfMatches(n);
        System.out.println(k);
        System.out.println("number of matchs in second method");
        int m = numberOfMatches2(n);
        System.out.println(m);
    }
}
