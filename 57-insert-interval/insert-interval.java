class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
          int n=intervals.length;
   int [][]newintervals= new int[n+1][2];

   for(int i=0;i<n;i++){ 
       newintervals[i][0]=intervals[i][0];
       newintervals[i][1]=intervals[i][1];
   }

   newintervals[n][0]=newInterval[0];
   newintervals[n][1]=newInterval[1];

   

   Arrays.sort(newintervals,(a,b)->a[0]-b[0]);


   int st=newintervals[0][0];
   int end=newintervals[0][1]; 
   ArrayList<ArrayList<Integer>> a= new ArrayList<>();

   for(int i=0;i<=n;i++){ 
    if(end>=newintervals[i][0]){ 
      end=Math.max(end, newintervals[i][1]);
    }
    else{ 
      a.add(new ArrayList<>());
      a.get(a.size()-1).add(st);
        a.get(a.size()-1).add(end);

      st=newintervals[i][0];
      end=newintervals[i][1];
    }
   }
    a.add(new ArrayList<>());
    a.get(a.size()-1).add(st);
    a.get(a.size()-1).add(end);

    int newarr[][]= new int[a.size()][2];

    for(int i=0;i<a.size();i++){ 
      newarr[i][0]=a.get(i).get(0);
      newarr[i][1]=a.get(i).get(1);
    }

return newarr;
 

    }
}