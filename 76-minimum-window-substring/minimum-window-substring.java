class Solution {
    public String minWindow(String s, String t) {
        int f[]= new int[256];
        for(char i:t.toCharArray()){
            f[i]++;
        }
        int i=0,j=0,si=-1,c=0,minl=100000;
        while(j<s.length()){
            if(f[s.charAt(j)]>0) c++;
            f[s.charAt(j)]--;
            while(c==t.length()){
                if(j-i+1<minl){
                    minl=j-i+1;
                    si=i;
                }
                f[s.charAt(i)]++;
                if(f[s.charAt(i)]>0) c--;
                i++;
            }
            j++;
        }
        return si==-1?"":s.substring(si,si+minl);
    }
}