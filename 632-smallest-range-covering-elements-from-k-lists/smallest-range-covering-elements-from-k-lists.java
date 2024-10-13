class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        int k=nums.size();
        // if(k==1){return nums.get(0).get(0);}

        int idx[]=new int[k];
        TreeMap<Integer,Queue<Integer>> mp=new TreeMap();
        for(int i=0;i<k;i++){
            int num=nums.get(i).get(0);
            if(!mp.containsKey(num)){mp.put(num,new LinkedList<>());}
            mp.get(num).add(i);
        }

        int diff=Integer.MAX_VALUE;
        int ans[]=new int[2];
        

        while(true){
            int currdiff=mp.lastKey()-mp.firstKey();
            if(diff>currdiff){
                diff=currdiff;
                ans[0]=mp.firstKey();
                ans[1]=mp.lastKey();
            }

            int currK=mp.get(mp.firstKey()).remove();

            if(mp.get(mp.firstKey()).isEmpty()){
                mp.remove(mp.firstKey());
            }

            ++idx[currK];
            if(idx[currK]>=nums.get(currK).size()){break;}
            int ele=nums.get(currK).get(idx[currK]);

            if(!mp.containsKey(ele)){
                mp.put(ele,new LinkedList<>());
            }

            mp.get(ele).add(currK);

            

        }

        return ans;

    }
}