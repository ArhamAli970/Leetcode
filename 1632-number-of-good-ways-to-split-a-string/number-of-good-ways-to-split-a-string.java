class Solution {
    public int numSplits(String s) {
        HashMap<Character,Integer> mp=new HashMap<>();
        int n=s.length();

        for(int i=0;i<n;i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }
        int cnt=0;
        HashSet<Character> h=new HashSet<>();

        for(int i=0;i<n;i++){
            mp.put(s.charAt(i),mp.get(s.charAt(i))-1);
            if(mp.get(s.charAt(i))==0){mp.remove(s.charAt(i));}
            h.add(s.charAt(i));

            if(h.size()==mp.size()){cnt++;}

        }
return cnt;
    }
}