class Solution {
    public int rearrangeCharacters(String s, String target) {
        int []f= new int[26];
        int []t= new int[26];
        for(char i:s.toCharArray())
            f[i-'a']++;
        for(char i:target.toCharArray())
            t[i-'a']++;
        int min=101;
        for(char r:target.toCharArray()) min=Math.min(min,f[r-'a']/t[r-'a']);
        return min;
    }
}