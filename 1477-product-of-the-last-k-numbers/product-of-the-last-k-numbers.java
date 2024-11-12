class ProductOfNumbers {
    static ArrayList<Integer>arr;
    public ProductOfNumbers() {
        arr=new ArrayList<>();
    }
    
    public void add(int num) {
        if(num==0){arr=new ArrayList<>();}
        else{
            int lst=arr.size()>0?arr.get(arr.size()-1):1;
            arr.add(num*lst);
        }
    }
    
    public int getProduct(int k) {

        if(k>arr.size()){return 0;}
        else if(k==arr.size()){return arr.get(arr.size()-1);}
        
            int n=arr.size();
            return arr.get(n-1)/arr.get(n-k-1);
        
        // return -1;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */