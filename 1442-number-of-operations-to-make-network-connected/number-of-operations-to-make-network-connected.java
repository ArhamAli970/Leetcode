class Solution {
    static boolean vis[];

    public static void dfs(int i, ArrayList<Integer> [] arr){
        vis[i]=true;

        for(int j=0;j<arr[i].size();j++){
            if(!vis[arr[i].get(j)]){
                  dfs(arr[i].get(j),arr);
            }
        }
        
    }


    public int makeConnected(int n, int[][] connections) {
        if(connections.length<n-1){return -1;}
        int cnt=0;

        ArrayList<Integer> [] arr= new ArrayList[n];
        for(int i=0;i<n;i++){
            arr[i]=new ArrayList<>();
        }

        for(int i=0;i<connections.length;i++){
            arr[connections[i][0]].add(connections[i][1]);
            arr[connections[i][1]].add(connections[i][0]);
        }

        vis= new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                cnt++;
                dfs(i,arr);
            }
        }

        return cnt-1;
    }
}