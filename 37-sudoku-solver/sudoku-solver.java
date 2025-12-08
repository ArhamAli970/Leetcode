class Solution {
    static int n,m;
    public static boolean chk(int i,int j,char board[][],char ck){
        for(int l=0;l<9;l++){
            if(board[l][j]==ck){return false;}
        }
        for(int l=0;l<9;l++){
            if(board[i][l]==ck){return false;}
        }
        int f=(i/3)*3;
        int g=(j/3)*3;
        for(int l=f;l<f+3;l++){
            for(int k=g;k<g+3;k++){
                if(board[l][k]==ck){return false;}
            }
        }

        return true;
    }
    public static boolean call(int i,int j,char board[][]){
        boolean ans=false;
        if(board[i][j]!='.'){
            if(i==n-1 && j==m-1){return true;}
            else if(j+1<m){ans|=call(i,j+1,board);}
            else if(i+1<n){ans|=call(i+1,0,board);}
        }else{
        for(int k=1;k<=9;k++){
            char ck=(char)(k+'0');
            if(!chk(i,j,board,ck)){continue;}
            board[i][j]=ck;
            if(i==n-1 && j==m-1){return true;}
            if(j+1<m){ans|=call(i,j+1,board);}
            else if(i+1<n){ans|=call(i+1,0,board);
            if(ans){return true;}
            }
        }
         if(!ans){board[i][j]='.';}
        }
       
        return ans;
    }
    public void solveSudoku(char[][] board) {
        n=board.length;
        m=board[0].length;
        call(0,0,board);
    }
}