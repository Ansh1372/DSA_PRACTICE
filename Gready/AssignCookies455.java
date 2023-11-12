package Gready;
import java.util.*;

public class AssignCookies455 {
   public static int assign_Cookies455(int[] s , int[] g){
    if (s == null || g == null) return 0;
    Arrays.sort(s);
    Arrays.sort(g);
    int lg = g.length;
    int ls = s.length;
    int c=0 , a =0;
    for (int i = 0 ; i<lg && c<ls;){
        if(s[c]>=g[i]){
            a++;
            i++;
        }
        c++;
        
    }
    return a;

   }
   public static void main(String[] args) {
    int[] s={1,2};
    int[] g={1,2,3};
    System.out.println("The number of children that can get the gift is "+assign_Cookies455(s,g));
   }
}
