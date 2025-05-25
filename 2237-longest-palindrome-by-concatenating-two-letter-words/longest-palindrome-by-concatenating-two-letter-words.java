class Solution {
    public int longestPalindrome(String[] words) {
        
        HashMap<String,Integer> mp= new HashMap<>();
    
        int len=0, maxOd=0;
        
        for(int i=0;i<words.length;i++){
            String rev=new StringBuilder(words[i]).reverse().toString();

            if(mp.containsKey(rev)){
                if(words[i].equals(rev)){maxOd-=1;}
                len+=4;
                mp.put(rev,mp.get(rev)-1);
                if(mp.get(rev)==0){mp.remove(rev);}
            }
            else{
                if(words[i].equals(rev)){maxOd+=1;}
                mp.put(words[i],mp.getOrDefault(words[i],0)+1);
            }
        }
        // System.out.print(mp);
        return len+(maxOd>0?2:0);
        
    }
}