class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb= new StringBuilder();
        int count=0;
        for(char i:s.toCharArray())
            if(i=='('){
             count++;
             if(count>1) sb.append(i);
            }
            else {
                count--;
                if(count>=1) sb.append(i);
            }
        return sb.toString();
    }
}