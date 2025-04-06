class Solution {
static int n;
static int arr[][]={{-1,0},{0,1},{0,-1},{1,0}};
public static void dfs(int i,int j,int grid[][]){
    if(i<0 || j<0 ||i>=n || j>=n || grid[i][j]==2 || grid[i][j]==0){return;}
    grid[i][j]=2;
    for(int k=0;k<4;k++){
        dfs(i+arr[k][0],j+arr[k][1],grid);
    }
}
    public int shortestBridge(int[][] grid) {
        n=grid.length;
        // arr={{-1,0},{0,1},{0,-1},{1,0}};
        int cnt=0;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0 || grid[i][j]==2){continue;}
                if(cnt==0){
                    dfs(i,j,grid);
                    cnt++;
                }else{
                    q.add(new int[]{i,j});
                }
            }
        }

        cnt=0;
        while(!q.isEmpty()){
            int sz=q.size();
            for(int k=0;k<sz;k++){
                int[] sx=q.remove();
                for(int i=0;i<4;i++){
                    int x=arr[i][0],y=arr[i][1];
                    if(x+sx[0]<0 || y+sx[1]<0 || x+sx[0]>=n || y+sx[1]>=n || grid[x+sx[0]][y+sx[1]]==grid[sx[0]][sx[1]]){continue;}
                    if(grid[x+sx[0]][y+sx[1]]==2){return cnt;}
                    grid[x+sx[0]][y+sx[1]]=1;
                    q.add(new int[]{x+sx[0],y+sx[1]});
                }
            }
            cnt++;
        }

        return cnt;


    }
}