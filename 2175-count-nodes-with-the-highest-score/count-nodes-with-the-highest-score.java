class Solution {
    static ArrayList<Integer> arr[];
    static int dp[];

    public static int call(int chld){
        if(dp[chld]!=-1){return dp[chld];}
        if(arr[chld].size()==0){return dp[chld]=1;}

        int s1=0,s2=0;
        if(arr[chld].size()>0){s1=call(arr[chld].get(0));}
        if(arr[chld].size()>1){s2=call(arr[chld].get(1));}

        return dp[chld]=s1+s2+1;


    }

    public int countHighestScoreNodes(int[] parents) {
        int n=parents.length;
        arr=new ArrayList[n];
        dp=new int[n];
        Arrays.fill(dp,-1);

        for(int i=0;i<n;i++){
            arr[i]=new ArrayList<>();
        }

        for(int i=1;i<n;i++){
            arr[parents[i]].add(i);
        }

long max=0;
int c=0;
        for(int i=0;i<n;i++){

            long c1=1,tot=0;
            for(int j=0;j<arr[i].size();j++){
                int g=call(arr[i].get(j));
                tot+=g;
                c1*=g;
            }

            long rem=(n-1-tot==0)?1:n-tot-1;

            if(rem*c1>max){
                c=1;max=rem*c1;
            }else if(rem*c1==max){
                c++;
            }

        }

        // System.out.print(max);

        return c;
        
    }
}