import java.util.*;
class Main
{
  public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }

            System.out.println(rob(a));
        }
        public static int robMoney(int[] nums,int index,int[] dp){
        
        if(index<nums.length-1) {
             if(dp[index]!=-1) return dp[index];
            dp[index] =  Math.max(nums[index]+robMoney(nums,index+2,dp),robMoney(nums,index+1,dp));
            return dp[index];
        }else if (index==nums.length-1) return nums[index];
        else return 0;
        
           
        
    }
    public static int rob(int[] nums) {
        
        int[]dp = new int[nums.length];
        for(int i =0;i<dp.length;i++) dp[i] = -1;
        return robMoney(nums,0,dp);
    }
}