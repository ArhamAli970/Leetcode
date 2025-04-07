class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){ 
            sum+=nums[i];
        }
        if(sum%2!=0){return false;}
        sum/=2;
        int n=nums.length;
        boolean dp[][]=new boolean[n+1][sum+1];

        for(int i=0;i<n;i++){dp[i][0]=true;}

        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum;j++){
                int val=nums[i-1];
                if(j-val>=0){
                    dp[i][j]=dp[i-1][j-val];
                }
                dp[i][j]=dp[i][j] || dp[i-1][j];
            }
        }

        return dp[n][sum];


    }
}