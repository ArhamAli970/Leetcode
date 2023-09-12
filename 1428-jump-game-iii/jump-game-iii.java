class Solution {
    static int dp[];
    static boolean vis[];

public static  boolean call(int arr[],int st){ 
    if(st>=arr.length || st<0 || vis[st]){return false;}
    if(arr[st]==0){return true;}

    if(dp[st]!=-1){return dp[st]==0?false:true;}

    vis[st]=true;

    boolean right=call(arr,st+arr[st]);
    boolean left=call(arr,st-arr[st]); 

    vis[st]=false;

    dp[st]= (right || left )? 1:0;

    return (right || left);

}

    public boolean canReach(int[] arr, int start) {
        int n=arr.length;
        dp=new int[n];
        vis=new boolean[n];
        Arrays.fill(dp,-1);

       return call(arr,start);


    }
}