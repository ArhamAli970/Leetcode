class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int n=matrix.length,m=matrix[0].length;
        int row[]=new int[n];
        int col[]=new int[m];
        List<Integer> ans=new ArrayList<>();

        for(int i=0;i<n;i++){
            int min=100000;
            for(int j=0;j<m;j++){
                min=Math.min(matrix[i][j],min);
            }
            row[i]=min;
        }

         for(int i=0;i<m;i++){
            int max=0;
            for(int j=0;j<n;j++){
                max=Math.max(matrix[j][i],max);
            }
            col[i]=max;
        }


        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i]==col[j]){
                    ans.add(matrix[i][j]);
                }
            }
        }

return ans;

        
    }
}