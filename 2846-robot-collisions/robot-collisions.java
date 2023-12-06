class Solution {
    
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        
        int n=healths.length;
        TreeMap<Integer,ArrayList<Integer>> mp = new TreeMap<>();
        
        for(int i=0;i<n;i++){ 
            
            mp.put(positions[i],new ArrayList<>());
            mp.get(positions[i]).add(i);
            mp.get(positions[i]).add(healths[i]);
            int dir= directions.charAt(i)=='R'?1:-1;
            mp.get(positions[i]).add(dir);
        
        }
        
        
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>(); 
        for(Map.Entry<Integer,ArrayList<Integer>> e:mp.entrySet()){ 
           arr.add(e.getValue());
        }
        
        // System.out.print(mp);
        
        Stack<ArrayList<Integer>> st=new Stack<>();
        
        for(int i=n-1;i>=0;i--){ 
            
  
            if((st.isEmpty()) || (arr.get(i).get(2)==st.peek().get(2)) || arr.get(i).get(2)==-1){ 
                st.push(arr.get(i));
            }
            
            else if(arr.get(i).get(2)==1 && st.peek().get(1)>arr.get(i).get(1)){
                ArrayList<Integer> a= st.pop();
                int val=a.get(1);
                a.set(1,val-1);
                st.push(a);
            }

             else if(arr.get(i).get(2)==1 && st.peek().get(1)==arr.get(i).get(1)){
               st.pop();
            }

            else{ 
                int hlth=arr.get(i).get(1);
                while(!st.isEmpty() && st.peek().get(2)!=1 && hlth>st.peek().get(1)){ 
                    st.pop();
                    hlth--;
                }

                if(st.isEmpty() || st.peek().get(2)==1){ 
                     arr.get(i).set(1,hlth);
                     st.push(arr.get(i));
                }
                else if(hlth==st.peek().get(1)){ 
                    st.pop();
                }
                else if (hlth<st.peek().get(1)){ 
                ArrayList<Integer> a= st.pop();
                int val=a.get(1);
                a.set(1,val-1);
                st.push(a);
                }
            }


        
        
        }
        
        
        arr=new ArrayList<>();
        // System.out.print(st.size());
        while(!st.isEmpty()){ 
        arr.add(st.pop());
        }
        
        Collections.sort(arr,(e1,e2)->{ 
          return e1.get(0)-e2.get(0);
        });
            
            
        
            
        List<Integer> ans= new ArrayList<>();
        
        for(int i=0;i<arr.size();i++){ 
          ans.add(arr.get(i).get(1));
        }
        
        return ans;
        
        
        
        
        
    }
}