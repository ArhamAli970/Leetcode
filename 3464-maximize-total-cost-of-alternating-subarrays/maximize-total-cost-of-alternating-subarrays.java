class Solution {
    static long dp[][];
    
    public static long call(int l,int i,int nums[]){
    
        if(i>=nums.length){
            return 0;
        }
        
        if(dp[i][l]!=-1){return dp[i][l];}
        
       
        
       long  t1= call(1,i+1,nums)+nums[i]; 
       
        if(l==1){
            t1=Math.max(t1,call(0,i+1,nums)-nums[i]);
        }

        
        
        
        
        return dp[i][l]=t1;
        
        
        
    }
    
    public long maximumTotalCost(int[] nums) {
        int n=nums.length;
        dp= new long[n][2];
        
        for(long i[]:dp){
            Arrays.fill(i,-1);
        }
        
       return call(1,1,nums)+(nums[0]);
    }
}