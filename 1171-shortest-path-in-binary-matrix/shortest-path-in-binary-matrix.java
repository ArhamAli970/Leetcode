class Solution {
    static class node{ 
    int i,j;
    node(int i,int j){ 
    this.i=i;
    this.j=j;
    }
    }
    public int shortestPathBinaryMatrix(int[][] grid) {
         int n=grid.length;
        if(grid[0][0]==1 || grid[n-1][n-1]==1){return -1;}
        
        Queue<node> q= new LinkedList<>();
       
        
        int sp=0;
        q.add(new node(0,0));
        
        while(!q.isEmpty()){ 
            
            int size=q.size();
            
            for(int i=0;i<size;i++){ 
             node curr=q.remove();
             int x=curr.i,y=curr.j;
             if(x==n-1 && y==n-1){return sp+1;}
             
             if(x-1>=0 && grid[x-1][y]==0){ grid[x-1][y]=1; q.add(new node(x-1,y)); }
             if(y-1>=0 && grid[x][y-1]==0){ grid[x][y-1]=1; q.add(new node(x,y-1)); }
             if(x+1<n && grid[x+1][y]==0){ grid[x+1][y]=1; q.add(new node(x+1,y)); }
             if(y+1<n && grid[x][y+1]==0){ grid[x][y+1]=1; q.add(new node(x,y+1)); }  
             if(x-1>=0 && y-1>=0 && grid[x-1][y-1]==0){ grid[x-1][y-1]=1; q.add(new node(x-1,y-1));}
             if(x-1>=0 && y+1<n  && grid[x-1][y+1]==0){ grid[x-1][y+1]=1; q.add(new node(x-1,y+1)); }
             if(x+1<n && y+1<n && grid[x+1][y+1]==0){ grid[x+1][y+1]=1; q.add(new node(x+1,y+1)); }
             if(y-1>=0 && x+1<n  && grid[x+1][y-1]==0){ grid[x+1][y-1]=1; q.add(new node(x+1,y-1)); }
                
            
            }
            sp++;
        }
        
        return -1;
    }
}