class Solution {

public static boolean chk(int mat[][],int i,int j){ 
     int n=mat.length,m=mat[0].length;   
    for(int idx=0;idx<n;idx++){ 
        if(idx==i){continue;}
        else if(mat[idx][j]!=0){return false;}
    }
     for(int idx=0;idx<m;idx++){ 
        if(idx==j){continue;}
        else if(mat[i][idx]!=0){return false;}
    }

    return true;
    
    
}

    public int numSpecial(int[][] mat) {
     int n=mat.length,m=mat[0].length,cnt=0;   

        for(int i=0;i<n;i++){ 

           for(int j=0;j<m;j++){ 
if(mat[i][j]==0){continue;}
               cnt+=chk(mat,i,j)?1:0;

           }

        }


        return cnt;

    }
}