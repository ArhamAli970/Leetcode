class Solution {
    public int minOperations(String s) {
        
        int cntOdd0=0,cntEven0=0; 
        int n=s.length();

        for(int i=0;i<s.length();i++){ 
            if(i%2!=0){ 
                if(s.charAt(i)=='0'){cntOdd0++;}

            }
            else{ 
                if(s.charAt(i)=='0'){cntEven0++;}

            }
        }
int num=n/2;
int ev=n%2==0?n/2:(n/2)+1;

        return cntOdd0<cntEven0?(ev-cntEven0)+(cntOdd0):(num-cntOdd0)+(cntEven0);


    }
}