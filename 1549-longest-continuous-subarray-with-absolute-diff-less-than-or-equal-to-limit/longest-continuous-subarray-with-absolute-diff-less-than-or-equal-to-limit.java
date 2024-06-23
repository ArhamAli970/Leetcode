class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int i=0, j=0,n=nums.length,max=1;
        TreeMap<Integer,Integer> mp= new TreeMap<>();


        for(i=0;i<n;i++){
            max=Math.max(i-j,max);
            while( !mp.isEmpty() && (Math.abs(mp.lastKey()-nums[i])>limit || Math.abs(mp.firstKey()-nums[i])>limit)){
                int freq=mp.get(nums[j]);
                mp.put(nums[j],freq-1);
                if(freq==1){mp.remove(nums[j]);}
                j++;
            }
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }

max=Math.max(i-j,max);

        return max;

        
    }
}