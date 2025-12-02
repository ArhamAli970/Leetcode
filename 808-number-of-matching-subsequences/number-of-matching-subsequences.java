class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        int n=words.length;
        // int idx[]=new int[n];
        HashMap<String,Boolean> mp=new HashMap<>();

        int cnt=0;
        
            for(int j=0;j<n;j++){
                if(mp.containsKey(words[j])){cnt+=mp.get(words[j])?1:0;continue;}
                int cp=0;
                for(int i=0;i<s.length();i++){
                if(cp<words[j].length() && s.charAt(i)==words[j].charAt(cp)){
                    ++cp;    
                }
                if(cp>=words[j].length()){cnt++;break;}
            }
             mp.put(words[j],cp>=words[j].length()?true:false);
        }

        // System.out.print(mp);
        

        return cnt;
    }
}