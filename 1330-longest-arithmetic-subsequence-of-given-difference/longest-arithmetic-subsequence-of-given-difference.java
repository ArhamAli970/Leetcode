class Solution {
    public int longestSubsequence(int[] arr, int diff) {

        HashMap<Integer,Integer> mp= new HashMap<>();
        int max=0;

        for(int i=0;i<arr.length;i++){
          mp.put(arr[i],mp.getOrDefault(arr[i]-diff,0)+1);
          max=Math.max(mp.get(arr[i]),max);
        }

        return max;




        
    }
}