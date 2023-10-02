class Solution {
    public int maxSubarrays(int[] nums) {
      
      int tot=nums[0],n=nums.length;

      for(int i=0;i<n;i++){ 
          tot&=nums[i];
      }

      if(tot>0){return 1;}

// System.out.print(tot);
int ans=nums[0],cnt=0;
      for(int i=0;i<n;i++){ 

        ans&=nums[i];

        if(ans==0){ 
            cnt++;
            ans=i+1>=n?0:nums[i+1];
        }

      }
return cnt;
    }
}