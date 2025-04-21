class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        int l=lower,h=upper;
        for(int val:differences){
            if(val<0){
                if(l+val<lower && h+val<lower){return 0;}
                l=Math.max(l+val,lower);
                h=Math.max(h+val,lower);
               
            }else{
                if(l+val>upper && h+val>upper){return 0;}
                l=Math.min(l+val,upper);
                h=Math.min(h+val,upper);
                
            }
        }

        return h-l+1;
        
    }
}