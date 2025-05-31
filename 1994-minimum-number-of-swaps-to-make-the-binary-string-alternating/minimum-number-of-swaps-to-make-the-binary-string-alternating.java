class Solution {

    public static int call(int pos0,int pos1,String s){
        int cnt1=0,cnt2=0,c0=0,c1=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){c0++;}
            else{c1++;}

            if(s.charAt(i)=='0' && pos0!=i%2){cnt1++;}
            else if(s.charAt(i)=='1' && pos1!=i%2){cnt2++;}
        }

        if(Math.abs(c1-c0)>1){return -1;}

        return cnt1==cnt2?cnt1:Integer.MAX_VALUE;
    }

    public int minSwaps(String s) {
        
        return Math.min(call(0,1,s),call(1,0,s));
    }
}