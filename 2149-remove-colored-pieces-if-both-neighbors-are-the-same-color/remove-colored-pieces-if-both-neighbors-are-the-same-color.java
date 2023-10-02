class Solution {
    public boolean winnerOfGame(String colors) {
        
        int i=0,j=0,n=colors.length();
        int cntA=0,cntB=0;

        while(j<n){ 
                 
                // char c=colors.charAt(i);

                while(j<colors.length() && colors.charAt(j)==colors.charAt(i)){ 
                    j++;
                }

                if(colors.charAt(i)=='A'){ 
                  cntA+=(j-i-2)>0?j-i-2:0;
                }else{ 
                  cntB+=(j-i-2)>0?j-i-2:0;
                }

                i=j;

        }

        if(cntB>=cntA){return false;}
        return true;



    }
}