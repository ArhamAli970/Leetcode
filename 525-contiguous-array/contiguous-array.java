class Solution {
    public int findMaxLength(int[] nums) {

        HashMap<Integer,Integer> mp=new HashMap<>();
        int cnt1=0,cnt0=0,max=0;

        mp.put(0,-1);

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){cnt0++;}
            else{cnt1++;}
            
            if(mp.containsKey(cnt0-cnt1)){
                max=Math.max(i-mp.get(cnt0-cnt1),max);

            }else{
                mp.put(cnt0-cnt1,i);
            }
        }

        return max;
        
    }
}