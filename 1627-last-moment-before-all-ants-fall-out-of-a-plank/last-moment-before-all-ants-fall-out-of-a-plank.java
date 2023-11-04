class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
      
        int rightMin=Integer.MAX_VALUE,lftMax=Integer.MIN_VALUE;
        
        for(int i=0;i<right.length;i++){ 
             rightMin=Math.min( rightMin,right[i]);
        }

        for(int i=0;i<left.length;i++){ 
           lftMax=Math.max(lftMax,left[i]);
        }
        
        if(rightMin==Integer.MAX_VALUE && lftMax==Integer.MIN_VALUE){
            return 0;
        }

        else if(rightMin==Integer.MAX_VALUE){ 
            return lftMax;
        }

        else if(lftMax==Integer.MIN_VALUE){ 
            return n-rightMin;
        }



        return Math.max(n-rightMin,lftMax);
        
    }
}