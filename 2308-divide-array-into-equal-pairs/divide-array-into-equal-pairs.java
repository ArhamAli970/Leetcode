class Solution {
    public boolean divideArray(int[] nums) {
        int cnt[]=new int[501];
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(cnt[nums[i]]>0){--cnt[nums[i]];c--;}
            else{++cnt[nums[i]];c++;}
        }

        return c==0;
    }
}