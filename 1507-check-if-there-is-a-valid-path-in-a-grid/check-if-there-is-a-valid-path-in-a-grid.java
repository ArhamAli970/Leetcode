class Solution {
    public static boolean  chk(int grid[][],int i,int j){ 
        if(i==grid.length-1 && j== grid[0].length-1){return true;}
        return false;
    }
    public static boolean call(int x,int y,int i,int j,int grid[][]){  
        
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==-1 ){ 
            return false;
        }
      

        if(grid[i][j]==1 &&((i==x && j-1==y) || (i==x && j+1==y) || (x==-1 && y==-1)) ){
              grid[i][j]=-1;
              if(chk(grid,i,j)){return true;}
            return call(i,j,i,j+1,grid) || call(i,j,i,j-1,grid);
        }
        else if(grid[i][j]==2 && ((i-1==x && j==y)  || (i+1==x && j==y)|| (x==-1 && y==-1) )){ 
              grid[i][j]=-1;if(chk(grid,i,j)){return true;}
            return call(i,j,i-1,j,grid) || call(i,j,i+1,j,grid); 
        }
        else if(grid[i][j]==3 && ((i==x && j-1==y) || (i+1==x && j==y) || (x==-1 && y==-1))){ 
              grid[i][j]=-1;if(chk(grid,i,j)){return true;}
             return call(i,j,i,j-1,grid) || call(i,j,i+1,j,grid);
        }  
        else if(grid[i][j]==4 && ( (i+1==x && j==y) || (i==x && j+1==y) ||( x==-1 && y==-1))  ){ 
              grid[i][j]=-1;if(chk(grid,i,j)){return true;}
              return call(i,j,i,j+1,grid) || call(i,j,i+1,j,grid);
        }
        else if(grid[i][j]==5 && ( ( i==x && j-1==y)|| ( i-1==x && j==y ) || (x==-1 && y==-1))){ 
              grid[i][j]=-1;if(chk(grid,i,j)){return true;}
              return call(i,j,i,j-1,grid) || call(i,j,i-1,j,grid);
        }
        else if(grid[i][j]==6 && ( ( i==x && j+1==y) || ( i-1==x && j==y ) || (x==-1 && y==-1))){
              grid[i][j]=-1;if(chk(grid,i,j)){return true;}
                return call(i,j,i,j+1,grid) || call(i,j,i-1,j,grid);

        }

        return false;
    


    }

    public boolean hasValidPath(int[][] grid) {
        
        return call(-1,-1,0,0,grid);
        
    }
}