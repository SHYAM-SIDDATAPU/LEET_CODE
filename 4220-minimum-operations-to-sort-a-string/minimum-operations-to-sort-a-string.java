class Solution {
    public int minOperations(String s) {
         boolean t=false;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)<=s.charAt(i)) t= true;
            else{
                t= false;
                break;
            }
        }
        if(t|| s.length()==1) return 0;
        if(s.length()==2) return -1;
        char min='z',max='a';
        for(char i:s.toCharArray()){
            if(min>i) min=i;
            if(max<i) max=i;
        }
        if(s.charAt(0)==min || s.charAt(s.length()-1)==max) return 1;
        for(int i=1;i<s.length()-1;i++)
            if(s.charAt(i)==min || s.charAt(i)==max) return 2;
        return 3;
    }
}