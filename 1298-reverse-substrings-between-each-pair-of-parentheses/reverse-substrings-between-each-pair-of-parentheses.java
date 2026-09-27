class Solution {
    public String reverseParentheses(String s) {
      Stack<Character> st= new Stack<>();
      for(char c:s.toCharArray()){
        if(c==')'){
           List<Character> t= new ArrayList<>();
            while(st.peek()!='(')
                t.add(st.pop());
            st.pop();
            for(char i:t)
                st.push(i);
        }
        else
        st.push(c);
      }
      StringBuilder s1= new StringBuilder();
      while(!st.isEmpty())
         s1.append(st.pop());
      return s1.reverse().toString();
       
    }
}