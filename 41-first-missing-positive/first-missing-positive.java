class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<0){nums[i]=0;}
        }

        for(int i=0;i<n;i++){
            int ele=Math.abs(nums[i])-1;
            if(ele!=-1 && ele<n)
            if(nums[ele]>0){
                nums[ele]=0-nums[ele];
            }else if (nums[ele]==0){
                nums[ele]=0-Math.abs(nums[i]);
            }
        }

        for (int i=0;i<n;i++){
            if(nums[i]>=0){return i+1;}
        }
        return n+1;
    }
}