class Solution {
    public int reductionOperations(int[] nums) {
        HashMap<Integer,Integer> mp= new HashMap<>();
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());

         
         for(int i=0;i<nums.length;i++){ 
             if(!mp.containsKey(nums[i])){pq.add(nums[i]);}
             mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);

         }


         int cntStp=0;

         while(pq.size()!=1){ 
            int num=pq.remove();
            cntStp+=mp.get(num);
            if(pq.size()==1){return cntStp;}
            int nextNum=pq.peek();
            mp.put(nextNum,mp.get(num)+mp.get(nextNum));
         }

         return 0;





    }
}