class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st= new Stack<>();
        for(char i:num.toCharArray()){
             while(!st.isEmpty() && k!=0 && st.peek()-'0'> i-'0'){
               st.pop();
               k--;
             }
             st.push(i); 
        }
        while(k!=0){
            st.pop();
            k--;
        }
        if(st.isEmpty()) return "0";
        StringBuilder sb= new StringBuilder();
        while(!st.isEmpty())
        sb.append(String.valueOf(st.pop()));
        sb.reverse();
        int j=0;
        for(int i=0;i<sb.length();i++){
         if( sb.charAt(i)=='0')
         j++;
         else break;
        }
         if (j == sb.length()) {
            return "0";
        }
        return sb.substring(j,sb.length()).toString();

          
    }
}