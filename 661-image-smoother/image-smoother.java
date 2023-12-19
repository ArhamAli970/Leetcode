class Solution {
    public static int getAvg(int i,int j,int img[][]){ 

       int cnt=0,sum=0;
         int n=img.length,m=img[0].length;
       for(int l= Math.max(i-1,0) ;l<Math.min(i+2,n);l++){ 

           for(int k=Math.max(j-1,0);k<Math.min(m,j+2);k++){ 
               sum+=img[l][k];
               cnt++;
           }

       }

       return (sum/cnt);


    }


    public int[][] imageSmoother(int[][] img) {
        int n=img.length,m=img[0].length;
        int ans[][]=new int[n][m];

        for(int i=0;i<n;i++){ 

            for(int j=0;j<m;j++){ 
                  
                 ans[i][j]=getAvg(i,j,img);


            }

        }

return ans;
    }
}