class Solution {
    public int minOperations(int[] nums, int k) {

        int n=nums.length,min=101;
        boolean cnt[]=new boolean[101];
        for(int i=0;i<n;i++){
            cnt[nums[i]]=true;
            min=Math.min(nums[i],min);
        }

        if(min<k){return -1;}
        int c=0;
        for(int i=100;i>=0;i--){
            if(cnt[i]){c++;}
            if(i==k && cnt[i]){c--;}
        }

        return c;

        
    }
}