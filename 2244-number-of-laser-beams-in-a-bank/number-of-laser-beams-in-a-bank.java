class Solution {
    public int numberOfBeams(String[] bank) {

int n=bank.length,totCount=0,prevCount=0;


        for(int i=0;i<n;i++){ 

int currCount=0;
               for(int j=0;j<bank[i].length();j++){ 
                   if(bank[i].charAt(j)=='1') currCount++;
               }
               if(currCount==0) continue;

               totCount+= ( prevCount*currCount);
               prevCount=currCount;

        }
        
        return totCount;
    }
}