class Solution {

    public int minCost(String color, int[] neededTime) {
        
        int n=color.length();
        int i=0,j=i+1;
        int time=0;

        while(j<n){ 
            
            if(color.charAt(i)==color.charAt(j)){
                int max=neededTime[i];
                int sum=neededTime[i];
                    while(j<n && color.charAt(i)==color.charAt(j)){ 
                        max=Math.max(neededTime[j],max);
                        sum+=neededTime[j];
                        j++;
                    }
            time+=(sum-max);
            
            }

            i=j;++j;

        }

        return time;

    }
}