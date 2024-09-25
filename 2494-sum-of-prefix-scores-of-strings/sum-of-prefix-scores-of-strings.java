class Solution {
    static class node{
        node arr[];
        int cnt;
        node(){
            arr=new node[26];
            cnt=0;
            for(int i=0;i<26;i++){
                arr[i]=null;
            }
        }
    }
    public int[] sumPrefixScores(String[] words) {
        int n=words.length;
        int ans[]=new int[n];
        node curr=new node();

        for(int i=0;i<n;i++){
            node prev=curr;
            for(int j=0;j<words[i].length();j++){
                char ch=words[i].charAt(j);
                if(prev.arr[ch-'a']==null){
                    prev.arr[ch-'a']=new node();
                }
                prev=prev.arr[ch-'a'];
                prev.cnt+=1;
            }
        }

         for(int i=0;i<n;i++){
            node prev=curr;
            int cntPref=0;
            for(int j=0;j<words[i].length();j++){
                char ch=words[i].charAt(j);
                prev=prev.arr[ch-'a'];
                cntPref+=prev.cnt;
            }
            ans[i]=cntPref;
        }

return ans;


    }
}