class Solution {
    static ArrayList<Integer> arr[];
    static List<List<Integer>> ans;

    public static int dfs(int curr,int par,int time,boolean vis[],int time_node[]){
        vis[curr]=true;
        int c_time=time;
        time_node[curr]=time;
        int cnt=0;
        for(int j=0;j<arr[curr].size();j++){
            int ed=arr[curr].get(j);
            if(par==ed){continue;}
            else if(vis[ed]){
                time_node[curr]=Math.min(time_node[ed],time_node[curr]);
            }
            else{
                int ed_time=dfs(ed,curr,time+1,vis,time_node);
                if(ed_time>time){
                    ans.add(new ArrayList<>());
                    ans.get(ans.size()-1).add(ed);
                    ans.get(ans.size()-1).add(curr);
                }
                time_node[curr]=Math.min(time_node[ed],time_node[curr]);
            }
        }

        return time_node[curr];
    }
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        arr=new ArrayList[n];
        ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr[i]=new ArrayList<>();
        }
        for(int i=0;i<connections.size();i++){
            int e1=connections.get(i).get(0);
            int e2=connections.get(i).get(1);
            arr[e1].add(e2);
            arr[e2].add(e1);
        }

        boolean vis[]=new boolean[n];
        dfs(0,-1,0,vis,new int[n]);
        return ans;


    }
}