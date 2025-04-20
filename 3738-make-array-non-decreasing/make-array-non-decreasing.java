class Solution {
    public int maximumPossibleSize(int[] nums) {
        int cnt=0,max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=max){cnt++;max=nums[i];}
        }
        return cnt;
    }
}