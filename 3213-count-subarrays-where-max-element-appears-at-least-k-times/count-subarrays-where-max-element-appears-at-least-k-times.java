class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max=0,n=nums.length;
        for(int i:nums){max=Math.max(i,max);}
       long cnt=0; 
       int i=0;
       for(int j=0;j<n;j++){
          if(nums[j]==max){k--;}
          while(k==0){
            cnt+=n-j;
            k+=nums[i]==max?1:0;
            i++;
          }
       }

       return cnt;

    }
}