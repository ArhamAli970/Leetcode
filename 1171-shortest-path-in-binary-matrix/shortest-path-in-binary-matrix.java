class Solution { 
    class node{ 
        int i;
        int j;
        node(int i,int j){ 
            this.i=i;
            this.j=j;
        }

    }
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        if(grid[0][0]==1 || grid[n-1][n-1]==1){return -1;}
        int [][]mat= new int[n][n];
        boolean[][] bool= new boolean[n][n];

        mat[0][0]=1;
        Queue<node> q=new LinkedList<>();

        q.add(new node(0,0)); 


        while(!q.isEmpty()){ 
int size=q.size();
for(int k=0;k<size;k++){
node curr=q.remove();
int i=curr.i;
int j=curr.j;
int val=mat[i][j];
bool[i][j]=true;

if(i-1>=0 && j-1>=0 && grid[i-1][j-1]==0 && !bool[i-1][j-1]){ 
    if(mat[i-1][j-1]!=0){
        mat[i-1][j-1]=Math.min(val+1,mat[i-1][j-1]);
        }
        else{ 
            mat[i-1][j-1]=val+1;
            q.add(new node(i-1,j-1));
        }
}

if(i-1>=0 && grid[i-1][j]==0 && !bool[i-1][j]){ 
    if(mat[i-1][j]!=0){
        mat[i-1][j]=Math.min(val+1,mat[i-1][j]);
        }
        else{ 
            mat[i-1][j]=val+1;
            q.add(new node(i-1,j));
        }
}


if(i-1>=0 && j+1<n && grid[i-1][j+1]==0 && !bool[i-1][j+1]){ 
    if(mat[i-1][j+1]!=0){
        mat[i-1][j+1]=Math.min(val+1,mat[i-1][j+1]);
        }
        else{ 
            mat[i-1][j+1]=val+1;
            q.add(new node(i-1,j+1));
        }
}





if(j+1<n && grid[i][j+1]==0 && !bool[i][j+1]){ 
    if(mat[i][j+1]!=0){
        mat[i][j+1]=Math.min(val+1,mat[i][j+1]);
        }
        else{ 
            mat[i][j+1]=val+1;
            q.add(new node(i,j+1));
        }
}


if(j-1>=0 && grid[i][j-1]==0 && !bool[i][j-1]){ 
    if(mat[i][j-1]!=0){
        mat[i][j-1]=Math.min(val+1,mat[i][j-1]);
        }
        else{ 
            mat[i][j-1]=val+1;
            q.add(new node(i,j-1));
        }
}



if(i+1<n && j-1>=0 && grid[i+1][j-1]==0 && !bool[i+1][j-1]){ 
    if(mat[i+1][j-1]!=0){
        mat[i+1][j-1]=Math.min(val+1,mat[i+1][j-1]);
        }
        else{ 
            mat[i+1][j-1]=val+1;
            q.add(new node(i+1,j-1));
        }
}


if(i+1<n  && grid[i+1][j]==0 && !bool[i+1][j]){ 
    if(mat[i+1][j]!=0){
        mat[i+1][j]=Math.min(val+1,mat[i+1][j]);
        }
        else{ 
            mat[i+1][j]=val+1;
            q.add(new node(i+1,j));
        }
}


if(i+1<n && j+1<n && grid[i+1][j+1]==0 && !bool[i+1][j+1]){ 
    if(mat[i+1][j+1]!=0){
        mat[i+1][j+1]=Math.min(val+1,mat[i+1][j+1]);
        }
        else{ 
            mat[i+1][j+1]=val+1;
            q.add(new node(i+1,j+1));
        }
}







}
 
        }

        

return mat[n-1][n-1]==0?-1:mat[n-1][n-1];
    }
}