class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        List<List<Integer>> ans= new ArrayList<>();
        int max=0;
        for(int i=0;i<nums.length;i++){ 
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            max=Math.max(mp.get(nums[i]),max);
        }

int cnt=0;
        while(cnt<max){ 
            ans.add(new ArrayList<>());

            for(Map.Entry<Integer,Integer> e: mp.entrySet()){ 
                if(e.getValue()>cnt){
                ans.get(ans.size()-1).add(e.getKey());
                }
            }
// if(!chng){ans.remove}
cnt++;

        }

          return ans;
    }
}