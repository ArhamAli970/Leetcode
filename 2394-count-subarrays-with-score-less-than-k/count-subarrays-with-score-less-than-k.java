class Solution {
    public long countSubarrays(int[] nums, long k) {
        
        long cnt=0,sum=0;
        int j=0,i=0,n=nums.length;
        
        for( j=0;j<n;j++){
            sum+=nums[j];
            int len=j-i+1;
            while(sum*len>=k){
                cnt+=(j-i);
                sum-=nums[i++];
                len--;
            }
        }
        long l=j-i;
        cnt+= ((l*(l+1))/2);
        
        return cnt;
        
    }
}