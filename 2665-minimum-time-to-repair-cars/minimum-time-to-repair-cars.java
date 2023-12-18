class Solution {
    public long repairCars(int[] ranks, int cars) {

        long st=1L;
        long end=(long)1e14;
        long max=(long)1e14;

        while(st<=end){ 

            long time=st+((end-st)/2);
            long numCars=0;

            for(int i=0;i<ranks.length;i++){ 
               long val=(time/ranks[i]);
               long ans=(long)(Math.floor(Math.sqrt(val)));
               numCars+=ans;

            }

if(numCars>=cars){max=Math.min(time,max);end=time-1;}
else{st=time+1;}



        }

        return max;
    }
}