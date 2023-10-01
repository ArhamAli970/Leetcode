class Solution {
    static int dp[];
    static int ans[];
    // static  HashSet<Integer> h;
    static class node{ 
    int b;
    int a;
        
        node(int b,int a){ 
        this.b=b;
        this.a=a;
        }
    }
    
    public static node call(int i,List<Integer> edges,int cnt){ 
        
        if(dp[i]!=-1){return new node(-1,dp[i]+1);}
    // System.out.print(ans[i]);

        if(ans[i]!=0){ 
           return new node(i,cnt-ans[i]);
        }
         
        ans[i]=cnt;
        
        
        node cnt1=call(edges.get(i),edges,cnt+1);
        
        dp[i]=cnt1.a;
        // h.remove(i);
        if(cnt1.b==-1 || cnt1.b==i){ 
        
           return new node(-1,cnt1.a+1);
        }
        
        return new node(cnt1.b,cnt1.a);
        
        
        
        
        
        
    }
    
    
    public int[] countVisitedNodes(List<Integer> edges) {
        
        int n=edges.size();
        dp= new int[n];
        ans=new int[n];
        // h=new HashSet<>();

        // for(int i=0;i<edges.size();i++){ 
        //     h.add(i);
        // }
        
        
        Arrays.fill(dp,-1);
        
        for(int i=0;i<n;i++){

            if(dp[i]==-1){
            call(i,edges,1);
            }
        }
        
        return dp;
        
    }
}