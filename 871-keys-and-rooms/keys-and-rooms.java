class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        Queue<Integer> q= new LinkedList<>();
        q.add(0);
        boolean vis[]=new boolean[n];
        int cnt=n;

        while(!q.isEmpty()){
            int curr=q.remove();
            if(vis[curr]){continue;}
            vis[curr]=true;
            cnt--;
            for(int j=0;j<rooms.get(curr).size();j++){
                int neigh=rooms.get(curr).get(j);
                if(!vis[neigh]){
                    q.add(neigh);
                }
            }
        }

        return cnt==0;

        
    }
}