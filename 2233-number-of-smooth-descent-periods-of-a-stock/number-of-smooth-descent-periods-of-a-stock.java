class Solution {
    // 3 2 1 4
    // cnt=1
    //for{
        // if(arr[j-1]-arr[j]!=1){i=j;} (1,1)
        // cnt+=j-i+1; //2
    
    public long getDescentPeriods(int[] prices) {
        long cnt=1l,i=0;
        for(int j=1;j<prices.length;j++){
            if(prices[j-1]-prices[j]!=1){i=j;}
            cnt+=j-i+1;
        }

        return cnt;
    }
}