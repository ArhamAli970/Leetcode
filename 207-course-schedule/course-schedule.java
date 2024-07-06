class Solution {
    public boolean canFinish(int n, int[][] pre) {

        int deg[]= new int[n];
        ArrayList<Integer> arr[]=new ArrayList[n];

        for(int i=0;i<n;i++){
            arr[i]=new ArrayList<>();
        }

        for(int i[]:pre){
            arr[i[1]].add(i[0]);
            ++deg[i[0]];
        }

        Queue<Integer> q= new LinkedList<>();

        for(int i=0;i<n;i++){
            if(deg[i]==0){q.add(i);}
        }

int cnt=0;
        while(!q.isEmpty()){
            int curr=q.remove();
            cnt++;
            for(int i=0;i<arr[curr].size();i++){
                --deg[arr[curr].get(i)];
                if(deg[arr[curr].get(i)]==0){q.add(arr[curr].get(i));}
            }
        }


return cnt==n;

        
    }
}