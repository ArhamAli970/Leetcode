class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        Arrays.sort(nums);
        int ans[]=new int[nums.length];

        
        int i=0,j=nums.length-1,idx=0;
        while(i<j){
            ans[idx++]=nums[i++];
            ans[idx++]=nums[j--];
            
        }
        
        if(i==j){ans[idx]=nums[j];}
        
        return ans;
        
    }
}