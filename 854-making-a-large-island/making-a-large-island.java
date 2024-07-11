class Solution {
    static int n,m,cnt,xp,yp;
    static int[][][] par;
    static HashSet<ArrayList<Integer>> h;

public static int call(int i,int j,int grid[][]){ 
if(i<0 || j<0 || i==grid.length || j==grid[0].length || grid[i][j]==0 ){ 
    return 0;
}

par[i][j][0]=xp;
par[i][j][1]=yp;

grid[i][j]=0;
int s= call(i-1,j,grid)+call(i+1,j,grid)+call(i,j-1,grid)+call(i,j+1,grid)+1; 
return s;

}

    public int largestIsland(int[][] grid) {
        n=grid.length;
        m=grid[0].length;
        int arr[][]={{1,0},{0,1},{-1,0},{0,-1}};

        par=new int[n][m][2];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                par[i][j][0]=-1;
                par[i][j][1]=-1;
            }
        }
        
        int max=0;
        

        for(int i=0;i<n;i++){
            
            for(int j=0;j<m;j++){
                
                if(grid[i][j]==1){
                    xp=i;yp=j;
                    grid[i][j]=call(i,j,grid);
                    max=Math.max(grid[i][j],max);
                }

                
            }
            
        }




        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(par[i][j][0]==-1){
                    int sum=0;
                    h=new HashSet<>();

                    for(int k=0;k<4;k++){
                        sum+=getPar(i+arr[k][0],j+arr[k][1],grid);
                    }

                    max=Math.max(sum+1,max);


                }
            }
        }
    

    return max;
        
    
    }

    public static int getPar(int i,int j,int grid[][]){
       

        if(i<0 || j<0 || i>=n || j>=m || par[i][j][0]==-1){
            return 0;
        }

        int x=par[i][j][0];
        int y=par[i][j][1];
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(x);
        arr.add(y);

        if(h.contains(arr)){return 0;}

        h.add(arr);

        return grid[x][y];

    }

}