class Solution {
    static int dp[];
    public static int call(int n,int k){
        if(n<=0 && k<2){return 0;}
        if(n==0 || n==1){return 1;}

if(dp[n]!=-1){return dp[n];}

int max=0;
        for(int i=1;i<=n;i++){
max=Math.max(i*call(n-i,k+1),max);
        }
        dp[n]=max;
return dp[n];
    
    }
    public int integerBreak(int n) {
    dp=new int[n+1]; 
    Arrays.fill(dp,-1);   
    return call(n,0);


    }
}