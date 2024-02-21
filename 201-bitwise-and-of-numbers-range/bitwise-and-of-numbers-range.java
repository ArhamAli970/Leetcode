class Solution {
    public int rangeBitwiseAnd(int left, int right) {

        int ans=left,bitDiff=1;
        for(int i=0;i<31;i++){

            if(right-left>=bitDiff || (left&(1<<i))==0 || (right&(1<<i))==0){
                ans=(ans&(~(1<<i)));
            }else{
                ans=(ans|(1<<i));
            }
           bitDiff=(int)Math.pow(2,i+1); 
           if (bitDiff>right){break;}
        }
        
        return ans;
    }
}