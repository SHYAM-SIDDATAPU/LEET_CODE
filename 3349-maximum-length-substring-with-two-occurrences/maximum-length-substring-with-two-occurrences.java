class Solution {
    public int maximumLengthSubstring(String s) {
        int a[]= new int[26];
        int l=0,m=0;
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-'a']++;
            while(a[s.charAt(i)-'a']>2){
                a[s.charAt(l)-'a']--;
                l++;
            }
            m=Math.max(m,i-l+1);
        }
        return m;
    }
}