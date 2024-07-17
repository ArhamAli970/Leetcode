class Solution {
    static class node{
        int src,clr;
        node(int src,int clr){
            this.src=src;
            this.clr=clr;
        }

    }
    static int ans[];
    static ArrayList<Integer> arr[];
    public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
        ArrayList<node> arr[]=new ArrayList[n];

        for(int i=0;i<n;i++){
            arr[i]=new ArrayList<>();
        }

        for(int i=0;i<redEdges.length;i++){
            int src=redEdges[i][0],dest=redEdges[i][1];
            arr[src].add(new node(dest,0));
        }

        for(int i=0;i<blueEdges.length;i++){
            int src=blueEdges[i][0],dest=blueEdges[i][1];
            arr[src].add(new node(dest,1));
        }

        Queue<node> q= new LinkedList<>();
        ans=new int[n];
        Arrays.fill(ans,-1);
        ans[0]=0;
        boolean vis[][]=new boolean[n][2];
        q.add(new node(0,-1));
        int cst=0;

        while(!q.isEmpty()){
            int sz=q.size();

            for(int i=0;i<sz;i++){

                node curr=q.remove();
                if(ans[curr.src]==-1){
                    ans[curr.src]=cst;
                }

                for(int j=0;j<arr[curr.src].size();j++){
                    node d=arr[curr.src].get(j);
                    if(!vis[d.src][d.clr] && d.clr!=curr.clr){
                        vis[d.src][d.clr]=true;
                        q.add(new node(d.src,d.clr));
                    }
                }

            }

            cst++;

        }


return ans;


    }
}