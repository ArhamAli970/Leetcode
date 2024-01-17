class Solution {
   
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int suff[]= new int[n];
        int pre[]= new int[n];
        int dist=1;

        for(int i=0;i<n;i++){ 
         pre[i]=dist;
         if(nums[i]==0){dist=1;}
         else{++dist;}   
        }

        dist=1;
        for(int i=n-1;i>=0;i--){
            suff[i]=dist;
            if(nums[i]==0){dist=1;}
            else{++dist;}
        }

        int max=0;

        for(int i=0;i<n;i++){ 
        
                max=Math.max(max,pre[i]+suff[i]-2);
        

        }

        return max;

        
    }
}