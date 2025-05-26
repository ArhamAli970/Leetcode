class Solution {
    
    ArrayList<Integer> arr[];
    public int largestPathValue(String colors, int[][] edges) {
        int n=colors.length();
        
        arr=new ArrayList[n];
        for(int i=0;i<n;i++){
            arr[i]=new ArrayList<>();
        }
        int indeg[]=new int[n];
        int max=-1,cnt=n;
        
        for(int i[]:edges){
            arr[i[0]].add(i[1]);
            ++indeg[i[1]];
        }

        int dp[][]=new int[n][26];
        Queue<Integer> q=new LinkedList<>();

        for(int i=0;i<n;i++){
            if(indeg[i]==0){q.add(i);}
        }

        while(!q.isEmpty()){
            int ed=q.remove();
            cnt--;
            int col[]=dp[ed];
            ++col[colors.charAt(ed)-'a'];
            max=Math.max(col[colors.charAt(ed)-'a'],max);
            for(int i=0;i<arr[ed].size();i++){
                int curr=arr[ed].get(i);
                --indeg[curr];
                for(int j=0;j<26;j++){
                    dp[curr][j]=Math.max(dp[curr][j],col[j]);
                }
                if(indeg[curr]==0){
                    q.add(curr);
                }
            }
        }

        return cnt==0?max:-1;



    }
}