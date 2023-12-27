class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        
        int n=time.length;
        for(int i=0;i<n;i++){ 
            time[i]=time[i]%60;
        }

        HashMap<Integer,Integer> mp= new HashMap<>();
        int pair=0;

        for(int i=0;i<n;i++){ 
            if(time[i]!=0 && mp.containsKey(60-time[i])){ 
                pair+=mp.get(60-time[i]);
            }else if(time[i]==0 && mp.containsKey(0)){
                 pair+=mp.get(0);
            }

            mp.put(time[i],mp.getOrDefault(time[i],0)+1);

        }


        return pair;


    }
}