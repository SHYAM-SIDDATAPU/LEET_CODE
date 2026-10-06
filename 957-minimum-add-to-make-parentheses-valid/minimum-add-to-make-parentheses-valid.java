class Solution {
    public int minAddToMakeValid(String s) {
       Stack<Character> st= new Stack<>();
       for(char i:s.toCharArray())
        if(i=='(') st.push('(');
        else {
            if(!st.isEmpty() && st.peek()=='(') st.pop();
            else st.push(')');
        }
       return  st.size();
    }
}