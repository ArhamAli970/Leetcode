class Solution {
static int cnt;
public static void dfs(List<List<Integer>> rooms,boolean vis[],int idx){
    vis[idx]=true;
    cnt--;
    for(int i=0;i<rooms.get(idx).size();i++){
        if(!vis[rooms.get(idx).get(i)]){
            dfs(rooms,vis,rooms.get(idx).get(i));
        }
    }
}

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean vis[]=new boolean[n];
        cnt=rooms.size();

        dfs(rooms,vis,0);
        return cnt==0;



    }
}