class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
     int n= nums.length;
       int prefixSum=0,suffixSum=0;
     for(int i=0;i<n;i++){ 
         suffixSum+=nums[i];
     }

     int ans[]=new int[n];
  
     for(int i=0;i<n;i++){ 
         int diff= (nums[i]*i-prefixSum)+((suffixSum-nums[i])-nums[i]*(n-i-1));
         ans[i]=diff; 
         prefixSum+=nums[i];
         suffixSum-=nums[i];
     }

     return ans;

    }
}