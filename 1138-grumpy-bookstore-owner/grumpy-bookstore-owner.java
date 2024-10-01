class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int sumx=0,sumy=0,tot=0,n=customers.length;

        for(int i=0;i<n;i++){
            if(grumpy[i]==0){tot+=customers[i];}
        }

        // System.out.print(tot);
        int i=0,max=tot;
        for(int j=0;j<n;j++){
            if(grumpy[j]==1){sumy+=customers[j];}
            // else{sumy+=customers[j];}

            if(j>=minutes){
            if(grumpy[i]==1){sumy-=customers[i];}
            // else{sumy-=customers[i];}
            i++;
            }

            if(j>=minutes-1){
                int curr=tot+sumy;
                max=Math.max(max,curr);
            }

        }

        return max;

    }
}