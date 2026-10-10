class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder sb= new StringBuilder(s);
        for(int i=0;i<sb.length();i++){
            if(sb.toString().equals(goal)) return true;
            sb.append(sb.charAt(0));
            sb.deleteCharAt(0);
        }
        return false;
    }
}