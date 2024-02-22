class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n==1){return 1;}
       HashMap<Integer,HashSet<Integer>> mp= new HashMap<>();
       int arr[]=new int[n+1];

       for(int i=0;i<trust.length;i++){
           if(!mp.containsKey(trust[i][1])){
               mp.put(trust[i][1],new HashSet<>());
           }
           mp.get(trust[i][1]).add(trust[i][0]);
           ++arr[trust[i][0]];
       }

       for(Map.Entry<Integer,HashSet<Integer>> e: mp.entrySet()){
           if(e.getValue().size()==n-1 && arr[e.getKey()]==0){
               return e.getKey();
           }
       }

       return -1;



    }
}