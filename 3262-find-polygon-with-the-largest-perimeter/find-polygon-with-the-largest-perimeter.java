class Solution {
    public long largestPerimeter(int[] nums) {
        long sum=0,max=-1;
        Arrays.sort(nums);

        sum+=nums[0];sum+=nums[1];

        for(int i=2;i<nums.length;i++){
            if(sum>nums[i]){
                max=Math.max(max,sum+nums[i]);
            }
            sum+=nums[i];
        }

        return max;

    }
}