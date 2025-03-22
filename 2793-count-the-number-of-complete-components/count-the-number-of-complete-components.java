class Solution {
    static int cnt;
    static ArrayList<Integer> arr[];
    public static void dfs(int sz,int i,boolean vis[]){
        if(vis[i]){return;}
        vis[i]=true;
        int m=arr[i].size();
        if(sz!=m){cnt=-1000;}
        for(int j=0;j<m;j++){
            dfs(sz,arr[i].get(j),vis);
        }
        cnt++;
    }
    public int countCompleteComponents(int n, int[][] edges) {

        arr=new ArrayList[n];

        for(int i=0;i<n;i++){
            arr[i]=new ArrayList<>();
        }

        for(int i[]:edges){
            arr[i[0]].add(i[1]);
            arr[i[1]].add(i[0]);
        }

        boolean vis[]=new boolean[n];
        int ans=0;
        for(int i=0;i<n;i++){
            cnt=0;
            if(!vis[i]){
                dfs(arr[i].size(),i,vis);
                if(cnt-1==arr[i].size()){ans++;}
            }
        }


        return ans;
        
    }
}