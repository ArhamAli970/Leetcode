class Solution {
    public int numberOfSubarrays(int[] nums, int k) {

        int cnt=0,ans=0;
        
        HashMap<Integer,Integer> mp=new HashMap<>();
mp.put(0,1);
        for(int i:nums){
            if(i%2!=0){cnt++;}
            if(mp.containsKey(cnt-k)){ans+=mp.get(cnt-k);}
            mp.put(cnt,mp.getOrDefault(cnt,0)+1);
        }

        return ans;
        
    }
}