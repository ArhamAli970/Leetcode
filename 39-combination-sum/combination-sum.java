class Solution {


static HashSet<List<Integer>> h= new HashSet<>();
    public static void call(int mat[],List<Integer> arr, List<List<Integer>> a,int sum,int j,int b){ 
     if(sum>b){return;}
     if(sum==b && !h.contains(arr)){
         a.add(new ArrayList<>(arr));
         h.add(arr);
         return;
     }
     if(sum==b){return;}
     
     
      for(int i=j;i<mat.length;i++){ 
        
        if(sum+mat[i]>b){
            return;
        }
        // if(mat.get(i)< arr.get(arr.size()-1)){continue;}
        arr.add(mat[i]);
        call(mat,arr,a,sum+mat[i],i,b);
        arr.remove(arr.size()-1);
        
           
       }
     
     
        
    }


    public List<List<Integer>> combinationSum(int[] mat, int b) {
        
 Arrays.sort(mat);
       List<Integer> arr= new ArrayList<>();
       List<List<Integer>> a= new ArrayList<>();
       int sum=0;
       
       for(int i=0;i<mat.length;i++){ 
        
        if(sum+mat[i]>b){return a;}
        arr.add(mat[i]);
        call(mat,arr,a,sum+mat[i],i,b);
        arr.remove(arr.size()-1);
        
           
       }
       
      

       
       return a;


    }
}