class Solution {
    public int longestArithSeqLength(int[] nums) {

        HashMap<Integer,HashMap<Integer,Integer> > mp= new HashMap<>();

mp.put(0,new HashMap<>());
int max=1,n=nums.length;

        for(int i=1;i<n;i++){
               mp.put(i,new HashMap<>());
               for(int j=i-1;j>=0;j--){
                    
                    int diff=nums[j]-nums[i];

                if(!mp.get(i).containsKey(diff)){
                    if(mp.get(j).containsKey(diff)){
                        int val=mp.get(j).get(diff);
                        mp.get(i).put(diff,val+1);
                       
                    }else{
                        mp.get(i).put(diff,1);
                    }}
                
                max=Math.max(max, mp.get(i).get(diff));
               }

        }

        return max+1;
        
    }
}