class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> h=new HashSet<>();
        HashMap<Integer,Integer> mp=new HashMap<>();
        int max=0;

        for(int i:nums){
            h.add(i);
        }

        for(int i=0;i<nums.length;i++){
            int ele=nums[i];
            while(h.contains(ele)){
                h.remove(ele);
                ele++;
            }

            mp.put(nums[i],mp.getOrDefault(ele,0)+(ele-nums[i]));
            max=Math.max(mp.get(nums[i]),max);
        }

        return max;

        
    }
}