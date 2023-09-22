class Solution {
    static class info{ 
        int src,cost;
        info(int src,int cost){ 
            this.src=src;
            this.cost=cost;
        }
    }
    static class node { 
        int dest,cost;
        node(int dest,int cost){ 
            this.dest=dest;
            this.cost=cost;
        }
    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        
        ArrayList<node> arr[]=new ArrayList[n];
        int m=flights.length;

        // boolean dp[][]=new boolean[n][n];
        int a[]= new int[n];
        Arrays.fill(a,Integer.MAX_VALUE);

        for(int i=0;i<n;i++){ 
            arr[i]=new ArrayList<>();
        } 

        for(int i=0;i<m;i++){ 
            arr[flights[i][0]].add( new node( flights[i][1],flights[i][2]));
        }
         
        // boolean vis[]= new boolean[n];

        Queue<info> q= new LinkedList<>();
        int cnt=-1;
        q.add(new info(src,0));
        int min=Integer.MAX_VALUE;

        while(cnt<k  && !q.isEmpty()){ 

            int size=q.size();

            for(int i=0;i<size;i++){ 
                     
                    info curr= q.remove();
                    // dp[curr.src]=true;
                    int cost=curr.cost;
                    int s=curr.src;

                    for(int j=0;j<arr[s].size();j++){
                        if(a[arr[s].get(j).dest]<arr[s].get(j).cost+cost){continue;}
                        else if(arr[s].get(j).dest==dst){min=Math.min(arr[s].get(j).cost+cost,min);
                        }else{ 
                        q.add( new info (arr[s].get(j).dest,arr[s].get(j).cost+cost ));
                        }
                        a[arr[s].get(j).dest]=arr[s].get(j).cost+cost;
                    }



            }

            cnt++;

        }
        
return min==Integer.MAX_VALUE?-1:min;

    }
}