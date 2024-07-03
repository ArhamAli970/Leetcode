class Solution {
    public int minDifference(int[] nums) {
        
        Arrays.sort(nums);
        int n=nums.length,i=0,j=n-4;
        int min=Integer.MAX_VALUE;

        while(j<n && i<j){
           min=Math.min(nums[j]-nums[i],min);
           i++;j++;
        }

        return min==Integer.MAX_VALUE?0:min;



    }
}