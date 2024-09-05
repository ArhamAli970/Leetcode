class Solution {

    public static int getMean(int mean,long roll,int curr){
        if(((roll+1)/curr)>=mean){return 1;}

        for(int i=1;i<=6;i++){
            if(((roll+i)/curr)==mean){return i;}
        }


        return 6;

    }

    public int[] missingRolls(int[] rolls, int mean, int n) {
       int ans[]=new int[n];
       int roll=0;
       int m=rolls.length;

       for(int i:rolls){roll+=i;}

       for(int i=0;i<n;i++){
          m++;
          ans[i]=getMean(mean,roll,m);
          roll+=ans[i];
       }

    //    System.out.print(roll+" "+m);
       if((roll/m)!=mean || roll %m !=0){return new int[0];}

       return ans;

    }
}