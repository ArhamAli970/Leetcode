class Solution {
    public int largestRectangleArea(int[] heights) {

int n=heights.length;

int left[]=new int[n];
int right[]=new int[n];

Stack<Integer> st= new Stack<>();

for(int i=n-1;i>=0;i--){ 
    while(!st.isEmpty() && heights[i]<=heights[st.peek()]){ 
        st.pop();
    }
    left[i]=!st.isEmpty()?st.peek()-i-1:n-i-1;
    st.push(i);
}

st=new Stack();

for(int i=0;i<n;i++){ 
    while(!st.isEmpty() && heights[i]<=heights[st.peek()]){ 
        st.pop();
    }
    right[i]=!st.isEmpty()?i-st.peek()-1:i;
    st.push(i);
}

int max=0;
for(int i=0;i<n;i++){ 
   max=Math.max(max,(left[i]+right[i]+1)*heights[i]);
}

return max;

    }
}