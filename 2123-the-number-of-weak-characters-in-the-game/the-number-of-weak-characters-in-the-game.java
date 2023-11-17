class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        
        Arrays.sort(properties,(a,b)->{ 
            if(a[0]!=b[0]){ 
                return a[0]-b[0];
            }
            return b[1]-a[1];
        });

        int n=properties.length,cnt=0;

        int minAtt=properties[n-1][0],minDiff=properties[n-1][1];

        for(int i=n-2;i>=0;i--){ 
               
               if(minAtt<properties[i][0] || minDiff<properties[i][1]){ 
                   minAtt=properties[i][0];
                   minDiff=properties[i][1];
                   
               }
               else if(properties[i][0]<minAtt && properties[i][1]<minDiff){
                
                   cnt++;
               }
        
        }

return cnt;
        
    }
}