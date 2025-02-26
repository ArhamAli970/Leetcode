class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int neg=0,pos=0,max=0;

        for(int i=0;i<nums.length;i++){
            neg+=nums[i];
            pos+=nums[i];
            max=Math.max(max,Math.max(Math.abs(neg),pos));
            if(neg>0){neg=0;}
            if(pos<0){pos=0;}

        }

        return max;
        
    }
}