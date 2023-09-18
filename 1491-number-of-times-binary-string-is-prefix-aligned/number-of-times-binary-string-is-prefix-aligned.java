class Solution {
    public int numTimesAllBlue(int[] flips) {
     
        
        int cnt=0,max=0;
        HashSet<Integer> h= new HashSet<>();
        
        for(int i=0;i<flips.length;i++){ 
            h.add(flips[i]);
            max=Math.max(flips[i],max);
            if(h.size()==max){
                cnt++;
            }
            
        }
        
        return cnt;
        
        
    }
}