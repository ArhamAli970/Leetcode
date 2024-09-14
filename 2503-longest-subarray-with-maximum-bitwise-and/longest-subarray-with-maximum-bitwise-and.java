class Solution {
    public int longestSubarray(int[] nums) {
int max=0;
        for(int i:nums){
            max=Math.max(i,max);
        }

        int ans=0,cnt=0;

        for(int i:nums){
            if(i==max){cnt++;}
            else{
                ans=Math.max(ans,cnt);
                cnt=0;
            }
        }

        ans=Math.max(ans,cnt);
        return ans;
        
    }
}