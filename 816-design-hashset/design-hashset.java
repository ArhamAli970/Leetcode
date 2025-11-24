class MyHashSet {
// have array of linkedlist 
// modulo operation 

// when collision of data then we can do two things 
// 1) seperate chaing  - vector of list 
// 2)open addressing - jagah nhi hai tere array index parr then check for next empty index .
// but there are problems , when we remove it 


// we will take sepreate chaining but the problem is if all have modulo at single index then seraching of time is O(n)

// here is load factor - n elements , size of bucket M 
// n/m>  .75 then rehash    75 elemen / 100 buckets(arry sie) =.75
//  rehashing  double size of buckets 2*M array size

// now  75/200=.37 

static class ld{
    int ele;
    ld next;
    public ld(int ele){
        this.ele=ele;
        this.next=null;
    }
}

        static ld arr[];
        static int n;
    public MyHashSet() {
        n=1000;
        arr=new ld[n];

    }
    
    public void add(int key) {
        int idx=key%n;
        if(arr[idx]==null){arr[idx]=new ld(key);return;}
        ld ptr=arr[idx];
        while(ptr!=null){
            if(ptr.ele==key){return;}
            if(ptr.next==null){break;}
            ptr=ptr.next;
        }
        ptr.next=new ld(key);

    }
    
    // 1  
    public void remove(int key) {
        int idx=key%n;
        if(arr[idx]==null){return;}
        if(arr[idx].ele==key){arr[idx]=arr[idx].next;return;}
        ld curr=arr[idx],prev=null;
        while(curr!=null){
            if(curr.ele==key){
                prev.next=curr.next;
                curr.next=null;
                break;
            }
            prev=curr;
            curr=curr.next;
        }
    }
    
    public boolean contains(int key) {
        int idx=key%n;
        ld curr=arr[idx];
        while(curr!=null){
            if(curr.ele==key){return true;}
            curr=curr.next;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */