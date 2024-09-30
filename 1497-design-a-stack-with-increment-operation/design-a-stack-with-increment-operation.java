class CustomStack {
static int arr[];
static int j;
    public CustomStack(int maxSize) {
        arr=new int[maxSize];
        j=-1;
    }
    
    public void push(int x) {
        j++;
        if(j==arr.length){j--;return;}
        arr[j]=x;
    }
    
    public int pop() {
        if(j==-1){return -1;}
        int ele=arr[j];
        j--;
        return ele;
    }
    
    public void increment(int k, int val) {
        for(int i=0;i<Math.min(k,arr.length);i++){
            arr[i]+=val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */