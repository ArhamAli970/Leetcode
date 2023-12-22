class Solution {
    public int maxScore(String s) {
        int max=0,countOne=0,countZero=0;
        int n=s.length();
        for(int i=0;i<n;i++){ 
            if(s.charAt(i)=='1'){countOne++;}
        }



for(int i=0;i<n-1;i++){ 
if(s.charAt(i)=='0'){countZero++;}
else{--countOne;}
    max=Math.max(countZero+countOne,max);

}

return max;


        

    }
}