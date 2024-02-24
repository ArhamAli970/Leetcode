class Solution {
    static class node{
        int val,time;
        node(int val,int time){
            this.val=val;
            this.time=time;
        }
    }
    public List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson) {

     int min[]= new int[n+1];
     Arrays.fill(min,Integer.MAX_VALUE);

     ArrayList<node> arr[]= new ArrayList[n];

    for(int i=0;i<n;i++){
         arr[i]=new ArrayList<>();
    }

    for(int i=0;i<meetings.length;i++){
        arr[meetings[i][0]].add(new node(meetings[i][1],meetings[i][2]));
        arr[meetings[i][1]].add(new node(meetings[i][0],meetings[i][2]));

    }

    Queue<node> q=new LinkedList<>();
    HashSet<Integer> h1= new HashSet<>();


    q.add(new node(firstPerson,0));
    q.add(new node(0,0));

    min[0]=0;min[firstPerson]=0;

    while(!q.isEmpty()){
        node curr= q.remove();
        h1.add(curr.val);
        
        for(int i=0;i<arr[curr.val].size();i++){
            node cur= arr[curr.val].get(i);
            if(curr.time<=cur.time && min[cur.val]>cur.time){
                min[cur.val]=cur.time;
                q.add(new node(cur.val,cur.time));
            }
        }
    }


return new ArrayList<>(h1);


    }
}