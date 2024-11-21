class Solution {
    public int add(int pre[][],int mat[][],int i,int j,int psum){
               if(mat[i][j]==1){return psum;}
               if(pre[i][j]==-1){psum=-1;}
               if(pre[i][j]==1){psum=1;} 
               if(pre[i][j]==1 || pre[i][j]==-1){return psum;}
               mat[i][j]=psum==-1 || psum==0?0:1;
               return psum;

    }
    public int countUnguarded(int n, int m, int[][] guards, int[][] walls) {

        int pre[][]=new int[n][m];

        for(int i=0;i<guards.length;i++){
            int l1=guards[i][0],l2=guards[i][1];
            pre[l1][l2]=1;
        }
         for(int i=0;i<walls.length;i++){
            int l1=walls[i][0],l2=walls[i][1];
            pre[l1][l2]=-1;
        }

        int cnt=0;
        int mat[][]=new int[n][m];

        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++){
               sum=add(pre,mat,i,j,sum);
            }
            sum=0;

             for(int j=m-1;j>=0;j--){
            sum=add(pre,mat,i,j,sum);
            }
        }

        for(int j=0;j<m;j++){
            int sum=0;
            for(int i=0;i<n;i++){
            sum=add(pre,mat,i,j,sum);
            }
            sum=0;

             for(int i=n-1;i>=0;i--){
            sum=add(pre,mat,i,j,sum);
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0 && (pre[i][j]!=1 && pre[i][j]!=-1)){cnt++;}
            }
        }

        return cnt;
        
    }
}