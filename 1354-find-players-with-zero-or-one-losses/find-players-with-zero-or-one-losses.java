class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {

        int n=matches.length;
        List<List<Integer>> ans= new ArrayList<>();
        HashSet<Integer> h= new HashSet<>();
        ans.add(new ArrayList<>());
        ans.add(new ArrayList<>());


        HashMap<Integer,Integer> mp= new HashMap<>();

        for(int i=0;i<n;i++){
            mp.put(matches[i][1],mp.getOrDefault(matches[i][1],0)+1);
        }

        for(Map.Entry<Integer,Integer> e: mp.entrySet()){
            if(e.getValue()==1){ 
                ans.get(1).add(e.getKey());
            }
        }

        for(int i=0;i<n;i++){
            if(!mp.containsKey(matches[i][0]) && !h.contains(matches[i][0])){
                ans.get(0).add(matches[i][0]);
                h.add(matches[i][0]);
            }
        }

        for(int i=0;i<2;i++){
            Collections.sort(ans.get(i));
        }

    return ans;    
    }
}