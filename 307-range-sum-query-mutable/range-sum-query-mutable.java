class NumArray {
      static int n;
      static int st[];

    public static int buildSeg(int s, int e, int idx, int arr[]) {
        if (s == e) {
            st[idx] = arr[s];
            return st[idx];
        }
        int mid = (s + e) / 2;
        int lft = buildSeg(s, mid, 2 * idx + 1, arr);
        int rht = buildSeg(mid + 1, e, 2 * idx + 2, arr);

        st[idx] = lft + rht;
        return st[idx];
    }
    public NumArray(int[] arr) {
        n = arr.length;
        st = new int[n * 4];
        buildSeg(0, n - 1, 0, arr);
    }


      public static int Update(int s, int e, int idx, int targetIdx, int val) {
        if (s == e) {
            int curr=val-st[idx];
            st[idx] = val;
            return curr;
        }
        int mid = (s + e) / 2;

        int newVal = 0;
        if (mid >= targetIdx) {
            newVal = Update(s, mid, 2 * idx + 1, targetIdx, val);
        } else {
            newVal = Update(mid + 1, e, 2 * idx + 2, targetIdx, val);
        }
        st[idx] += newVal;
        return newVal;
    }

    public void update(int index, int val) {
        Update(0, n - 1, 0, index, val);
    }

      public static int getSum(int q1, int q2, int s, int e,int idx) {
        int mid = (s + e) / 2;
        if (s >= q1 && e <= q2) {
            return st[idx];
        } else if (e < q1 || s > q2) {
            return 0;
        }

        int lft = getSum(q1, q2, s, mid, 2 * idx + 1);
        int rht = getSum(q1, q2, mid + 1, e,2 * idx + 2);
        return lft + rht;

    }
    
    
    
    public int sumRange(int left, int right) {
        return getSum(left, right, 0, n - 1,0);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */