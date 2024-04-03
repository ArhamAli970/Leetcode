class Solution {

    public static boolean call(char[][] board, String word,int idx,int i,int j){

        if(idx==word.length()){return true;}

        if(i==-1 || j==-1 || i==board.length || j==board[0].length || board[i][j]!=word.charAt(idx) || board[i][j]=='*'){
            return false;
        }

        



        char  ch= board[i][j];
        board[i][j]='*';

        boolean down =call(board,word,idx+1,i+1,j);
        boolean up =call(board,word,idx+1,i-1,j);
        boolean left =call(board,word,idx+1,i,j+1);
        boolean right =call(board,word,idx+1,i,j-1);


                board[i][j]=ch;


        if(down || up || left || right){return true;}



return false;
    }

    public boolean exist(char[][] board, String word) {
        int n=board.length,m=board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==word.charAt(0)){
                    if(call(board,word,0,i,j)){return true;}
                }
            }
        }

        return false;
        
    }
}