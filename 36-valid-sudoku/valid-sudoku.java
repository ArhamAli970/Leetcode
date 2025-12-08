class Solution {
   
    public boolean isValidSudoku(char[][] board) {
    
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                for(int l=0;l<9;l++){
                    if(l!=i && board[l][j]==board[i][j]){return false;}
                }
                for(int l=0;l<9;l++){
                    if(l!=j && board[i][l]==board[i][j]){return false;}
                }
                int f=(i/3)*3;
                int g=(j/3)*3;
                for(int l=f;l<f+3;l++){
                    for(int k=g;k<g+3;k++){
                        if(l!=i && j!=k && board[l][k]==board[i][j]){return false;}
                    }
                }

                }
            }
        }

        return true;
    }
}