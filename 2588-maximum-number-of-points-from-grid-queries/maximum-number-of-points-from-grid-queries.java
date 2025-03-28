class Solution {
    static class node implements Comparable<node>{
        int i,j,val;
        node(int i,int j,int val){
            this.i=i;
            this.j=j;
            this.val=val;
        }
        public int compareTo(node p2){
            return this.val-p2.val;
        }
    }
    public int[] maxPoints(int[][] grid, int[] queries) {
        PriorityQueue<node> pq=new PriorityQueue<>();
        PriorityQueue<Integer> values=new PriorityQueue<>();
        for(int i:queries){values.add(i);} 
        int cnt=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        int n=grid.length,m=grid[0].length;
        boolean vis[][]=new boolean[n][m];
        
        pq.add(new node(0,0,grid[0][0]));
        int dir[][]={{-1,0},{0,1},{1,0},{0,-1}};
        vis[0][0]=true;

        while(!pq.isEmpty()){
            node curr=pq.remove();
            int i=curr.i,j=curr.j;
            while(!values.isEmpty() && values.peek()<=curr.val){
                int now=values.remove();
                mp.put(now,cnt);
            }
            cnt++;
            for(int k=0;k<4;k++){
                int x=dir[k][0],y=dir[k][1];
                if(i+x<0 || j+y<0 || i+x>=n || j+y>=m || vis[i+x][j+y]){continue;}
                vis[i+x][j+y]=true;
                pq.add(new node(i+x,j+y,grid[i+x][j+y]));
            }
        }

        int tot=n*m;
        for(int i=0;i<queries.length;i++){
            queries[i]=mp.containsKey(queries[i])?mp.get(queries[i]):tot;
        }

        return queries;



    }
}