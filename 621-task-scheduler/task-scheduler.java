class Solution {
    public int leastInterval(char[] tasks, int n) {

        int wait[]= new int[26];
        int cnt[]=new int[26];

        HashSet<Integer> h= new HashSet<>();

        for(int i=0;i<tasks.length;i++){
            ++cnt[tasks[i]-'A'];
            h.add(tasks[i]-'A');
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

             
            for(int i=0;i<26;i++){
                if(wait[i]>0){--wait[i];}
            }
            

            wait[maxIdx]=n;
            --cnt[maxIdx];
            --t;

            if(t==0){break;}

            int min=Integer.MAX_VALUE;
            for(int i=0;i<26;i++){
               if(h.contains(i) && cnt[i]>0){min=Math.min(wait[i],min);}
            }
                        // System.out.println(maxIdx+" "+min);

            for(int i=0;i<26;i++){
               if(h.contains(i)){wait[i]-=min;}
            }

            // System.out.print(min+" ");

            time+=min;


        }

        return time;
        
    }
}