class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans= new ArrayList<>();
        HashMap<String,List<String>> mp= new HashMap<>();
        int n=strs.length;

        for(int i=0;i<n;i++){
            char[] a= strs[i].toCharArray();
            Arrays.sort(a);
            String str=Arrays.toString(a);
            if(!mp.containsKey(str)){
                mp.put(str,new ArrayList<>());
            }

            mp.get(str).add(strs[i]);

        }


        for(Map.Entry<String,List<String>> e: mp.entrySet()){
            ans.add(e.getValue());
        }

        return ans;

    }
}