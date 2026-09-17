class Solution {
    public int minFlips(int a, int b, int c) {
        int f=0;
       while(a>0 | b>0 | c>0){
         int a1=a&1;
         int b1=b&1;
         int c1=c&1;
         if(c1==1){
            if((a1|b1)==0){
                f++;
            }
         }
         else{
            if(a1==1) f++;
            if(b1==1) f++;
         }
         a=a>>1;
         b=b>>1;
         c=c>>1;
       }
       return f;
    }
}