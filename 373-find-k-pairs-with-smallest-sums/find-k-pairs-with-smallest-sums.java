class Solution {
    static class node implements Comparable<node>{
        int i1,i2;long sum;
        node(int i1,int i2,long sum){
            this.i2=i2;
            this.i1=i1;
            this.sum=sum;
        }

        public int compareTo(node p){
            if(p.sum==this.sum){
                if(p.i1==this.i1){
                    return this.i2-p.i2;
                }
                return this.i1-p.i1;
            }
            return Long.compare(this.sum,p.sum);
        }

    }
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> ans= new ArrayList<>();
        PriorityQueue<node> pq= new PriorityQueue<>();
        int n=nums1.length;

        for(int i=0;i<n;i++){
            pq.add(new node(i,0,nums1[i]+nums2[0]));
        }


        while(k>0){

            node curr=pq.remove();
            int x=curr.i1,y=curr.i2;
            ans.add(new ArrayList<>());
            ans.get(ans.size()-1).add(nums1[x]);
            ans.get(ans.size()-1).add(nums2[y]);
            if(y+1!=nums2.length){
                pq.add(new node(x,y+1,nums1[x]+nums2[y+1]));
            }
            k--;
        }

        return ans;



    }
}