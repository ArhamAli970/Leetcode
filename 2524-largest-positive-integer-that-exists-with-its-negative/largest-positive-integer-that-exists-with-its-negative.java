class Solution {
    public int findMaxK(int[] nums) {
        
        HashSet<Integer> h= new HashSet<>();

        for(int i:nums){
            if(i<0){h.add(i);}
        }
        int max=-1;

        for(int i:nums){
            if(i>0 && h.contains(0-i)){
                max=Math.max(i,max);
            }
        }

        return max;

    }
}