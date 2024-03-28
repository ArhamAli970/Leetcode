class Solution {
    public int maxSubarrayLength(int[] arr, int k) {
        
        int i=0,j=0,n=arr.length;
        int max=0;
        HashMap<Integer,Integer> mp= new HashMap<>();

        while(j<n){

            while(j<n && (!mp.containsKey(arr[j]) || mp.get(arr[j])<k)){
                mp.put(arr[j],mp.getOrDefault(arr[j],0)+1);
                j++;
            }
            max=Math.max(j-i,max);
            if(j==n){break;}
            while(mp.get(arr[j])==k){
                int val=mp.get(arr[i]);
                // if(val==1){mp.remove(arr[i]); continue;}
                mp.put(arr[i],val-1);
                i++;
            }



        }

        return max;

    }
}