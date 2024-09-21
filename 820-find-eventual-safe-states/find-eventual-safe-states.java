class Solution {


    public static boolean call(int ed,int[][] graph,boolean vis[],int dp[]){
        if(vis[ed]){return false;}
        if(dp[ed]!=0){return dp[ed]==-1?false:true;}
        vis[ed]=true;
        int cNot=0;
        for(int j=0;j<graph[ed].length;j++){
            if(!call(graph[ed][j],graph,vis,dp)){
                cNot++;
            }
        }
        dp[ed]=cNot>=1?-1:1;
        vis[ed]=false;
        return dp[ed]==-1?false:true;
        

    }

    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n=graph.length;
        ArrayList<Integer> ans=new ArrayList<>();
        int dp[]=new int[n];

        for(int i=0;i<n;i++){
            boolean vis[]=new boolean[n];
            boolean chk=call(i,graph,vis,dp);
            if(chk){ans.add(i);}
    
        }

        return ans;

    }
}