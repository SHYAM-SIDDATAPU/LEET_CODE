class Solution {
    public int minOperations(String s) {
        int c1=0,c2=0;
        for(int i=0;i<s.length();i++){
            char ch1=i%2==0?'0':'1';
            char ch2=i%2==0?'1':'0';
            if(ch1!=s.charAt(i)) c1++;
            if(ch2!=s.charAt(i)) c2++;
        }
       return Math.min(c1,c2);
    }
}