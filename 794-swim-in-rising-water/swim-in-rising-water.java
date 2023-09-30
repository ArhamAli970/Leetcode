class Solution {
    static class node implements Comparable <node> { 
        int i,j,c;
        node(int i,int j,int c){ 
            this.i=i;
            this.j=j;
            this.c=c;

        }
        @Override
        public int compareTo(node p){ 
            return this.c-p.c;
        }
    }
    public int swimInWater(int[][] grid) {

       int n=grid.length;
       PriorityQueue<node> pq= new PriorityQueue<>();
       int max=0;

       pq.add(new node(0,0,grid[0][0]));
       grid[0][0]=Integer.MAX_VALUE;

       while(!pq.isEmpty()){ 
           node curr=pq.remove();
           max=Math.max(curr.c,max);
           
           int i=curr.i,j=curr.j;

           if(i==n-1 && j==n-1){break;}

           if(i+1<n && grid[i+1][j]!=Integer.MAX_VALUE){ pq.add(new node(i+1,j,grid[i+1][j]));
           grid[i+1][j]=Integer.MAX_VALUE;}
           if(j+1<n && grid[i][j+1]!=Integer.MAX_VALUE){ pq.add(new node(i,j+1,grid[i][j+1]));
            grid[i][j+1]=Integer.MAX_VALUE;}
           if(j-1>=0 && grid[i][j-1]!=Integer.MAX_VALUE){ pq.add(new node(i,j-1,grid[i][j-1]));
            grid[i][j-1]=Integer.MAX_VALUE;}
           if(i-1>=0 && grid[i-1][j]!=Integer.MAX_VALUE){ pq.add(new node(i-1,j,grid[i-1][j]));
            grid[i-1][j]=Integer.MAX_VALUE;}


        }

        return max;

    }
}