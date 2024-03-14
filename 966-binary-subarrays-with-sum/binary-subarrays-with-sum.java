class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> mp= new HashMap<>();
        mp.put(0,1);

        int cnt=0,sum=0;

        for(int i:nums){
             sum+=i;
            if(mp.containsKey(sum-goal)){
                cnt+=mp.get(sum-goal);
            }
            mp.put(sum,mp.getOrDefault(sum,0)+1);

        }


        return cnt;


    }
}