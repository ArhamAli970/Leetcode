class Solution {
    public int[][] divideArray(int[] nums, int k) {
        
        Arrays.sort(nums);
        int n=nums.length;
        n/=3;
        
        int ans[][]=new int[n][3];
        
        int idx=0;
        
        for(int i=0;i<nums.length;i+=3){ 
             if(nums[i+2]-nums[i]>k){ return new int[0][0];}
        }
        
        
        ans[0][0]=nums[0];
        for(int i=1;i<nums.length;i++){ 
            while(i%3!=0){ 
                ans[idx][i%3]=nums[i];
                i++;
            }
            idx++;
            if(i>=nums.length){break;}
            ans[idx][i%3]=nums[i];
        }
        
        return ans;
    }
}