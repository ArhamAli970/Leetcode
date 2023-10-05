class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
   List<Integer> arr= new ArrayList<Integer>();
                   int len=nums.length/3;
HashMap <Integer,Integer> p= new HashMap<>();
for (int idx=0;idx<nums.length;idx++){ 
  if(p.containsKey(nums[idx])){  
    p.put(nums[idx],p.get(nums[idx])+1);
    }
    else{ 
      p.put(nums[idx], 1);
    }
}
int k=-1;

for (Map.Entry<Integer,Integer> e:p.entrySet()){ 
  if(e.getValue()>len){ 
    arr.add(e.getKey());

  }

}
    return arr; 

    }
}