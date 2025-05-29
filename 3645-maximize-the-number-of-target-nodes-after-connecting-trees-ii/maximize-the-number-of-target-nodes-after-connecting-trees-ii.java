class Solution {
    public static void call(HashSet<Integer> h,ArrayList<Integer> arr[]){
        int sp=0;
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        boolean vis[]=new boolean[arr.length+1];
        vis[0]=true;
        while(!q.isEmpty()){
            int sz=q.size();
            for(int i=0;i<sz;i++){
                int curr=q.remove();
                if(sp==0){h.add(curr);}
                for(int j=0;j<arr[curr].size();j++){
                    int ed=arr[curr].get(j);
                    if(vis[ed]){continue;}
                    vis[ed]=true;
                    q.add(ed);
                }
            }
            sp+=1;
            sp%=2;
        }

        return;
    }
    public int[] maxTargetNodes(int[][] edges1, int[][] edges2) {
         int n=edges1.length,m=edges2.length;
        ArrayList<Integer> arr1[]=new ArrayList[n+1];
        ArrayList<Integer> arr2[]=new ArrayList[m+1];

        for(int i=0;i<=n;i++){arr1[i]=new ArrayList<>();}
        for(int i=0;i<=m;i++){arr2[i]=new ArrayList<>();}

        for(int i[]:edges1){
            arr1[i[0]].add(i[1]);
            arr1[i[1]].add(i[0]);
        }
        for(int i[]:edges2){
            arr2[i[0]].add(i[1]);
            arr2[i[1]].add(i[0]);
        }



        HashSet<Integer> h=new HashSet<>();
        call(h,arr2);
        int mx=Math.max(h.size(),m+1-(h.size()));
        h=new HashSet<>();
        call(h,arr1);

        int ans[]=new int[n+1];
        for(int i=0;i<=n;i++){
            ans[i]=h.contains(i)?h.size()+mx:n+1-h.size()+mx;
        }

        return ans;
           
    }
}