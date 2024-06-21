class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {

        int profit=0,n=customers.length;

        for(int i=0;i<n;i++){
            if(grumpy[i]==0){
                profit+=customers[i];
            }
        }
        int j=0,done=0,max=0;

        for(int i=0;i<n;i++){

            if(grumpy[i]==1){
                done+=customers[i];
            }

            if(i-j==minutes-1){
                max=Math.max(max,profit+done);
                if(grumpy[j]==1){
                    done-=customers[j];
                }
                j++;
            }


        }

        return max;
        
    }
}