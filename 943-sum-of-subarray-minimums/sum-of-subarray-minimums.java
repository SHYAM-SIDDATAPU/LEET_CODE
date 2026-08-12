class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n= arr.length;
        long mod= 1000000007;
        Stack<Integer> st= new Stack<>();
        int rm[]= new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i])
            st.pop();
            rm[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }
        st.clear();
        int lm[]= new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i])
            st.pop();
            lm[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        long s=0;
        for(int i=0;i<n;i++){
            long l=(((long)rm[i]-i)*(i-lm[i])*arr[i])%mod;
            s=(s+l)%mod;
        }
        return (int)s;
    }
}