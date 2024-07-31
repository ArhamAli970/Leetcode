class Solution {
    static int dp[][];
    static int n;

    public static int call(int books[][],int shelfWidth,int i,int sf,int h){
        if(i==n){return h;}

        if(dp[i][sf]!=-1)return dp[i][sf];


        
        int m1=call(books,shelfWidth,i+1,books[i][0],books[i][1])+h;
        
        if(sf+books[i][0]<=shelfWidth){
            m1=Math.min(m1,call(books,shelfWidth,i+1,sf+books[i][0],Math.max(h,books[i][1])));
        }

       return dp[i][sf]=m1;

    }

    public int minHeightShelves(int[][] books, int shelfWidth) {
        n=books.length;
        dp=new int[n+1][shelfWidth+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=shelfWidth;j++){
                 dp[i][j]=-1;
            }
        }

        return call(books,shelfWidth,1,books[0][0],books[0][1]);
    }
}