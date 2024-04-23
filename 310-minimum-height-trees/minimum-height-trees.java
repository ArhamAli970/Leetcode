class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
     List<Integer> ans=new ArrayList<>(); 
     ArrayList<Integer>[] arr= new ArrayList[n];

     int deg[]=new int[n];

     if(n==1){ans.add(0);return ans;}
     if(n==2){ans.add(0);ans.add(1); return ans;}

     for(int i=0;i<n;i++){
        arr[i]=new ArrayList<>();
     }

    for(int i=0;i<n-1;i++){
        ++deg[edges[i][0]];
        ++deg[edges[i][1]];
        arr[edges[i][0]].add(edges[i][1]);
        arr[edges[i][1]].add(edges[i][0]);
    }

    Queue<Integer> q= new LinkedList<>();

    for(int i=0;i<n;i++){
        if(deg[i]==1){q.add(i);}
    }

    // System.out.print(q);

    int cnt=n; 

    while(!q.isEmpty()){
        int size=q.size();
        for(int j=0;j<size;j++){
            int nd=q.remove();
            --deg[nd];
            --cnt;
            for(int i=0;i<arr[nd].size();i++){
             --deg[arr[nd].get(i)];
              if(deg[arr[nd].get(i)]==1){
                    q.add(arr[nd].get(i));
              }
                
            }
        }
        if(cnt<=2){break;}
    }

    while(!q.isEmpty()){
        ans.add(q.remove());
    }

    return ans;

    }
}