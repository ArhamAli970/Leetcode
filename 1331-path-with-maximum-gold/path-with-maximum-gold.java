class Solution {


public static void dfs(int i,int j,int grid[][],int[] maxgold,int gold){  

if(i<0 || j<0 || i==grid.length || j== grid[0].length|| grid[i][j]==0){  
  if(maxgold[0]<gold){ 
    maxgold[0]=gold;
  }
  return ;
}

gold+=grid[i][j];
int val= grid[i][j];
grid[i][j]=0;
    dfs(i,j+1,grid,maxgold,gold);
  dfs(i,j-1,grid,maxgold,gold);
    dfs(i+1,j,grid,maxgold,gold);
  dfs(i-1,j,grid,maxgold,gold);  
 

    gold-=grid[i][j]; 
    grid[i][j]=val;

  }



    public int getMaximumGold(int[][] grid) { 

   int maxgold[]= new int[1];

//  ArrayList<Integer> arr= new ArrayList<>();


 for(int i=0;i<grid.length;i++){ 

  for (int j=0;j<grid[0].length;j++){ 

   if(grid[i][j]!=0){ 
    dfs(i,j,grid,maxgold,0);
   }

  }

 }
 return maxgold[0];      
    }
}