class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int n=positions.length;
        int arr[][]=new int[n][2];
        HashMap<Integer,Integer> mp=new HashMap<>();

        for(int i=0;i<n;i++){
            mp.put(positions[i],i);
            arr[i][0]=positions[i];
            arr[i][1]=healths[i];
            healths[i]=-1;
            arr[i][1]=directions.charAt(i)=='R'?arr[i][1]:0-arr[i][1];
        }

        Arrays.sort(arr,(a,b)->{
            return a[0]-b[0];
        });


        Stack<ArrayList<Integer>> st=new Stack<>();

        for(int i=0;i<n;i++){
            int val=arr[i][1],chk=1;
            // while(!st.isEmpty() && st.peek().get(0)<0 && val>0){
            //     if(val==Math.abs(st.peek().get(0))){st.pop();chk=-1;break;}
            //     else if(val>Math.abs(st.peek().get(0))){st.pop();--val;}
            //     else{st.peek().set(0,Math.abs(st.peek().get(0))-1); chk=-1;break;}
            // }

            while(!st.isEmpty() && st.peek().get(0)>0 && val<0){
                if(Math.abs(val)==st.peek().get(0)){st.pop();chk=-1;break;}
                else if(Math.abs(val)>st.peek().get(0)){st.pop();++val;}
                else{st.peek().set(0,st.peek().get(0)-1); chk=-1;break;}
            }

            if(chk==1){
               ArrayList<Integer> a=new ArrayList<>();
               a.add(val);
               a.add(arr[i][0]);
               st.push(a);
            }

        
        }

    List<Integer> ans=new ArrayList<>();
    Long an[]=new Long[n];
    Arrays.fill(an,Long.MAX_VALUE);

    while(!st.isEmpty()){
        an[mp.get(st.peek().get(1))]=(long)st.pop().get(0);
    }

    for(long i:an){
        if(Math.abs(i)<=Integer.MAX_VALUE){ans.add(Math.abs((int)i));}
    }

    return ans;



    





    }
}