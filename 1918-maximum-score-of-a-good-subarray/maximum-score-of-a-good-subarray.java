class Solution {
    public int maximumScore(int[] mat, int k) {
        

        int i=k,j=k,n=mat.length;
        int max=mat[k],min=mat[k];

        while(i>=0 || j<=n-1){ 
            
            if( j+1==n ||(i-1>=0 && mat[i-1]>mat[j+1]) ){ 
                i--; if(i<0){break;}
                min=Math.min(min,mat[i]);
            }
            else if( (i-1)<0 || (j+1<n && mat[j+1]>=mat[i-1])){ 
                j++; if(j>=n){break;}
                min=Math.min(min,mat[j]);
            }
 max=Math.max(max,(j-i+1)*min);
        }

        return max;


    }
}