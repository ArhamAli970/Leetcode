class MyCalendar {
static ArrayList<ArrayList<Integer>> arr;
    public MyCalendar() {
        arr=new ArrayList<>();
    }
    
    public boolean book(int st, int end) {
    
        for(int i=0;i<arr.size();i++){
            if(st>=arr.get(i).get(0) && st<arr.get(i).get(1)){return false;}
            if(end>arr.get(i).get(0) && end<arr.get(i).get(1)){return false;}
            if(st<=arr.get(i).get(0) && end>=arr.get(i).get(1)){return false;}
        }

            arr.add(new ArrayList<>());
            arr.get(arr.size()-1).add(st);
            arr.get(arr.size()-1).add(end);
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */