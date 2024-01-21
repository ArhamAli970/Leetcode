class Solution {
    public int rob(int[] nums) {
        
        int n=nums.length;
        for(int i=1;i<n;i++){
            int last=i-2>=0?nums[i-2]+nums[i]:nums[i]; 
            nums[i]=Math.max(nums[i-1],last);
        }


        return nums[n-1];


    }
}