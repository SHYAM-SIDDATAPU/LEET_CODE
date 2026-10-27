class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder sb= new StringBuilder();
        for(char i:s.toCharArray()){
            sb.append("0".repeat(8 - Integer.toBinaryString(i).length()));
            sb.append(Integer.toBinaryString(i));
        } 
      return sb.toString().equals(sb.reverse().toString());  
    }
}