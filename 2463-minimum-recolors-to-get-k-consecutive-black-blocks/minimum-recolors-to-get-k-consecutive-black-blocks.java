class Solution {
    public int minimumRecolors(String blocks, int k) {

        int c=0,i=0,min=Integer.MAX_VALUE;

        for(int j=0;j<blocks.length();j++){
            if(blocks.charAt(j)=='W'){c++;}
            if(j>=k){
                if(blocks.charAt(i)=='W'){c--;}
                i++;
            }
            if(j>=k-1){min=Math.min(c,min);}
        }

        return min;
        
    }
}