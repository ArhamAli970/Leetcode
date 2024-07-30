class Solution {
    public int minimumDeletions(String s) {

int tca=0,ca=0,len=s.length();
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='a'){++tca;}
        }



int min=tca;
for(int i=0;i<len;i++){
    if(s.charAt(i)=='a'){++ca;}
    int cntb=(i+1)-ca;
    int cnta=tca-ca;
    min=Math.min(cnta+cntb,min);

}

return min==Integer.MAX_VALUE?0:min;
        
        
    }
}