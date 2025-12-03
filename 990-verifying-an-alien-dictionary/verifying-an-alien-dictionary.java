class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<order.length();i++) mp.put(order.charAt(i),i+1);

        // int mx=1;
        boolean vis[]=new boolean[words.length];
        for(int i=0;i<21;i++){
            // mx=Math.max(words[i].length(),mx);
            for(int j=1;j<words.length;j++){
                if(vis[j]){continue;}
                String w1=words[j-1],w2=words[j];
                int lst=i>=w1.length()?0:mp.get(w1.charAt(i));
                int curr=i>=w2.length()?0:mp.get(w2.charAt(i));
                if(curr>lst){vis[j]=true;}
                else if(curr<lst){return false;}
            }
        }

        return true;
    }
}