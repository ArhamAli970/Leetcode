class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int tot=0,n=nums.length;
        for(int i:nums){tot^=i;}
        int ans[]=new int[n];
        int pref=(int)Math.pow(2,maximumBit)-1;

        for(int i=0;i<n;i++){
            ans[i]=tot^pref ;
            tot^=nums[n-i-1];
        }

return ans;
    }
}