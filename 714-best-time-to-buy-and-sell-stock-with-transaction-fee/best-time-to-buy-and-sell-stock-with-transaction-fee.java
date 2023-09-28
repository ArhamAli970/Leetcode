class Solution {
    static int dp[][];
    public static int call(int choice,int idx,int prices[],int fee){ 
          if(idx>=prices.length){return 0;} 
          if(dp[idx][choice]!=-1){return dp[idx][choice];}

          if(choice==0){ 
          int buy=-prices[idx]+call(1,idx+1,prices,fee);
          int notBuy=call(0,idx+1,prices,fee);
           dp[idx][choice]=Math.max(buy,notBuy);
          }
          else{ 
             int sell=prices[idx]+call(0,idx+1,prices,fee)-fee;
             int notSell=call(1,idx+1,prices,fee); 
            dp[idx][choice]=Math.max(sell,notSell);
          }

          return dp[idx][choice];



    }
    public int maxProfit(int[] prices, int fee) {
        int n=prices.length;
       dp= new int[n][2];
       for(int i[] : dp){ 
           Arrays.fill(i,-1);
       }
       int ans =call(0,0,prices,fee);

       return ans<0?0:ans;

    }
}