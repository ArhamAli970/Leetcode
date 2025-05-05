class Solution {

    public int leastInterval(char[] task, int n) {
        // int time[]=new int[26];
        int cnt[]=new int[26];
        int tot=0,ans=0,max=0;

        for(int i=0;i<task.length;i++){
            ++cnt[task[i]-'A'];
            if(cnt[task[i]-'A']==1){tot++;}
            max=Math.max(cnt[task[i]-'A'],max);
        }

        // if(tot>n){return task.length;}
        
            for(int i=0;i<26;i++){
                if(cnt[i]==max){ans++;}
            }
    
        return Math.max(task.length,((max-1)*(n+1))+ans);
        
        
    }
}