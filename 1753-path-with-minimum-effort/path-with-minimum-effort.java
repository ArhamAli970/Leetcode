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

       while(!pq.isEmpty()){ 
           node curr=pq.remove();
           int x=curr.i,y=curr.j;
           if(heights[x][y]==0){continue;}
           if(x==n-1 && y==m-1){return curr.h;}
           int val=heights[x][y];
           heights[x][y]=0;
           
           if(x-1>=0 && heights[x-1][y]!=0){pq.add(new node(x-1,y,Math.max(curr.h,Math.abs(val-heights[x-1][y]))));}
           if(y-1>=0 && heights[x][y-1]!=0){pq.add(new node(x,y-1,Math.max(curr.h,Math.abs(val-heights[x][y-1]))));}
           if(x+1<n && heights[x+1][y]!=0){pq.add(new node(x+1,y,Math.max(curr.h,Math.abs(val-heights[x+1][y]))));}
           if(y+1<m && heights[x][y+1]!=0){pq.add(new node(x,y+1,Math.max(curr.h,Math.abs(val-heights[x][y+1]))));}


       }

       return 0;

    }
}