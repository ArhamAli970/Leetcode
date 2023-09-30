class Solution {
    static int cnt;
    public static int call(int i,ArrayList<Integer> a[] ,int k,int values[],boolean vis[]){ 
        vis[i]=true;
        int sum=values[i];

        for(int j=0;j<a[i].size();j++){ 
            if(!vis[a[i].get(j)]){sum+=call(a[i].get(j),a,k,values,vis);}
        }

        if(sum%k==0){ 
            // System.out.print("df");
          cnt++;
          return 0;
        }

return sum;
        

    }

    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
    //  int n=values.length;
     ArrayList<Integer> a[]= new ArrayList[n];
     cnt=0;

     for(int i=0;i<n;i++){ 
         a[i]=new ArrayList<>();
     }

    for(int i=0;i<edges.length;i++){ 
        a[edges[i][0]].add(edges[i][1]);
        a[edges[i][1]].add(edges[i][0]);
    }
     
     
    cnt=0;
    boolean vis[]=new boolean[n];
    call(0,a,k,values,vis);

    return cnt;
        
    }
}