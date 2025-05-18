class Solution {
    static class node implements Comparable <node>{ 
         int i, j, h;
         node(int i,int j,int h){ 
             this.i=i;this.j=j;this.h=h;
         }

         @Override
         public int compareTo(node p){ 
             return this.h-p.h;
         }
    }
    public int minimumEffortPath(int[][] heights) {
        int n=heights.length,m=heights[0].length;
       PriorityQueue<node> pq= new PriorityQueue<>();
       pq.add(new node(0,0,0));
       

       int dir[][]={{-1,0},{0,1},{1,0},{0,-1}};
       boolean vis[][]=new boolean[n][m];
       vis[0][0]=true;
       while(!pq.isEmpty()){ 
           node curr=pq.remove();
           int x=curr.i,y=curr.j;
        //    if(vis[x][y]){continue;}
           if(x==n-1 && y==m-1){return curr.h;}
           int val=heights[x][y];
            vis[x][y]=true;
        //    heights[x][y]=0;
           
            for(int i[]:dir){
                if(x+i[0]<0 || x+i[0]>=n || y+i[1]<0 || y+i[1]>=m || vis[x+i[0]][y+i[1]]){
                    continue;
                }
                int ht=Math.max(curr.h,Math.abs(val-heights[x+i[0]][y+i[1]]));
                pq.add(new node(x+i[0],y+i[1],ht));
               

            }


       }

       return 0;

    }
}