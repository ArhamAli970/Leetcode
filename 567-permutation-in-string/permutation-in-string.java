class Solution {
    public static boolean chk(int cnt[]){
        for(int i:cnt){
            if(i!=0){return false;}
        }

        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length(),m=s2.length();
        int cnt[]=new int[26];
        for(int i=0;i<n;i++){
           ++cnt[s1.charAt(i)-'a'];
        }

        int i=0;

        for(int j=0;j<m;j++){
            int idx=s2.charAt(j)-'a';
            --cnt[idx];
            while(cnt[idx]<0){
                ++cnt[s2.charAt(i)-'a'];
                i++;
            }

            if(chk(cnt)){
                return true;
            }

        }
return false;
    }
}