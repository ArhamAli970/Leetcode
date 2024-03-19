class Solution {
    public int leastInterval(char[] tasks, int n) {

        int wait[]= new int[26];
        int cnt[]=new int[26];

        for(int i=0;i<tasks.length;i++){
            ++cnt[tasks[i]-'A'];
        }

        int t=tasks.length,time=0;

        while(t>0){
            ++time;
            int maxIdx=-1;
            for(int i=0;i<26;i++){
                int val=maxIdx==-1?0:cnt[maxIdx];
                if(cnt[i]>val && wait[i]==0){
                    maxIdx=i;
                }
            }
            // System.out.print(maxIdx+" ");
             
            for(int i=0;i<26;i++){
                if(wait[i]>0){--wait[i];}
            }
            if(maxIdx==-1){continue;}

            wait[maxIdx]=n;
            --cnt[maxIdx];
            --t;

        }

        return time;
        
    }
}