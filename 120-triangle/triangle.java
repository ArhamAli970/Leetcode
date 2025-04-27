class Solution {
    static int dp[];
    public static int call(int i,int j,List<List<Integer>> triangle){ 
       //base case
        if(i==triangle.size()){return 0;}

        int sum1=dp[i]!=-1000000007?dp[i]:call(i+1,j,triangle);
        int sum2=call(i+1,j+1,triangle);

        dp[i]=sum2;
        return Math.min(sum1,sum2)+triangle.get(i).get(j);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        dp= new int[n];

            Arrays.fill(dp,-1000000007);
        

    int sum= call(0,0,triangle);
    System.gc();
    return sum;


    }
}