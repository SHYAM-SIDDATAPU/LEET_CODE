class Solution {
    public long subArrayRanges(int[] nums) {
        return maxs(nums)- mins(nums);
    }
    static long mins(int[] a){
        int lm[]=new int[a.length];
        int rm[]= new int[a.length];
        Stack<Integer> st= new Stack<>();
        for(int i=a.length-1;i>=0;i--){
           while(!st.isEmpty() && a[st.peek()]>= a[i]) st.pop();
           rm[i]=st.isEmpty()?a.length:st.peek();
           st.push(i);
        }
        st.clear();
        for(int i=0;i<a.length;i++){
           while(!st.isEmpty() && a[st.peek()]> a[i]) st.pop();
           lm[i]=st.isEmpty()?-1:st.peek();
           st.push(i);
        }
        long s=0;
        for(int i=0;i<a.length;i++){
            s+=(long)(rm[i]-i)*(i-lm[i])*a[i];
        }
        return s;

    }
    static long maxs(int[] a){
        int lm[]=new int[a.length];
        int rm[]= new int[a.length];
        Stack<Integer> st= new Stack<>();
        for(int i=a.length-1;i>=0;i--){
           while(!st.isEmpty() && a[st.peek()]<= a[i]) st.pop();
           rm[i]=st.isEmpty()?a.length:st.peek();
           st.push(i);
        }
        st.clear();
        for(int i=0;i<a.length;i++){
           while(!st.isEmpty() && a[st.peek()]< a[i]) st.pop();
           lm[i]=st.isEmpty()?-1:st.peek();
           st.push(i);
        }
        long s=0;
        for(int i=0;i<a.length;i++){
            s+=(long)(rm[i]-i)*(i-lm[i])*a[i];
        }
        return s;

    }
}