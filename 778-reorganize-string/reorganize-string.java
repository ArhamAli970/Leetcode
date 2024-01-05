class Solution {

static class node implements Comparable <node>{ 
    int idx;
    int cnt;
    node(int idx,int cnt){
        this.idx=idx;this.cnt=cnt;
    }

    public int compareTo(node p){ 
        return p.cnt-this.cnt;
    }
}

    public String reorganizeString(String s) {
char ch[]= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};  

int arr[]= new int[26];
PriorityQueue<node> pq= new PriorityQueue<>();

int n=s.length();

for(int i=0;i<n;i++){ 
++arr[s.charAt(i)-'a'];
}


StringBuilder sb= new StringBuilder();
for(int i=0;i<26;i++){ 
    if(arr[i]>0){ 
        pq.add(new node(i,arr[i]));
    }
}

while(pq.size()>1){ 
    node curr1=pq.remove();
    node curr2=pq.remove();

    sb.append(ch[curr1.idx]);
    sb.append(ch[curr2.idx]);

    if(curr1.cnt>1){
        pq.add(new node(curr1.idx,curr1.cnt-1));
    }
    if(curr2.cnt>1){
        pq.add(new node(curr2.idx,curr2.cnt-1));
    }

}

if(pq.size()==1){
    node curr=pq.remove();
    if(curr.cnt>1){return "";}
    sb.append(ch[curr.idx]);
}

return sb.toString();




    }
}