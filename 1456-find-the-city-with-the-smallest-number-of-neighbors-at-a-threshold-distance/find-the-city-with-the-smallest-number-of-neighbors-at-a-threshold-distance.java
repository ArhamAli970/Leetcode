class Solution {
    public class info{ 
        int dest;int c;
        info(int dest,int c){ 
            this.dest=dest;
            this.c=c;
        }
    }

    public class node implements Comparable <node>{ 
        int idx;int c;
        node(int idx,int c){ 
            this.idx=idx;
            this.c=c;
        }

        @Override
        public int compareTo(node p){ 
            return this.c-p.c;
        }
    }

    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        
        ArrayList<info> a[]= new ArrayList[n];
        
        for(int i=0;i<n;i++){ 
            a[i]=new ArrayList<>();
        }

        for(int i=0;i<edges.length;i++){ 
            a[edges[i][0]].add(new info(edges[i][1],edges[i][2]));
            a[edges[i][1]].add(new info(edges[i][0],edges[i][2]));
        }

        int ans[]= new int[n];
        // for every vertices check low no of nodes to approach
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){ 
       
          PriorityQueue<node> pq= new PriorityQueue<>();
          pq.add(new node(i,0));
          boolean vis[]= new boolean[n];
          int cnt=0;
        
          
          while(!pq.isEmpty()){ 

                node curr=pq.remove();
                // if(curr.c> distanceThreshold){break;}
                 if(i!=curr.idx && !vis[curr.idx]){cnt++;}
                vis[curr.idx]=true;
               

                
            

               for(int j=0;j<a[curr.idx].size();j++){ 
                   info now=a[curr.idx].get(j);
                   if(!vis[now.dest] && now.c+curr.c<=distanceThreshold){
                   
                    pq.add(new node(now.dest,now.c+curr.c));
                   }
               }
            


          }
ans[i]=cnt;
min=Math.min(ans[i],min);
        }




// System.out.print(min);

    for(int i=n-1;i>=0;i--){ 
        if(ans[i]==min){ 
            // System.out.print(ans[i]+" ");
            return i;
        }
    }   
         return -1;

    }
}