class SnapshotArray {
    static int sn;
    static ArrayList<ArrayList<Integer>> arr[];
    public SnapshotArray(int length) {
        arr=new ArrayList[length];
        sn=0;
        for(int i=0;i<length;i++){arr[i]=new ArrayList<>();}
    }
    
    public void set(int index, int val) {
        if( arr[index].size()>0 && sn==arr[index].get(arr[index].size()-1).get(0)){
            arr[index].get(arr[index].size()-1).set(1,val);
            return;
        }
        arr[index].add(new ArrayList<>());
        arr[index].get(arr[index].size()-1).add(sn);
        arr[index].get(arr[index].size()-1).add(val);
    }
    
    public int snap() {
        sn++;
        return sn-1;
    }
    
    public int get(int index, int snap_id) {
        ArrayList<ArrayList<Integer>> curr=arr[index];
        int st=0,end=curr.size()-1;
        int ans=0;

        while(st<=end){
            int mid=(st+end)/2;
            int id=curr.get(mid).get(0);
            if(snap_id>=id){
                ans=curr.get(mid).get(1);
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;

    }
}

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */