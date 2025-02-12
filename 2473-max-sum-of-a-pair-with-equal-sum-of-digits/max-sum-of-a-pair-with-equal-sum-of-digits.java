class Solution {
    public static int call(int val){
        int sm=0;
        while(val>0){
            sm+=val%10;
            val/=10;
        }
        return sm;
    }
    public int maximumSum(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int max=-1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int sm=call(nums[i]);
            if(mp.containsKey(sm)){
                max=Math.max(nums[i]+mp.get(sm),max);
                mp.put(sm,Math.max(mp.get(sm),nums[i]));
            }else{
                mp.put(sm,nums[i]);
            }
        }

        return max;
        
    }
}