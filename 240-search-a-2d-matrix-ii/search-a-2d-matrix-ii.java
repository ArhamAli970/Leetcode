class Solution {
    public static int call1(int i,int j,int arr[][],int target){
        int st=0,end=j-1,ans=-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(arr[i][mid]>target){end=mid-1;}
            else if(arr[i][mid]==target){return mid;}
            else{st=mid+1;ans=mid;}
        }
        return ans;
    }
    public static int call2(int i,int j,int arr[][],int target){
        int st=i+1,end=arr.length-1,ans=-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(arr[mid][j]>target){ans=mid;end=mid-1;}
            else if(arr[mid][j]==target){return mid;}
            else{st=mid+1;}
        }
        return ans;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length,m=matrix[0].length;
        int i=0,j=m-1;
        while(i!=-1 && j!=-1){
            if(matrix[i][j]==target){
                return true;
            }
            else if(matrix[i][j]>target){
                // System.out.println("1");
                j=call1(i,j,matrix,target);
            }else{
                // System.out.println("2");
                i=call2(i,j,matrix,target);
            }
            // System.out.println(i+" "+j);
        }

        return false;
        
    }
}