class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int zc=0;
        int oc=0;
        int max=0;
        int r=0;
        while(r<s.length()){
            char c=s.charAt(r);
            if(c=='0') zc++;
            if(c=='1'){
                oc++;
                r++;
               while(r<s.length() && s.charAt(r)=='1'){
                oc++;
                r++;
               }
               max=Math.max(max,Math.min(zc,oc)*2);
               zc=1;
               oc=0;
            }
            r++;
        }
        return max;
    }
}