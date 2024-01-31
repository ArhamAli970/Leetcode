class Solution {
    public int[] dailyTemperatures(int[] temperatures) {  
        int n=temperatures.length;
      Stack<Integer> st= new Stack(); 
      st.push(n-1);
      int arr[]= new int[n];
      
      for (int i=n-2;i>=0;i--){  
          while(!st.isEmpty() && temperatures[i]>=temperatures[st.peek()]){ 
              st.pop();
          }
          if(st.isEmpty()){arr[i]=0;}
          else{arr[i]=st.peek()-i;}
          st.push(i);
      }
      return arr;
    }
}