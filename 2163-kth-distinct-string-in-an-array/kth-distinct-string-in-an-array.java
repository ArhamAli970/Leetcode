class Solution {
    public String kthDistinct(String[] arr, int k) {
        int n=arr.length;
        int cnt=0;
        HashMap<String,Integer> mp= new HashMap<>();
        
        for(int i=0;i<n;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }

        for(int i=0;i<n;i++){
            if(mp.get(arr[i])==1){
                --k;
                if(k==0){return arr[i];}
            }
        }

        return "";
        
    }
}