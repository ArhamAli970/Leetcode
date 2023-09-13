class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
    int n=nums.length;
    LinkedList<Integer> l= new LinkedList<>();
    int i=0; 
    for(i=0;i<n;i++){ 
       
       if(l.size()>0 && nums[i]<l.peekLast()){ 
         int cnt=n-i;
         while(!l.isEmpty() &&  l.size()+cnt>k &&  nums[i]<l.peekLast()){ 
            l.removeLast();
         }          
       }
if(l.size()<k){
l.add(nums[i]);
}
    }


// System.out.print(l);

int arr[]= new int[k];
i=0;
while(!l.isEmpty()){ 
  arr[i++]=l.removeFirst();
}

return arr;


    }
}