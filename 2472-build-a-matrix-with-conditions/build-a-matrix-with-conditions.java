class Solution {
    
    public static boolean getdeg(int k,int nums[][],HashMap<Integer,Integer> mp){
               
        ArrayList<Integer> arr[]=new ArrayList[k+1];

        for(int i=0;i<=k;i++){
            arr[i]=new ArrayList<>();
        }

        int indeg[]=new int[k+1];

        for(int i[]:nums){
            arr[i[0]].add(i[1]);
            ++indeg[i[1]];
        }


        Queue<Integer> q=new LinkedList<>();
        
        for(int i=1;i<=k;i++){
            if(indeg[i]==0){q.add(i);}
        }
        int idx=-1;

        while(!q.isEmpty()){            
            int curr=q.remove();
            mp.put(curr,++idx);
            for(int i=0;i<arr[curr].size();i++){
                int e=arr[curr].get(i);
                --indeg[e];
                if(indeg[e]==0){q.add(e);}
            }
        }


       return idx!=k-1;


        
    }
    public int[][] buildMatrix(int k, int[][] rowConditions, int[][] colConditions) {       
        HashMap<Integer,Integer> row=new HashMap<>();
         HashMap<Integer,Integer> col=new HashMap<>();

        if(getdeg(k,rowConditions,row) || getdeg(k,colConditions,col)){return new int[0][0];}
 
        int ans[][]=new int[k][k];
        for(int i=1;i<=k;i++){
            int r=row.get(i);
            int c=col.get(i);
            ans[r][c]=i;
            
        }


        return ans;


        


        
    }
}