class Solution {
    public int minIncrementForUnique(int[] nums) {

        int prev=-1,ans=0;

        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            if(nums[i]<=prev){
                ++prev;
                ans+=(prev-nums[i]);
            }else{
                prev=nums[i];
            }
        }

        return ans;
        
    }
}