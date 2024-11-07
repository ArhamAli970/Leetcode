class Solution {
    public int largestCombination(int[] candidates) {

        int cnt[]=new int[32];
        int max=0;

        for(int i=0;i<candidates.length;i++){
            int num=candidates[i];
            int idx=0;
            while(num>0){
                if((num&1)!=0){++cnt[idx];}
                max=Math.max(cnt[idx],max);
                ++idx;
                num>>=1;
            }

        }

        return max;

        
        
    }
}