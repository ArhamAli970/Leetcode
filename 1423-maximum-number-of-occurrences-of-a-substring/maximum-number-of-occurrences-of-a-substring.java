class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        int max=0;
        int n=s.length();
        HashMap<String,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            HashSet<Character> h=new HashSet<>();

            for(int j=i;j<Math.min(i+maxSize,n);j++){
                h.add(s.charAt(j));
                if(h.size()<=maxLetters){
                    if(j-i+1>=minSize){
                    String ans=s.substring(i,j+1);
                        mp.put(ans,mp.getOrDefault(ans,0)+1);
                        max=Math.max(max,mp.get(ans));    
                    }
                }
                else{break;}
            }
        }

        return max;
        
    }
}