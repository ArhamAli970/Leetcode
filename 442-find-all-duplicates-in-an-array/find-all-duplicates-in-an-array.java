class Solution {
    public List<Integer> findDuplicates(int[] arr) {

        ArrayList<Integer> a= new ArrayList<>();

        for(int i=0;i<arr.length;i++){ 
            if(arr[Math.abs(arr[i])-1]<0){ 
                a.add(Math.abs(arr[i]));
            }
            else{ 
                arr[Math.abs(arr[i])-1]=0- arr[Math.abs(arr[i])-1];
            }

        }
        return a;
        
    }
}