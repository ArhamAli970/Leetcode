class Solution {
    public int[] platesBetweenCandles(String s, int[][] queries) {
     int n=s.length();
     int pref[]=new int[n];

     pref[0]=s.charAt(0)=='|'?1:0;

     for(int i=1;i<n;i++){
        pref[i]=pref[i-1];
        if(s.charAt(i)=='|'){
            ++pref[i];
        }
    }



    int lastCandel[]= new int[n];
    int last=Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
        last=s.charAt(i)=='|'?i:last;
        lastCandel[i]=last;
    }

  



     int nextCandel[]= new int[n];
    int next=Integer.MAX_VALUE;
    for(int i=n-1;i>=0;i--){
        next=s.charAt(i)=='|'?i:next;
        nextCandel[i]=next;
    }

  

int m=queries.length;

int ans[]= new int[m];

    for(int i=0;i<m;i++){
        int i1=queries[i][0];
        int i2=queries[i][1];

        int diff=lastCandel[i2]-nextCandel[i1];

        if(nextCandel[i1]>=lastCandel[i2]){
            ans[i]=0;
        }else{
            ans[i]=diff-(pref[lastCandel[i2]]-pref[nextCandel[i1]]);
        }

    }



return ans;



    }
}