class Solution {
    static int dp[][];

public static int call(int nums[],int i,int n,int sum){ 
    if(sum==0){return 1;}
    if(sum<0 || i==n){return 0;}

    if(dp[i][sum]!=-1){return dp[i][sum];}

    int take=call(nums,i+1,n,sum-nums[i]);
    int notTake=call(nums,i+1,n,sum);

    dp[i][sum]= (take ==1 || notTake==1)?1:0;

    return dp[i][sum];


}



    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){ 
            sum+=nums[i];
        }
        if(sum%2!=0){return false;}
        sum/=2;

dp= new int[nums.length][sum+1];

for(int i[]:dp){ 
    Arrays.fill(i,-1);
}


return call(nums,0,nums.length,sum)==1;


    }
}