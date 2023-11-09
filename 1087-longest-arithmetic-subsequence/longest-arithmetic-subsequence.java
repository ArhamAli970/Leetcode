class Solution {

    public int longestArithSeqLength(int[] nums) {
        int max=0;
int n=nums.length;
int dp[][]=new int[n][1001]; 

for(int i=1;i<n;i++){ 
   for(int j=0;j<i;j++){ 

int diff=nums[i]-nums[j]+500;

dp[i][diff]=dp[j][diff]+1;

max=Math.max(dp[i][diff],max);
   }
}

return max+1;

    }
}