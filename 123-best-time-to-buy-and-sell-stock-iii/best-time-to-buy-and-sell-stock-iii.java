class Solution {
    static int dp[][][];

public static int call(int i,int choice,int cnt,int prices[]){
     if(cnt>=2 || i==prices.length){return 0;}

     if(dp[i][choice][cnt]!=-1){return dp[i][choice][cnt];}

    if(choice==0){
        int buy=call(i+1,1,cnt,prices)-prices[i];
        int notBuy=call(i+1,0,cnt,prices);
        dp[i][0][cnt]=Math.max(buy,notBuy);
        
    }else{
    
        int sell=call(i+1,0,cnt+1,prices)+prices[i];
        int notSell=call(i+1,1,cnt,prices);
        dp[i][1][cnt]=Math.max(sell,notSell);
    }

    return dp[i][choice][cnt];    


}

    public int maxProfit(int[] prices) {
        int n=prices.length;
        dp= new int[n][2][2];

        for(int i=0;i<n;i++){
             for(int j=0;j<2;j++){
                dp[i][j][0]=-1;
                dp[i][j][1]=-1;
             }
        }

return call(0,0,0,prices);

    }
}