package Math;
import java.util.*;
public class GetSumAbsoluteDifference {
    public static int[] getSumAbsoluteDifferences1(int[] nums) {
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
    public static int[] getSumAbsoluteDifferences2(int[] nums) {
        int n = nums.length;
        int[] res = new int[n]; 
        // int[] pre = new int[n];
        // pre[0]=nums[0];
        int pre = 0;
        int sum =0;
        for(int i=0;i<n;i++){
            // pre[i]=pre[i-1]+nums[i];
            sum+=nums[i];
        }
        for(int i=0;i<n;i++){
           res[i] = (nums[i]*i) - pre + sum-pre-nums[i] - nums[i]*(n-i-1);
           pre+=nums[i];
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("input array");
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("applying function : res1");
        int[] res1 = getSumAbsoluteDifferences1(nums);
        for(int i=0;i<n;i++){
            System.out.print(res1[i]+" ");
        }
         System.out.println("applying function : res2");
        int[] res2 = getSumAbsoluteDifferences2(nums);
        for(int i=0;i<n;i++){
            System.out.print(res2[i]+" ");
        }



    }
}
