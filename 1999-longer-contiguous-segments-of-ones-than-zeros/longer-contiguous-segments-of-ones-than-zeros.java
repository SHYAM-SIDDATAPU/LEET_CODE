class Solution {
    public boolean checkZeroOnes(String s) {
        int count1=0,count0=0,max0=0,max1=0;
        for(char i:s.toCharArray()){
            if(i=='0'){
               count0++;
               count1=0;
            }
            else{
               count1++;
               count0=0;
            }
            max0=Math.max(max0,count0);
            max1=Math.max(max1,count1); 
        }
        return max1>max0;
    }
}