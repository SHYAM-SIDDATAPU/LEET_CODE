class Solution {
    public boolean isValid(String s) {
        Stack<Character> st= new Stack<>();
        for(char i:s.toCharArray()){
            if(i=='(' || i=='['|| i=='{') st.push(i);
            else{
                if(st.isEmpty()) return false;
                if(i==')' && st.pop()!='(') return false;
                else if(i==']' && st.pop()!='[') return false;
                else if(i=='}' && st.pop()!='{') return false;
            }
        }
       
        return st.isEmpty();
    }
}