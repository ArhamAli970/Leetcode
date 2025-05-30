class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {

        Queue<int[]> q=new LinkedList<>();
        int vis[]=new int[edges.length];
        q.add(new int[]{node1,1});
        q.add(new int[]{node2,2});

        int ans=Integer.MAX_VALUE;
        

        while(!q.isEmpty()){
            int sz=q.size();
            for(int i=0;i<sz;i++){
                int[] curr=q.remove();
                int ed=curr[0];
                if(vis[ed]==0){vis[ed]=curr[1];}
                else{
                    if(vis[ed]!=curr[1]){
                        if(ed<ans){ans=ed;}
                    }
                    continue;
                }

                if(edges[ed]!=-1){
                    q.add(new int[]{edges[ed],curr[1]});
                }

            }
            if(ans!=Integer.MAX_VALUE){return ans;}
        }


        return -1;


        
    }
}