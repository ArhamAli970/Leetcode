class Solution {
    public int longestOnes(int[] nums, int k) {

        int i=0,max=0,j=0;

        for(j=0;j<nums.length;j++){
            k-=nums[j]==0?1:0;
            max=Math.max(j-i,max);
            while(k<0){k+=nums[i]==0?1:0;i++;}
        }

        return Math.max(max,j-i);
        
    }
}