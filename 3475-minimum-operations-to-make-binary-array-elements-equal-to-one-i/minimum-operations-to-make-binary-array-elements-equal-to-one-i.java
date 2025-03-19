class Solution {
    public int minOperations(int[] nums) {
        
        int n=nums.length,cnt=0;
        
        for(int i=0;i<n-2;i++){
           
            if(nums[i]==0){
                cnt++;
                nums[i]=1;
                nums[i+1]=nums[i+1]==1?0:1;
                nums[i+2]=nums[i+2]==1?0:1;
            }
            
        }
        
        
        
        return nums[n-1]==0 || nums[n-2]==0 ?-1:cnt;
    }
}