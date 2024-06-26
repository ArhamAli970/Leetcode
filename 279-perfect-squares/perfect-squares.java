class Solution {
    public int numSquares(int n) {

        int[] dp=new int[n+1];
        
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;

        for(int i=1;i<=n;i++){
            int j=1,min=Integer.MAX_VALUE;
            while(j*j<=i){
                min=Math.min(dp[i-(j*j)],min);
                j++;
            }

            dp[i]=min+1;

        }
        
        return dp[n];

    }
}