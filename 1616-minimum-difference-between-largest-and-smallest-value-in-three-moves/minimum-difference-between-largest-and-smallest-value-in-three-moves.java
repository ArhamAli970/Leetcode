class Solution {
    public int minDifference(int[] nums) {
        int n=nums.length;
        if(n<=3){return 0;}

        Arrays.sort(nums);
        int i=0,j=n-4,min=Integer.MAX_VALUE;

        while(j<n){
            int diff=nums[j]-nums[i];
            min=Math.min(diff,min);
            j++;
            i++;
        }

        return min;

       
        
    }
}