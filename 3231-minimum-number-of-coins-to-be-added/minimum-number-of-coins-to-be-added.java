class Solution {
    public int minimumAddedCoins(int[] coins, int target) {

     Arrays.sort(coins);
     int prefixSum=0,idx=0,add=0;

     for(int i=1;i<=target;i++){ 
         
        if(idx<coins.length && i>=coins[idx])
        {
            prefixSum+=coins[idx];
            idx++;
        }
        else{ 
            if(prefixSum>=i){continue;}
            prefixSum+=i;
            add++;
        }


     }
     
     return add;

    }
}