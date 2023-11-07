class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        
        int n=dist.length;
        double ans[]= new double[n];
           
        for(int i=0;i<n;i++){ 

            ans[i]=(1.0*dist[i]/speed[i]);

            // if(dist[i]%speed[i]!=0){++ans[i];}
        }

    Arrays.sort(ans);

    for(int i=1;i<n;i++){ 
        if(ans[i]<=i){return i;}
    }

    return n;
    
    
     
    }
}