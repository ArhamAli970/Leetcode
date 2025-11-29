class FreqStack {
    static ArrayList<Stack<Integer>> st;
    static HashMap<Integer,Integer> mp;
    static int idx;
    public FreqStack() {
        st=new ArrayList<>();
        mp=new HashMap<>();
    }
    
    public void push(int val) {
        mp.put(val,mp.getOrDefault(val,0)+1);
        int value=mp.get(val)-1;
        idx=Math.max(idx,value);
        if(st.size()<=idx){st.add(new Stack<>());}
        st.get(value).push(val);
    }
    
    public int pop() {
            Stack<Integer> curr_st=st.get(idx);
            int ele=curr_st.pop();
            mp.put(ele,mp.get(ele)-1);
            if(curr_st.isEmpty()){idx--;}  
            return ele;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */