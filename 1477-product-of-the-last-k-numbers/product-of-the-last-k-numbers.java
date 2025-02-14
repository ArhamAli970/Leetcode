class ProductOfNumbers {
    static ArrayList<Integer>arr;
    static int i;
    public ProductOfNumbers() {
        i=-1;
        arr=new ArrayList<>();
    }
    
    public void add(int num) {
        if(num==0){i=-1;}
        else{
            i++;
            int lst=i-1>=0?arr.get(i-1):1;
            if(i>=arr.size()){arr.add(num*lst);}
            else{arr.set(i,num*lst);}
        }
    }
    
    public int getProduct(int k) {
        int n=arr.size();
        if(i-k<-1){return 0;}
        else if(i-k==-1){return arr.get(i);}
        return arr.get(i)/arr.get(i-k);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */