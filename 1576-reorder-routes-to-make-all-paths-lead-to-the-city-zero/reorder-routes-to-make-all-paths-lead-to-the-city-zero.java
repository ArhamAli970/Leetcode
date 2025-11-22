class Solution {
    public int minReorder(int n, int[][] connections) {
        int cnt=0;
        HashMap<Integer,HashSet<Integer>> mp=new HashMap<>();

        for(int i=0;i<n-1;i++){
            if(!mp.containsKey(connections[i][0])){
              mp.put(connections[i][0],new HashSet<>());
            }
            mp.get(connections[i][0]).add(connections[i][1]);
        }

        ArrayList<Integer> arr[]=new ArrayList[n];
        for(int i=0;i<n;i++){
            arr[i]=new ArrayList<>();
        }

        for(int i=0;i<n-1;i++){
            arr[connections[i][0]].add(connections[i][1]);
            arr[connections[i][1]].add(connections[i][0]);
        }

        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        boolean vis[]=new boolean[n];
        while(!q.isEmpty()){
            int curr=q.remove();
            if(vis[curr]){continue;}
            vis[curr]=true;
            for(int j=0;j<arr[curr].size();j++){
                int ed=arr[curr].get(j);
                if(vis[ed]){continue;}
                if(mp.containsKey(curr) && mp.get(curr).contains(ed)){cnt++;}
                q.add(ed);
            }
        }

        return cnt;

    }
}