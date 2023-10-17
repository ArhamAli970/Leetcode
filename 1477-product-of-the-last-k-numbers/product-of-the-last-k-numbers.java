class ProductOfNumbers {
 static ArrayList<Integer> a;
    public ProductOfNumbers() {
        a=new ArrayList<>();
    }
    
    public void add(int num) {
        a.add(num);
    }
    
    public int getProduct(int k) {
        int prod=1;
        int i=a.size()-1,cnt=0;
        while(cnt!=k){ 
            cnt++;
            prod*=a.get(i--);
        }
        
        return prod;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */