class Solution {
    public int maxWidthRamp(int[] nums) {

        TreeMap<Integer,Integer> mp=new TreeMap<>();
        int maxWidth=0,maxNum=-1;

        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]>maxNum){
                maxNum=nums[i];
                mp.put(nums[i],i);
            }else{
                int idx=mp.get(mp.ceilingKey(nums[i]));
                maxWidth=Math.max(maxWidth,idx-i);
            }
        }

        return maxWidth;
        
    }
}