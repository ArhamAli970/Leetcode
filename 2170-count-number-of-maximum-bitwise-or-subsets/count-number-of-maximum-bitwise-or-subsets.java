class Solution {
    static int cnt;
    public static void call(int nums[],int i,int ans,int max){
         if(i>=nums.length){ 
            if(ans==max){cnt++;}
            return;
            }
      

        call(nums,i+1,(ans|nums[i]),max);
        call(nums,i+1,ans,max);

    }
    public int countMaxOrSubsets(int[] nums) {
        int max=0;
        for(int i:nums){
            max=(max|i);
        }
        cnt=0;
        call(nums,0,0,max);
        return cnt;   
    }
}