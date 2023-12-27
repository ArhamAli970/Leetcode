class Solution {
    static class node{ 
        int i, j;
        node(int i,int j){ 
            this.i=i;
            this.j=j;
        }
    }
    static Queue<node> q;
    static    boolean chk[][];
    public static void dfs(int i,int j,int grid[][],int val){ 
        if(i<0 || j<0 || i==grid.length || j==grid.length  ||  grid[i][j]!=1){
            return;
        }
        grid[i][j]=val;
        // chk[i][j]=true;
        q.add(new node(i,j));
        dfs(i+1,j,grid,val);
        dfs(i,j+1,grid,val);
        dfs(i,j-1,grid,val);
        dfs(i-1,j,grid,val);

    }

    public int shortestBridge(int[][] grid) {
        int n=grid.length;
        q=new LinkedList<>();
        // chk=new boolean[n][n];
        int done=-1;
        int val=-1;
        for(int i=0;i<n;i++){ 
            for(int j=0;j<n;j++){ 

                if(grid[i][j]==1){ 

                    dfs(i,j,grid,val); done=1; break;
                   
                }



            }
            if(done==1){break;}
    
        }

      

int cnt=0;
        while(!q.isEmpty()){ 

            int size=q.size();

            for(int k=0;k<size;k++){ 

                node curr=q.remove();
                int i=curr.i,j=curr.j;
                //   System.out.print(i+""+j+" ");

                if(grid[i][j]==1){return cnt-1;}
               

                // grid[i][j]=-1;

                if(i-1>=0 && grid[i-1][j]!=-1){
                    grid[i-1][j]=grid[i-1][j]==1?1:-1;
                    q.add(new node(i-1,j)); }
                if(j-1>=0 && grid[i][j-1]!=-1){
                     grid[i][j-1]=grid[i][j-1]==1?1:-1;
                    q.add(new node(i,j-1)); 
                    }
                if(i+1<n &&  grid[i+1][j]!=-1){
                     grid[i+1][j]=grid[i+1][j]==1?1:-1;
                    q.add(new node(i+1,j)); 
                    }
                if(j+1<n && grid[i][j+1]!=-1){
                     grid[i][j+1]=grid[i][j+1]==1?1:-1;
                    q.add(new node(i,j+1)); 
                    }


                

            }
            cnt++;

        }


return -1;


        
    }
}