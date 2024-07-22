class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer,String> mp=new TreeMap<>();
        int n=names.length;
        for(int i=0;i<n;i++){
            mp.put(heights[i],names[i]);
        }

        String ans[]=new String[n];
        for(int i=n-1;i>=0;i--){
            int h=mp.firstKey();
            ans[i]=mp.get(h);
            mp.remove(h);
        }

        return ans;
    }
}