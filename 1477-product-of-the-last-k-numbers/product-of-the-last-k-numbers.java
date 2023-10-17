class ProductOfNumbers {
 static ArrayList<Integer> a;
    public ProductOfNumbers() {
        a=new ArrayList<>();
    }
    
    public void add(int num) {
        if(num==0){a=new ArrayList<>();}
        else if(a.size()>0){ 
            int lst=a.get(a.size()-1)*num;
            a.add(lst);
        }else{ 
            a.add(num);
        }
    }
    
    public int getProduct(int k) { 
        if(a.size()<k){return 0;}
        else if(a.size()==k){return a.get(a.size()-1);}
        return  a.get(a.size()-1)/a.get(a.size()-k-1);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */