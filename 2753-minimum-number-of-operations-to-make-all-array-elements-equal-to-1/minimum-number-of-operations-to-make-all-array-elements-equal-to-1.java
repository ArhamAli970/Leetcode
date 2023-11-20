class Solution {
    public static int gcd(int x,int y ){ 
        int min=(x==0)?y:Math.min(x,y);
        for(int i=min;i>=1;i--){ 
            if(x%i==0 && y%i==0){return i;}
        }
        return 1;
    }
    public int minOperations(int[] nums) {
        // we have to make single element as 1;
        // if gcd of whole array is 1 then there is answer we have to take it in pair
        //  2 10 6 14 -> there is no answer  as gcd is 2
        
        //base case
        int cnt1=0,n=nums.length,num=0;
        for(int i=0;i<n;i++){ 
            num=gcd(num,nums[i]);
            if(nums[i]==1)cnt1++;
        }

        // System.out.print(num);

        if(cnt1>1){return n-cnt1;}
        if(num!=1){return -1;}

        // check for everysubarray having the gcd as 1 for minimum sub array;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){ 
           num=0;
            for(int j=i;j<n;j++){ 
               num=gcd(num,nums[j]);
               if(num==1){min=Math.min(j-i,min);}
            }
        }


return min+(n-1);



        // actual
    


    }
}