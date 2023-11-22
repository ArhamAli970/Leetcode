class Solution {
    static class node{ 
        int i,j,val;
        node(int i,int j,int val){
        this.i=i;this.j=j;this.val=val;
        }

    }
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        int cnt=0;
         for(List<Integer> a:nums){
            cnt+=a.size();
         }
         int ans[]=new int[cnt];
           
        Queue<node> q= new LinkedList<>();
        q.add(new node(0,0,nums.get(0).get(0)));
        int idx=0;

        while(!q.isEmpty()){ 
            int size=q.size();
            for(int k=0;k<size;k++){ 
                node curr=q.remove();
                int i=curr.i,j=curr.j;
                ans[idx++]=curr.val;
                if(i+1<nums.size() && nums.get(i+1).size()>j && nums.get(i+1).get(j)!=-1){ 
                    q.add(new node(i+1,j,nums.get(i+1).get(j)));
                    nums.get(i+1).set(j,-1);
                } 
                if(nums.get(i).size()>j+1 && nums.get(i).get(j+1)!=-1){ 
                    q.add(new node(i,j+1,nums.get(i).get(j+1)));
                    nums.get(i).set(j+1,-1);
                }
               
            }
        }


return ans;
    }
}