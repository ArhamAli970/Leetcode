class Solution {
    static int min;
    public static void call(int j,int[] ans,int[] cookies, int k){ 
        if(j>=cookies.length){ 
            int max=0;
            for(int i=0;i<ans.length;i++){max=Math.max(ans[i],max);}
            min=Math.min(max,min);return;
        }

        for(int i=0;i<k;i++){ 
            ans[i]+=cookies[j];
            call(j+1,ans,cookies,k);
            ans[i]-=cookies[j];
        }

    }
    public int distributeCookies(int[] cookies, int k) {
        min=Integer.MAX_VALUE;
        int[] ans= new int[k];

        call(0,ans,cookies,k);
        return min;



    }
}