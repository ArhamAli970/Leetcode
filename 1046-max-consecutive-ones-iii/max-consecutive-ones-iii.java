class Solution {
    public int longestOnes(int[] nums, int k) {

        int i=0,max=0,j=0;

        for(j=0;j<nums.length;j++){
            max=Math.max(j-i,max);
            if(nums[j]==0){
                k--;
                while(k<0){
                    if(nums[i]==0){
                        k++;
                    }
                    i++;
                }
            }
        }

        return Math.max(max,j-i);
        
    }
}