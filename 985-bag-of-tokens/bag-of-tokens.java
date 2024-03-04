class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int i=0,j=tokens.length-1,cnt=0;
        if(tokens.length==0){return 0;}
        Arrays.sort(tokens);
        while(i<=j){
            if(power>=tokens[i]){
                power-=tokens[i];
                cnt++;
                i++;
            }else if(cnt>0){
                if(i==j){break;}
                power+=tokens[j];
                cnt--;
                j--;
            }
            else{
                break;
            }
        }
        return cnt;
    }
}