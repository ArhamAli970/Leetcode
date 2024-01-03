class Solution {


static int dp[][][][];


public static int call(int nums[],int i,int j,int sum,int turn){ 
    if(sum<=0){return 1;}
    if(i>j){return 0;}

// if(dp[i][j][sum][turn]!=-1){return dp[i][j][sum][turn];}
int take1=-1,take2=-1;

if(turn==0){
    take1=call(nums,i+1,j,sum-nums[i],1);
    take2=call(nums,i,j-1,sum-nums[j],1);
    return (take1==1 || take2==1)?1:0;
   
}else{
    take1=call(nums,i+1,j,sum,0);
    take2=call(nums,i,j-1,sum,0);
    return (take1==1 && take2==1)?1:0;
 }


}

    public boolean predictTheWinner(int[] nums) {

  
        
        int sum=0,n=nums.length;
        for(int i=0;i<n;i++){ 
            sum+=nums[i];
        }

int val=sum/2;
if(sum%2!=0){++val;}



        return call(nums,0,n-1,val,0)==1;

    }
}