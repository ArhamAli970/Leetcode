class Solution {
    static List<List<Integer>> ans;

    public static void call(int i,int target,ArrayList<Integer> arr,int[] cand){
         if(target==0){
            ArrayList<Integer> a1=new ArrayList<>();
            a1.addAll(arr);
            ans.add(a1);
            return;
         }

        else if(target<0 || i==cand.length){return;}
         HashSet<Integer> h=new HashSet<>();

         

         for(int j=i;j<cand.length;j++){
            if(h.contains(cand[j])){continue;}
            arr.add(cand[j]);
            call(j+1,target-cand[j],arr,cand);
            arr.remove(arr.size()-1);
            h.add(cand[j]);
         }



    }


    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        int n=candidates.length;
        Arrays.sort(candidates);
        ans=new ArrayList<>();

        // return ans;
        HashSet<Integer> h=new HashSet<>();


        for(int i=0;i<n;i++){
            if(!h.contains(candidates[i])){
                ArrayList<Integer> arr=new ArrayList<>();
                arr.add(candidates[i]);
                call(i+1,target-candidates[i],arr,candidates);
            }
            h.add(candidates[i]);
        }


return ans;

    }
}