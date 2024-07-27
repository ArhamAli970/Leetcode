class Solution {
    static int cst[][];

     static class node implements Comparable <node>{
         int dest,cost;
        node(int dest,int cost){
            this.dest=dest;
            this.cost=cost;
        }
        public int compareTo(node p){
            return this.cost-p.cost;
        }
    }

    public static long bfs(int start,int target){
        PriorityQueue<node> pq=new PriorityQueue<>();
        pq.add(new node(start,0));
        boolean vis[]=new boolean[26];

        while(!pq.isEmpty()){

            node curr=pq.remove();
            int dest=curr.dest;
            int cs=curr.cost;
            if(dest==target){return cs;}
            vis[dest]=true;

            for(int i=0;i<26;i++){
                if(cst[dest][i]!=Integer.MAX_VALUE && !vis[i]){
                    pq.add(new node(i,cs+cst[dest][i]));
                }
            }


        }

        return -1l;
    }

    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        long minCost=0l;

        cst=new int[26][26];
        for(int i[]:cst){Arrays.fill(i,Integer.MAX_VALUE);}

        for(int i=0;i<original.length;i++){
            int idx1=original[i]-'a',idx2=changed[i]-'a';
            cst[idx1][idx2]=Math.min(cost[i],cst[idx1][idx2]);
        }



        long dp[][]=new long[26][26];
        for(long i[]:dp){Arrays.fill(i,-1l);}
        int n=source.length();

        for(int i=0;i<n;i++){
            if(source.charAt(i)!=target.charAt(i)){
                int idx1=source.charAt(i)-'a',idx2=target.charAt(i)-'a';
                if(dp[idx1][idx2]!=-1){
                    minCost+=dp[idx1][idx2];
                }else{
                    dp[idx1][idx2]=bfs(idx1,idx2);
                    if(dp[idx1][idx2]==-1){return -1l;}
                    minCost+=dp[idx1][idx2];
                }

            }
        }

return minCost;
        


    }
}