class Solution {
    static int dp[][];
    public static int call(int n,int chance){
        if(n==1 || n==0){return chance==1?0:1;}
        
        if(dp[n][chance]!=-1){return dp[n][chance];}
        
        int c1=0,c2=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                int val=call(n-i,(chance+1)%2);
                if(val==0){c1++;}
                else{c2++;}
            }
        }
        
        if(chance==0 && c1>0){
            return dp[n][chance]=0; 
        }
        if(chance==1 && c2>0){
            return dp[n][chance]=1; 
        }
        
        return dp[n][chance]=c1>0?0:1;   
        
    }
    public boolean divisorGame(int n) {
        dp=new int[n+1][2];
        for(int i[]:dp){
            Arrays.fill(i,-1);
        }
        
        return call(n,0)==0?true:false;
        
    }
}