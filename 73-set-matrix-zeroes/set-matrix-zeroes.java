class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length,m=matrix[0].length;

        boolean r1=false,c1=false;
       if(matrix[0][0]==0){r1=true;c1=true;}

       for(int j=1;j<m;j++){
          if(matrix[0][j]==0){r1=true;break;}
       }

       for(int i=1;i<n;i++){
          if(matrix[i][0]==0){c1=true;break;}
       }

        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }

        for(int j=1;j<m;j++){
            if(matrix[0][j]==0){
                for(int i=1;i<n;i++){
                    matrix[i][j]=0;
                }
            }
        }

        for(int i=1;i<n;i++){
            if(matrix[i][0]==0){
                for(int j=1;j<m;j++){
                    matrix[i][j]=0;
                }
            }
        }

        if(c1){
         
            for(int i=0;i<n;i++){
              matrix[i][0]=0;
           }
       
        }

        if(r1){
            for(int j=0;j<m;j++){
              matrix[0][j]=0;
           }
        }




    }
}