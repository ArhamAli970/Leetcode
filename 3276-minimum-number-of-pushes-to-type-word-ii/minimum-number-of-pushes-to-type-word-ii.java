class Solution {
    public int minimumPushes(String word) {
        int cnt[]=new int[26];
        for(int i=0;i<word.length();i++){
            ++cnt[word.charAt(i)-'a'];
        }

        Arrays.sort(cnt);
        int minClick=0,rnd=8,clk=1,i=25;

        while(i>=0 && cnt[i]>0){
            if(rnd==0){clk++;rnd=8;}
            minClick+=(clk*cnt[i]);
            i--;rnd--;
        }
return minClick;

    }
}