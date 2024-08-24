class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];

        for(int i=n-2;i>=0;i--){
            int ele=nums[i],min=10000000;
            for(int j=i+1;j<=Math.min(n-1,i+ele);j++){
                min=Math.min(dp[j],min);
            }
            dp[i]=min+1;
        }
        return dp[0];
        
    }
}