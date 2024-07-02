class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer,Integer> mp=new HashMap<>(); 
    

        for(int i:nums1){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }

        ArrayList<Integer> ans=new ArrayList<>();

        for(int i:nums2){
            if(mp.containsKey(i)){
                ans.add(i);
                mp.put(i,mp.get(i)-1);
                if(mp.get(i)==0){mp.remove(i);}
            }
        }

int arr[]=new int[ans.size()];

int idx=0;

for(int i: ans){
    arr[idx++]=i;
}

return arr;


        
    }
}