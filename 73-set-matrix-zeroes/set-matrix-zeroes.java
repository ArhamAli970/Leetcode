class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length,m=matrix[0].length;

       boolean zeroRow=false;

        for(int i=0;i<n;i++){ 
            for(int j=0;j<m;j++){ 
                if(j==0 && matrix[i][j]==0){zeroRow=true;}
                else if(matrix[i][j]==0){
                      matrix[0][j]=0;
                      matrix[i][0]=0;
                    //   if(j==0){}
                }
            }
        }


        for(int j=1;j<m;j++){ 
           if(matrix[0][j]==0){
               for(int i=0;i<n;i++){
                  matrix[i][j]=0;
               }
           }
        }

        for(int i=0;i<n;i++){
            if(matrix[i][0]==0 ){
                for(int j=0;j<m;j++){
                    matrix[i][j]=0;
                }
            }
        }

        if(zeroRow){
            for(int i=0;i<n;i++){
                matrix[i][0]=0;
            }
        }
        
    }
}