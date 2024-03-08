class Solution {
    public int maxFrequencyElements(int[] nums) {
        
        int arr[]= new int[101];
        int max=0;
        
        for(int i=0;i<nums.length;i++){ 
           ++arr[nums[i]];
            max=Math.max(arr[nums[i]],max);
        }
        
        int cnt=0;
        
        
        for(int i=0;i<101;i++){ 
          if(max==arr[i]){
              cnt+=max;
          }
        }
        
        
        return cnt;
        
        
        
        
        
        
        
    }
}