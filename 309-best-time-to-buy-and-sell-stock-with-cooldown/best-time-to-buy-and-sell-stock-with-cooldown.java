class Solution {
    static int dp[][];
     
    public static int call(int prices[],int toTake,int idx){ 
       
       if(idx>=prices.length){return 0;}
         
       if(toTake==-1 || prices[idx]<prices[toTake]){ return call(prices,idx,idx+1);}

       if(dp[idx][toTake]!=-1){return dp[idx][toTake];}
       
       int lena= call(prices,-1,idx+2);
       int nhilena=call(prices,toTake,idx+1);

       int max=Math.max(lena+prices[idx]-prices[toTake],nhilena);

       dp[idx][toTake]=max;

       return max;
    

       

    }


    public int maxProfit(int[] prices) {
       int n= prices.length;
       dp= new int[n][n];

for(int i[]:dp){
           Arrays.fill(i,-1);
    }

      return call(prices,-1,0);
    // return 9;


    }
}