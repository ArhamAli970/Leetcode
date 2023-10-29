class Solution {

static long dp[][];

public static long call(int i,int[] nums,int k,int cnt){ 
    
    if(i>=nums.length){return 0;}

    if(dp[i][cnt]!=-1){return dp[i][cnt];}

    
    
    
    if(cnt<2){
    long lena= call(i+1,nums,k,0);
    if(k-nums[i]>0){lena+=(k-nums[i]);}
    long nhiLena=call(i+1,nums,k,cnt+1);
    dp[i][cnt]=Math.min(lena,nhiLena);
    return dp[i][cnt];
    }
     
    dp[i][cnt]=call(i+1,nums,k,0);
    if(k-nums[i]>0){dp[i][cnt]+=(k-nums[i]);}
    

return dp[i][cnt];


}

    public long minIncrementOperations(int[] nums, int k) {
int n=nums.length;
 dp=new long[n][3];

    for(long i[]:dp){ 
        Arrays.fill(i,-1);
    }


return call(0,nums,k,0);

    }
}