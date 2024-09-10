class Solution {
    static ArrayList<Integer> arr[];

    public static void dfs(int i,int n,int ans[]){
        
        HashSet<Integer> h=new HashSet<>();
        for(int j=0;j<arr[i].size();j++){
            int nd=arr[i].get(j);
            int gv=ans[nd];
            if(gv!=0){h.add(gv);}
        }
        int val=1;
        while(h.contains(val)){
            val++;
        }

        ans[i]=val;

        for(int j=0;j<arr[i].size();j++){
            int nd=arr[i].get(j);
            if(ans[nd]==0){
                dfs(nd,n,ans);
            }
        }

    }

    public int[] gardenNoAdj(int n, int[][] paths) {
         
        int ans[]=new int[n];

        arr=new ArrayList[n];

        for(int i=0;i<n;i++){
            arr[i]=new ArrayList<>();
        }

        for(int i[]:paths){
            arr[i[0]-1].add(i[1]-1);
            arr[i[1]-1].add(i[0]-1);
        }

        for(int i=0;i<n;i++){
            if(ans[i]==0){
                dfs(i,n,ans);
            }
        }


        return ans;






    }
}