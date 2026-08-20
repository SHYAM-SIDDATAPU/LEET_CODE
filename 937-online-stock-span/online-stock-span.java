class StockSpanner {
             Stack<Integer> st;
              List<Integer> l;
               int i;
    public StockSpanner() {
        st= new Stack<>();
        l= new ArrayList<>();
        i=-1; 
    }
    
    public int next(int price) {
         i++;
        l.add(price);
        while(!st.isEmpty() && l.get(st.peek())<=price){
            st.pop();
        }
        int j=-1;
        if(!st.isEmpty()) j=st.peek();
        st.push(i);
        return i-j;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */