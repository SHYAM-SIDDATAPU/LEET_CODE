class Solution {
    public int[] evenOddBit(int n) {
        int c=0;
        int e=0,o=0;
        while(n!=0){
           int i=n&1;
           if(i==1){
            if(c%2==0) e++;
            else o++;
           }
           c++;
           n=n>>1;
        }
        return new int[]{e,o};
    }
}