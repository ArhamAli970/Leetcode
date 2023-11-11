class Solution {


    static class node implements Comparable <node>{ 
        int i,j,val;
        node(int i,int j,int val){ 
            this.i=i;this.j=j;this.val=val;
        }
        @Override
        public int compareTo(node p){ 
            return this.val-p.val;
        }
    }


    public long maxSpending(int[][] values) {

        long ans=0;
        long d=1;
        PriorityQueue<node> pq= new PriorityQueue<>();
        int n=values.length,m=values[0].length;
        for(int i=0;i<n;i++){ 
           pq.add(new node(i,m-1,values[i][m-1]));
        }

        while(!pq.isEmpty()){ 
             
            node curr=pq.remove();
            if(curr.j-1>=0){ 
                pq.add(new node(curr.i,curr.j-1,values[curr.i][curr.j-1]));
            }
            ans+=curr.val*d++;

        }

        return ans;
        
    }
}