class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer> h1= new  HashSet<>();
        HashSet<Integer> h2= new  HashSet<>();

        for(int i: nums1){
            h1.add(i);
        }

        for(int i: nums2){
            h2.add(i);
        }

        HashSet<Integer> h3= new  HashSet<>();


        for(int i:h1){
            if(h2.contains(i)){
                h3.add(i);
            }
        }

        int ans[]= new int[h3.size()];
        int j=0;

        for(int i:h3){
            ans[j++]=i;
        }


return ans;


    }
}