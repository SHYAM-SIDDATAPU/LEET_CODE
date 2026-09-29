class Solution {
    public int characterReplacement(String s, int k) {
        int i=0,j=0,maxl=0,maxf=0;
        int f[]= new int[26];
        while(j<s.length()){
            f[s.charAt(j)-'A']++;
            maxf=Math.max(maxf,f[s.charAt(j)-'A']);
            if((j-i+1)-maxf>k){
                f[s.charAt(i)-'A']--;
                i++;
            }
            if((j-i+1)-maxf<=k)
                maxl=Math.max(maxl,j-i+1);
            j++;
        }
        return maxl;
    }
}