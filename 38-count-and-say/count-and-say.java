class Solution {

    public static StringBuilder call(int n){
        if(n==1){return new StringBuilder("1");}
        
        StringBuilder sb=call(n-1);
        StringBuilder ans=new StringBuilder();
        int cnt=0;
        char old=sb.charAt(0);
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)==old){cnt++;}
            else{
                ans.append(String.valueOf(cnt));
                ans.append(old);
                old=sb.charAt(i);
                cnt=1;
            }
        }
        ans.append(String.valueOf(cnt));
        ans.append(old);

        return ans;
    }

    public String countAndSay(int n) {
        return call(n).toString();
    }
}