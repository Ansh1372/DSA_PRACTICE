package Math;
import java.util.*;
public class GetSumAbsoluteDifference {
    public static int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] res = new int[n]; 
        int[] pre = new int[n];
        pre[0]=nums[0];
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1]+nums[i];
        }
        for(int i=0;i<n;i++){
           res[i] = (nums[i]*i) - (pre[i]-nums[i]) + (pre[n-1] - pre[i]) - nums[i]*(n-i-1);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int[] res = getSumAbsoluteDifferences(nums);
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }

        
    }
}
