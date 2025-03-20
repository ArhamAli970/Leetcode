class Solution {
    static int n,m;
    public static void call(int heights[][],int ans[][],int l1,int l2){
        Queue<int[]>q =new LinkedList<>();
        boolean vis[][]=new boolean[n][m];
        int dir[][]={{0,1},{0,-1},{1,0},{-1,0}};
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(j==l2 || i==l1){
                    ans[i][j]+=1;
                    q.add(new int[]{i,j});
                    vis[i][j]=true;
                }
            }
        }


         while(!q.isEmpty()){
            int curr[]=q.remove();
            int x=curr[0],y=curr[1];
            for(int i=0;i<4;i++){
                int lft=dir[i][0],rht=dir[i][1];
                if(x+lft<0 || x+lft>=n || y+rht<0 || y+rht>=m || vis[x+lft][y+rht] || heights[x][y]>heights[x+lft][y+rht]){continue;}
                vis[x+lft][y+rht]=true;
                ans[x+lft][y+rht]+=1;
                q.add(new int[]{x+lft,y+rht});
                
            }   
        }

    }

    public List<List<Integer>> pacificAtlantic(int[][] heights) {

       
        n=heights.length;m=heights[0].length;
        int ans[][]=new int[n][m];
 
       
        call(heights,ans,0,0);
        call(heights,ans,n-1,m-1);
       


        List<List<Integer>> fina=new ArrayList<>();


        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(ans[i][j]>1){
                    fina.add(new ArrayList<>());
                    fina.get(fina.size()-1).add(i);
                    fina.get(fina.size()-1).add(j);
                }
            }
        }


        return fina;






        
    }
}