class Solution {
    static int ans[];
    static ArrayList<Integer> arr[];

    public static boolean dfs(int curr,int par,boolean vis[],int pr){
        vis[curr]=true;

        for(int j=0;j<arr[curr].size();j++){
            int edge=arr[curr].get(j);
            if(edge!=par && edge==pr){return true;}
            else if(!vis[edge]){
                if(dfs(edge,curr,vis,pr)){return true;}
            }
        }


return false;



    }

    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;
        arr=new ArrayList[n+1];
        for(int i=0;i<=n;i++){
            arr[i]=new ArrayList<>();
        }
        for(int i[]:edges){
            arr[i[0]].add(i[1]);
            arr[i[1]].add(i[0]);
        }


        ans=new int[2];

        for(int i=0;i<n;i++){
            boolean vis[]=new boolean[n+1];
            vis[edges[i][0]]=true;
            if(dfs(edges[i][1],edges[i][0],vis,edges[i][0])){
                ans[0]=edges[i][0];
                ans[1]=edges[i][1];
            }
            

        }


        return ans;
        

    }
}