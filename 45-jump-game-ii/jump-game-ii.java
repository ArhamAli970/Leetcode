class Solution {
    public int jump(int[] nums) {
        if(nums.length==1){return 0;}
        int jump=1,max=nums[0],maxCurr=0;

        for(int i=1;i<nums.length;i++){
            if(i>max){
                jump++;
                max=maxCurr;
                maxCurr=i+nums[i];
            }else{
                maxCurr=Math.max(maxCurr,i+nums[i]);
            }
        }

        return jump;

    }
}