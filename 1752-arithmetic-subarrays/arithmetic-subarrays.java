class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {

        List<Boolean> ans= new ArrayList<>();

        for(int i=0;i<l.length;i++){ 
                    
                    PriorityQueue<Integer> pq= new PriorityQueue<>();
                    for(int j=l[i];j<=r[i];j++){ 
                      pq.add(nums[j]);
                    }

                    int diff=pq.remove()-pq.peek();
                    boolean chk=false;

                    while(!pq.isEmpty()){ 
                        int num=pq.remove();
                        if(!pq.isEmpty() && num-pq.peek()!=diff){ 
                            chk=true;
                           ans.add(false);
                            break;
                        }
                    }
                    if(!chk){
                        ans.add(true);
                    }

        }
        
        return ans;
    }
}