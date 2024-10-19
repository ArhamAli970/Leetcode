class Solution {
    static char ans;
    public static void call(int n,int k,StringBuilder s1){
        if(n==0){
            ans=s1.charAt(k-1);
            return;
        }
        StringBuilder s2=new StringBuilder();;
        for(int i=s1.length()-1;i>=0;i--){
            if(s1.charAt(i)=='0'){s2.append('1');}
            else{s2.append('0');}
        }
        s1.append('1');
        s1.append(s2);
        call(n-1,k,s1);
    }
    public char findKthBit(int n, int k) {
        ans='0';
        StringBuilder sb=new StringBuilder();
        sb.append("0");
        call(n-1,k,sb);
        return ans;
    }
}