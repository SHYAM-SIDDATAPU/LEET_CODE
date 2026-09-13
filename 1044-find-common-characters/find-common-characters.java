class Solution {
    public List<String> commonChars(String[] words) {
        int h[]= new int[26];
        Arrays.fill(h,Integer.MAX_VALUE);
        for(String i:words){
            int t[]= new int[26];
            for(char j:i.toCharArray()){
                  t[j-'a']++;
            }
            for(int k=0;k<26;k++){
                h[k]=Math.min(h[k],t[k]);
            }
        }
        List<String> l= new ArrayList<>();
        for(int i=0;i<26;i++){
            int n=h[i];
            while(n!=0){
                l.add(String.valueOf((char)(i+'a')));
                n--;
            }
        }
        return l;
    }
}