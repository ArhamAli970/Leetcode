class Solution {
    public static boolean func(int candies[],long k,int cand){
        for(int i=0;i<candies.length;i++){
            k-=(candies[i]/cand);
        }

        return k<=0;
    }
    public int maximumCandies(int[] candies, long k) {
        int st=1,end=10000001,ans=0;
        while(st<=end){
            int cand=(st+end)/2;
            if(func(candies,k,cand)){
                ans=cand;
                st=cand+1;
            }else{
                end=cand-1;
            }
        }


        return ans;
        
    }
}