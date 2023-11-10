class Solution {
    static int ans[];
    static int idx;
    public static void dfs(int st, HashMap<Integer,ArrayList<Integer>> mp,HashSet<Integer> h){ 
          h.add(st);
          ans[idx++]=st;

          for(int i=0;i<mp.get(st).size();i++){ 
              if(!h.contains(mp.get(st).get(i))){ 
                  dfs(mp.get(st).get(i),mp,h);
              }
          }

    }
    public int[] restoreArray(int[][] adjacentPairs) {
         
         int n=adjacentPairs.length;
        HashMap<Integer,ArrayList<Integer>> mp= new HashMap<>();
        
        for(int i=0;i<n;i++){
            
            if(!mp.containsKey(adjacentPairs[i][0])){
                 mp.put(adjacentPairs[i][0],new ArrayList<>());
            }
            mp.get(adjacentPairs[i][0]).add(adjacentPairs[i][1]);
            if(!mp.containsKey(adjacentPairs[i][1])){
                 mp.put(adjacentPairs[i][1],new ArrayList<>());
            }
            mp.get(adjacentPairs[i][1]).add(adjacentPairs[i][0]);

        }
        ans=new int[n+1];
        idx=0;
    
        int st=-1;

        for(int i=0;i<=n;i++){ 
            if(mp.get(adjacentPairs[i][0]).size()%2!=0){st=adjacentPairs[i][0];break;}
            if(mp.get(adjacentPairs[i][1]).size()%2!=0){st=adjacentPairs[i][1];break;}
        }

         HashSet<Integer> h= new HashSet<>();
        dfs(st,mp,h);

        return ans;

    }
}