class Solution {

public static long call(int i, ArrayList<Integer> a[],int values[],int par){ 
    
long val=values[i];

if(a[i].size()==1 &&  i!=0){return val;}

// node v= null;
long minSum=0;
      for(int j=0;j<a[i].size();j++){ 
          int chld=a[i].get(j);
          if(chld!=par){ 
             minSum+=call(chld,a,values,i);
             
          }
      }
 
 return Math.min(minSum,val);

}

    public long maximumScoreAfterOperations(int[][] edges, int[] values) {
        
        int n=values.length;
        ArrayList<Integer> a[]= new ArrayList[n];
        long sum=0;
        
        for(int i=0;i<n;i++){
            sum+=values[i];
           a[i]= new ArrayList<>();
        }

        for(int i=0;i<edges.length;i++){ 

           a[edges[i][0]].add(edges[i][1]);
           a[edges[i][1]].add(edges[i][0]);

        }

        return sum-call(0,a,values,-1);






    }
}