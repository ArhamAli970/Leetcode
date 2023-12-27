class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> st= new Stack<>();
        int n=asteroids.length;
        int j=n-1;

        while(j>=0){ 
            if(asteroids[j]<0){ 
                st.push(asteroids[j]);
            }else{ 
                boolean eq=false;
                while(!st.isEmpty() && st.peek()<0 && asteroids[j]>=Math.abs(st.peek())){ 

                    if(asteroids[j]==Math.abs(st.peek())){eq=true;st.pop(); break;}
                    else{st.pop();}

                }
                if(!eq && (st.isEmpty() || st.peek()>=0)){st.push(asteroids[j]);}
            }
            j--;
        }
        int i=0;

        int[] ans=new int[st.size()];

        while(!st.isEmpty()){ 
            ans[i++]=st.pop();
        }

return ans;

    }
}