class Solution {


    public static int call(int ed,int[][] graph,boolean vis[],int dp[]){
        if(dp[ed]!=0){return dp[ed];}
        if(vis[ed]){return -1;}
        vis[ed]=true;
        int ck=1;
        for(int j=0;j<graph[ed].length;j++){
            ck=call(graph[ed][j],graph,vis,dp);
            if(ck==-1){break;}
        }        
        return dp[ed]=ck;
    }

    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n=graph.length;
        ArrayList<Integer> ans=new ArrayList<>();
        int dp[]=new int[n];
        boolean vis[]=new boolean[n];

        for(int i=0;i<n;i++){
            int chk=call(i,graph,vis,dp);
            if(chk==1){ans.add(i);}
        }

        return ans;

    }
}