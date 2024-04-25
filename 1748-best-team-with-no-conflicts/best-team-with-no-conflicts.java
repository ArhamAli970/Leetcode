class Solution {
    public int bestTeamScore(int[] scores, int[] ages) {
         int n=scores.length;
        int arr[][]= new int[n][2];
        for(int i=0;i<n;i++){ 
            arr[i][0]=ages[i];
            arr[i][1]=scores[i];
        }

        // we are sorting here because we want to have increasing array with respecto age

         Arrays.sort(arr, (int[] a,int[] b)->{ 
           if(a[0]!=b[0]){ 
            return a[0]-b[0];
           }
           return a[1]-b[1];
        });

int dp[]=new int[n];
int max=0;

// for(int i=0;i<n;i++){
//     System.out.println(arr[i][0]+" "+arr[i][1]);
// }

        for(int i=0;i<n;i++){
            int m=0;
            for(int j=i-1;j>=0;j--){
                if((arr[j][1]<=arr[i][1]) || (arr[j][1]>=arr[i][1] && arr[j][0]==arr[i][0])){
                    m=Math.max(dp[j],m);
                }
            }

            dp[i]=m+arr[i][1];
            max=Math.max(dp[i],max);
        }


return max;


    }
}