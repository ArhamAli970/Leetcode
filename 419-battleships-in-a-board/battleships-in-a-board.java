class Solution {
    public int countBattleships(char[][] board) {
        
        int cnt=0,n=board.length,m=board[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='.'){continue;}
              if(i+1<n && board[i+1][j]=='X'){continue;}
              if(j+1<m && board[i][j+1]=='X'){continue;}
              cnt++; 

            }
        }

return cnt;
    }
}