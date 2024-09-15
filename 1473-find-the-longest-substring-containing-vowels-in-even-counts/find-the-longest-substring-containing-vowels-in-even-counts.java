class Solution {

public static int getSetChar(int cnt[],HashSet<Character> h){
    int val=31,bitNo=0;

    for(int i=25;i>=0;i--){
        char ch=(char)(i+'a');
        if(h.contains(ch)){
            int bit=cnt[i]%2;
            bit=(bit<<bitNo);
            val=(val^bit);
            bitNo++;
        }
    }
    return val;

}

    public int findTheLongestSubstring(String s) {

       HashMap<Integer,Integer> mp=new HashMap<>();

       int cnt[]=new int[26];
       HashSet<Character> h=new HashSet<>();
       h.add('a');h.add('e');h.add('i');h.add('o');h.add('u');
       mp.put(31,-1);
       int max=0;

       for(int i=0;i<s.length();i++){
        if(h.contains(s.charAt(i))){
            ++cnt[s.charAt(i)-'a'];
        }
        int bin=getSetChar(cnt,h);

        if(!mp.containsKey(bin)){
            mp.put(bin,i);
        }



        max=Math.max(max,i-mp.get(bin));


        

       }


       return max;

        


    }
}