class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int cnt=0,lst=-1;
        for(int i=0;i<nums.length;i++){

            if(nums[i]==0){cnt++;}
            if(nums[i]==1){
                if(lst!=-1 && cnt<k){return false;}
                lst=1;
                cnt=0;
            }
        }


        return true;
        
    }
}