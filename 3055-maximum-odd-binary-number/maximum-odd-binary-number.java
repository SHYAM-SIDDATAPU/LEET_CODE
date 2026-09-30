class Solution {
    public String maximumOddBinaryNumber(String s) {
        int c1=0;
        int c0=0;
        for(char i:s.toCharArray()){
            if(i=='1') c1++;
            else c0++;
        }
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<c1-1;i++) sb.append('1');
        for(int i=0;i<c0;i++) sb.append('0');
        sb.append('1');
        return sb.toString();
    }
}