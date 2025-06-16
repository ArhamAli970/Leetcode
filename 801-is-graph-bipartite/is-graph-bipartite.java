class Solution {
    public boolean isBipartite(int[][] graph) {
        Queue<Integer> q=new LinkedList<>();
        int vis[]=new int[graph.length];
        Arrays.fill(vis,-1);



        for(int k=0;k<graph.length;k++){
        if(vis[k]!=-1){continue;}
        q.add(k);
        int currCol=0;
        vis[k]=currCol;
        while(!q.isEmpty()){
            int sz=q.size();
            for(int i=0;i<sz;i++){
                int curr=q.remove();
                for(int j=0;j<graph[curr].length;j++){
                    int ed=graph[curr][j];
                    if(vis[ed]==-1){
                        q.add(ed);
                        vis[ed]=currCol==0?1:0;
                    }else{
                        if(vis[ed]==currCol){return false;}
                    }
                }
            }
            currCol=currCol==0?1:0;
        }}
        return true;
    }
}