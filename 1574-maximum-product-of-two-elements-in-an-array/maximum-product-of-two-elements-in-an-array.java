class Solution {
    public int maxProduct(int[] nums) {
        
        int max1=0,max2=0;
        
        for(int i=0;i<nums.length;i++){ 
        
            if(nums[i]>max1){ 
            int swap=max1;
            max1=nums[i];
            max2=swap;
            
            }else if(nums[i]>max2){ 
                max2=nums[i];
            
            }
    
        }
        
        
        return (max1-1)*(max2-1);
        
    }
}