class Solution {
    public int largestRectangleArea(int[] heights) {
        int n= heights.length;
        int ls[]= new int[n];
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<n;i++){
              while(!st.isEmpty() && heights[st.peek()]>=heights[i])
              st.pop();
              ls[i]=st.isEmpty()?-1:st.peek();
              st.push(i);
        }
        st.clear();
        int rs[]= new int[n];
        for(int i=n-1;i>=0;i--){
              while(!st.isEmpty() && heights[st.peek()]>=heights[i])
              st.pop();
              rs[i]=st.isEmpty()?n:st.peek();
              st.push(i);
        }
        int m=0;
        for(int i=0;i<n;i++){
            m= Math.max(m,(rs[i]-ls[i]-1)*heights[i]);
        }
        return m;
    }
}