class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int num1=tops[0],num2=bottoms[0];
        int cnt1=1,cnt2=0,cnt3=0,cnt4=1,n=tops.length;

        for(int i=1;i<n;i++){
            if(tops[i]!=num1 && bottoms[i]!=num1){num1=-1;}
            else{
                if(tops[i]==num1){cnt1++;}
                if(bottoms[i]==num1){cnt2++;}
            }

            if(tops[i]!=num2 && bottoms[i]!=num2){num2=-1;}
            else{
                if(tops[i]==num2){cnt3++;}
                if(bottoms[i]==num2){cnt4++;}
            }
        }

        int min=Integer.MAX_VALUE;
        if(num1!=-1){min=Math.min(n-cnt1,n-cnt2);}
        if(num2!=-1){min=Math.min(min,Math.min(n-cnt3,n-cnt4));}

        return min==Integer.MAX_VALUE?-1:min;
        
    }
}